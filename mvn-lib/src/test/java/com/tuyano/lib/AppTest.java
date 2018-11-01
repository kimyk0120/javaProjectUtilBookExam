package com.tuyano.lib;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase 
{
    
	public AppTest(String testName){
		super(testName);
	}
	
	public static Test suite(){
		return new TestSuite(AppTest.class);
	}
	
	public void testApp(){
		App app = new App();
		assertNotNull(app);
	}
	
	public void testLib(){
		Lib lib= new Lib("kim", "kim");
		assertNotNull(lib);
	}
}
