package com.ap.pmd.unittest;


import org.junit.Test;

import net.sourceforge.pmd.PMD;


public class TestRunPMD {

	private static final String WHITE_SPACE = "\\s+";
	
	@Test
	public void testRunPMDAgainstSrc() {
		String[] args = "-d ./src/ -R rules/sample-ruleset.xml -auxclasspath ./bin/ -cache pmd-cache -f text".split(WHITE_SPACE);
		//PMD.main(args);	//System.exit() will result into JUnit Test runner yielding a gray bar
		PMD.run(args);
	}

}
