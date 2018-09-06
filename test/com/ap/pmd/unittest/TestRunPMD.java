package com.ap.pmd.unittest;


import java.util.Arrays;

import org.junit.jupiter.api.Test;

import net.sourceforge.pmd.PMD;


class TestRunPMD {

	private static final String WHITE_SPACE = "\\s+";
	
	@Test
	void testRunPMDAgainstSrc() {
		String[] args = "-d ./src/ -R rules/sample-ruleset.xml -auxclasspath ./bin/ -cache pmd-cache -f text".split(WHITE_SPACE);
		//PMD.main(args);	//System.exit() will result into JUnit Test runner yielding a gray bar
		PMD.run(args);
	}

}
