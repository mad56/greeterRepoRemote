package edu.esprit.greeter;

public class Greeter {
	
	public String var;
	/**
	 * 
	 * sayHello method
	 * 
	 * @param name
	 * @return "Hello "+name
	 */ 
	
	
	
	public String sayHello (String name){
		
		if(name.equals("MAN")){
			
			throw new IllegalArgumentException();//rien
			
		}
		
		return "Hello "+name;
		
	}

}
