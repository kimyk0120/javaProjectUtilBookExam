package com.tuyano.eclipse_maven_app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	
	private App app = null;
	
	public AppTest( String testName )
    {	
        super( testName );
        app = new App();
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public void testGetMessage(){
    	String name = "Youngkim";
    	String msg = "Maven world , yk";
    	assertEquals(app.getMessage("yk"),msg);
    	
    }
    
}
