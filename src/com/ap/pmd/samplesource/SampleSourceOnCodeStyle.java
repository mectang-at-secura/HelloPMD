package com.ap.pmd.samplesource;


public class SampleSourceOnCodeStyle {

	//Note: From 6.2.0 on, this rule supersedes WhileLoopMustUseBraces, ForLoopMustUseBraces, IfStmtMustUseBraces,
    //and IfElseStmtMustUseBraces.
	public void testWhileLoopMustUseBraces() {
		int i= 1;
		while(0 < i)
			--i;
	}
	
	public void testForLoopMustUseBraces() {
		int j = 0;
		for(int i = 0; i < 1; ++i) 
			++j;
	}
	
	public void testIfStmtMustUseBraces() {
		int i = 0;
		if(i < 1)
			++i;
	}
	
	public void testIfElseStmtMustUseBraces() {
		int i = 0;
		if(i < 1)
			++i;
		else
			--i;	
	}
	//=====================================
}
