package com.secura.pmd;


/**
 * <p>
 * Test the PMD built-in rule: category/jav/errorprone.xml/EmptyCatchBlock
 * </p>
 * @author me09378
 *
 */
public class TestEmptyTryBlock {

	public void emptyCatchBlockMethod() {
		try {
			
		}catch(Exception e) {
			e.printStackTrace(System.out);
		}
	}
}
