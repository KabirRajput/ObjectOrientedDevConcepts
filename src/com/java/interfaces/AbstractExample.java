package com.java.interfaces;

// Concept1: An abstract class can contain both abstract and non-abstract methods.
// Concept2: An abstract class can have member variables.
// Concept3: An abstract class can implement an interface.
// Concept4: An abstract class can have a constructor.


//3
public abstract class AbstractExample implements IntefaceExample{
	
	//4
	public AbstractExample(String memberVariable) {
		super();
		this.memberVariable = memberVariable;
	}

	//2
	private String memberVariable;
	
	public abstract void doSomething();
	
	//1
	public void doSomethingwithCode() {
		
		System.out.println("abstract class with a concrete method"); 
	}
}
