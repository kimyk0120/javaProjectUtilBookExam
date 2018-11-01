package com.tuyano.lib;

public class Lib {
	
	private String name = "";
	private String msg = "";
	
	public Lib(String name, String msg){
		this.name = name;
		this.msg = msg;
	}
	
	public String getMasseage(){
		return "\n==============================\n" + "Hello, " + this.name +  "\n" + this.msg + "\n==============================\n";
	}

	
	@Override
	public String toString() {
		return "Lib [name=" + name + ", msg=" + msg + "]";
	}
	

}
