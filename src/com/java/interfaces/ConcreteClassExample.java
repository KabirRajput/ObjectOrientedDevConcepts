package com.java.interfaces;

// Concept 7: Any class that implements an interface must provide method bodies 
//for each method in the interface, unless it is an abstract class.

// Concept 8: Assume interface B extends interface A.  
// A class that implements B must provide method bodies for methods in both A and B. 

// Concept 9: Every class must have a constructor, even if it is the default constructor
//that the compiler adds. 

// Concept 10: Constructors can be overloaded.

// Concept 11: Methods can be overloaded.

// Concept 12: Methods can be inherited.

// Concept 13: Member variables can be overridden.

// Concept 14: A sub-class constructor can call its super-class constructor using the super keyword. 

// Concept 15: Any concrete class with an abstract class in its hierarchy must implement all abstract
//methods from the superclass(es).

/* Extra Concept: extends needs to happen before implements
When the Java compiler turns a class into bytecode, it must first look to a parent class.
 That is because the underlying implementation of classes is to point to the bytecode of 
 the parent class - which holds the relevant methods and fields. Then it adds in pointers 
 to the code of the child class functions - some of which are mandated by the 'implements' keyword.

Because the parent class must be compilable, it is easier if the compiler knows up front what
 that class is. Further, you can extend only one class but implement any number of interfaces.
  The compilation time climbs if the extends keyword can be intermingled amongst any number of 
  implements instructions. Compilers want to fail as fast as possible to decrease dev 
time, so this choice is logical. Further, it helps you think clearly about the class for the same reason.
*/
public class ConcreteClassExample extends AbstractExample implements IntefaceExample, AnotherInterface  {

	//14
	public ConcreteClassExample(String field1, int field2) {
		super(field1);
		this.field1 = field1;
		this.field2 = field2;
	}
	
	public ConcreteClassExample(String field1) {
		super(field1);
		this.field1 = field1;
	}

	public String field1;
	public int field2;
	//8
	@Override
	public void interfaceMethod() {
		// TODO Auto-generated method stub
	}
	@Override
	public void anotherInteraceMethod() {
		// TODO Auto-generated method stub	
	}
	
	//11
	public void overloadedMethod1(String field1) {
		System.out.println("using string field1");
	}
	public void overloadedMethod1(int field1) {
		System.out.println("using string field2");
	}

	//12 & 15
	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		
	}
	
	

	
}
