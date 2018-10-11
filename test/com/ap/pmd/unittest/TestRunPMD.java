package com.ap.pmd.unittest;


import org.junit.Ignore;
import org.junit.Test;

import net.sourceforge.pmd.PMD;


/**
 * <p>
 * Sample script to run PMD.
 * </p>
 * @author me09378
 * @see <a href="https://pmd.github.io/pmd-6.7.0/pmd_userdocs_cli_reference.html">PMD CLI Options</a>
 */
public class TestRunPMD {

	public static final String WHITE_SPACE = "\\s+";
	
	
	
	//@Ignore("PMD XML RUleset for AgencyPortal")
	@Test
	public void testRunCustomXMLRulSetAgencyPortal() {
		String[] args = new String[] {
			"-d",
			"\"C:/VCS/Git/github.com/SECURAInsurance/AgencyPortal/Web Root/WEB-INF/autob/pagelibrary/policyCoveragesPage.xml\"",
			"-R",
			"rules/ap-ruleset-xml.xml",
			"-no-cache",
			"-f",
			"text"
		};
		PMD.run(args);
	}
	
	@Ignore("PMD Ruleset for AgencyPortal")
	@Test
	public void testRunCustomRuleSetAgencyPortal() {
		String argStr = "-d ./src/ -R rules/ap-ruleset.xml -auxclasspath ./bin/ -no-cache -f text";
		PMD.run(argStr.split(WHITE_SPACE));
	}
	
	@Ignore("Custom rulset defined with XPath")
	@Test
	public void testRunCustomRuleSetXPath() {
		String argStr = "-d ./src/ -R rules/custom-ruleset-xpath.xml -auxclasspath ./bin/ -no-cache -f text";
		PMD.run(argStr.split(WHITE_SPACE));
	}
	
	@Ignore("Custom ruleset defined with Java")
	@Test
	public void testRunCustomRuleSetJava() {
		String argStr = "-d ./src/ -R rules/custom-ruleset-java.xml -auxclasspath ./bin/ -no-cache -f text";
		PMD.run(argStr.split(WHITE_SPACE));
	}
	
	@Ignore("sample ruleset")
	@Test
	public void testRunPMDAgainstSrc() {
		String[] args = "-d ./src/ -R rules/sample-ruleset.xml -auxclasspath ./bin/ -cache pmd-cache -f text".split(WHITE_SPACE);
		//PMD.main(args);	//System.exit() will result into JUnit Test runner yielding a gray bar
		PMD.run(args);
	}
	
	@Ignore("Run PMD with -no-cache")
	@Test
	public void testRunPMDAgainstSrcWithoutCache() {
		String[] args = "-d ./src/ -R rules/sample-ruleset.xml -auxclasspath ./bin/ -no-cache -f text".split(WHITE_SPACE);
		//PMD.main(args);	//System.exit() will result into JUnit Test runner yielding a gray bar
		PMD.run(args);
	}

}
