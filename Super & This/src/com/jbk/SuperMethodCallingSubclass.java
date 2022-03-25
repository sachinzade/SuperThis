package com.jbk;

public class SuperMethodCallingSubclass extends SuperMethodCalling {

	void display() {
		System.out.println("Child Class method");
	}

	void printMsg() {
		
		//This would call Overriding method
		display();// we use this to print child class method
		
		// This would call Overriding method
		super.display();  // we use this to print parant class method
	}
public static void main(String[] args) {
	SuperMethodCallingSubclass obj = new SuperMethodCallingSubclass();
	obj.printMsg();
}
}
