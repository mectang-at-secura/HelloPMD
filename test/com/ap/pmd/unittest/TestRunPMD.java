package com.ap.pmd.unittest;


import org.junit.Ignore;
import org.junit.Test;

import net.sourceforge.pmd.PMD;


public class TestRunPMD {

	private static final String WHITE_SPACE = "\\s+";
	
	
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
	
	@Ignore("customrules.xml")
	@Test
	public void testRunCustomRuleSetJava_Lucky() {
		String argStr = "-d ./src/ -R rules/customrules.xml -auxclasspath ./bin/ -no-cache -f text";
		PMD.run(argStr.split(WHITE_SPACE));
	}
	
	//@Ignore("sample ruleset")
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
