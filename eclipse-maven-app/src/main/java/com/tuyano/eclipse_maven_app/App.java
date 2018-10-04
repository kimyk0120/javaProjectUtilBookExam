package com.tuyano.eclipse_maven_app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        new App().printMessage("YK");
    }
    
    public String getMessage(String name){
    	return "Maven world , " + name;
    }
    
    public void printMessage(String name){
    	System.out.println("App Class");
    	System.out.println(this.getMessage(name));
    	System.out.println(".App Class");
    }
    
}
