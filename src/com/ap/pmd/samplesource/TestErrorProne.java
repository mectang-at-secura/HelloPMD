package com.ap.pmd.samplesource;


/**
 * <p>
 * Test the PMD built-in rule: category/jav/errorprone.xml/EmptyCatchBlock
 * </p>
 * @author me09378
 *
 */
public class TestErrorProne {

	public void emptyTryBlock() {
		try {
			
		}catch(Exception e) {
			e.printStackTrace(System.out);
		}
	}
	
	public void emptyCatchBlock() {
		try {
			System.out.println("empty catch block");
		}catch(Exception e) {
			
		}
	}
}
