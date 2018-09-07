package com.ap.pmd.unittest;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.junit.Test;

import com.beust.jcommander.JCommander;

import net.sourceforge.pmd.cpd.CPD;
import net.sourceforge.pmd.cpd.CPDCommandLineInterface;
import net.sourceforge.pmd.cpd.CPDConfiguration;


/**
 * <p>
 * Sample command to run CPD
 * <br/>
 * 
 * </p>
 * @author me09378
 * @see <a href="https://pmd.github.io/pmd-6.7.0/pmd_userdocs_cpd.html#cli-options">CPD CLI Options</a>
 */
public class TestRunCPD {
	private static final String PROGRAM_NAME = "cpd";

	
	@Test
	public void testRunCPDAgainstCurrentSource() {
		String[] args = "--minimum-tokens 100 --files ./src --language java".split(TestRunPMD.WHITE_SPACE);
		runCPD(args);
	}

	
	/**
	 * <p>
	 * Run the CPD command against CLI options <code>args</code>
	 * </p>
	 * @param args
	 * @see {@link CPD#main}
	 * @see {@link CPDCommandLineInterface#main}
	 */
	private static final void runCPD(String[] args) {
		CPDConfiguration arguments = new CPDConfiguration();
        JCommander jcommander = new JCommander(arguments);
        jcommander.setProgramName(PROGRAM_NAME);
        jcommander.parse(args);
        arguments.postContruct();
        CPDConfiguration.setSystemProperties(arguments);
        CPD cpd = new CPD(arguments);
        CPDCommandLineInterface.addSourceFilesToCPD(cpd, arguments);

        cpd.go();
        try {
			if (arguments.getCPDRenderer() == null) {
				// legacy writer
				System.out.println(arguments.getRenderer().render(cpd.getMatches()));
			} else {
				arguments.getCPDRenderer().render(cpd.getMatches(), new BufferedWriter(new OutputStreamWriter(System.out)));
			} 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
