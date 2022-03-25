package com.jbk;

public class SuperVariableSubclass extends SuperVariableParent {
	int num = 1100;

	void PrintNum() {
		// we use super.varible_name to print superclass variable
		System.out.println(super.num);
	}

	public static void main(String[] args) {
		SuperVariableSubclass s1 = new SuperVariableSubclass();
		s1.PrintNum();
	}

}
