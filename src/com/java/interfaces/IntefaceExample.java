package com.java.interfaces;

// Concept 5 :All variables in an interface are implicitly final, even if the final modifier is not used.
// Concept 6: An interface can extend another interface.
public interface IntefaceExample extends AnotherInterface {

	//5
	String variable="need To Initialize To Be Final";
	
	public void interfaceMethod();
}
