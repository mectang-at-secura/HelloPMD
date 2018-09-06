package com.ap.pmd.rule.custom;

import net.sourceforge.pmd.lang.java.ast.ASTWhileStatement;
import net.sourceforge.pmd.lang.java.rule.AbstractJavaRule;


public class WhileLoopsMustUseBracesRule extends AbstractJavaRule {

	@Override
	public Object visit(ASTWhileStatement node, Object data) {
		System.out.println("Hello, World!");
		return data;
	}

	

}
