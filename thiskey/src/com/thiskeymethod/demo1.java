package com.thiskeymethod;

public class demo1 {
	public void addition() {
		System.out.println("i am addition method from demo class");
		this.substraction();// by using this key we can access any methos in any class
	}
	public void substraction() {
		System.out.println("i am substraction method from demo class");
	}
	public static void main(String[] args) {
		demo1 demo=new demo1();
		demo.addition();
	
	}

}
