package com.ap.pmd.samplesource;

public class SampleSourceOnAPCustomRuleset {
	final String TEST = "test";
	final static String TEST2 = "test2";
	
	public void testEmptyIf() {
		String test = "";
		if (test.isEmpty()) {

		}
	}

	public void testEmptySwith() {
		String test = "";
		switch (test) {

		}
	}

	public void testEmptyWhile(){
		int test = 1;
		while(test==1)
		{
			
		}	
		}
	
	public void testEmptyFor(){
		int test = 1;
		for(int i=0; i<test;i++){
			//empty
		}	
		}
	
	public boolean testEquals(){
		String test = "1";
		boolean flag = false;
		if(test.equals("1")){
			flag = true;
		}
		if(test== "1"){
			flag = true;
		}
		return flag;
	}
	
	 public void goodIntegerParseInt1()  {
		 try{
			 for(int i = 0 ; i<3 ; i++){
				 if(i == 2){
					 Integer.parseInt("a");
				 }
			 }
			 }
		 catch(Exception e){
			 e.getMessage();
		 }
     
	    }
	 
	 public void goodIntegerParseInt2() throws Exception {
			 Integer.parseInt("a"); 
     
	    }
	 
	 public void badIntegerParseInt2(){
		 Integer.parseInt("a"); 
 
    }
	 
	 public String checkNullPointExcetion(){
		 String test = "";
		 try {
			 test ="11";  
	        } catch (NullPointerException npe) {
	        	npe.getMessage();
	        }
		 return test;
	 }
	
}
