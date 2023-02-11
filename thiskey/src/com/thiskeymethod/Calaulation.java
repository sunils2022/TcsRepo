package com.thiskeymethod;

public class Calaulation {
	public void div(int d, int f) {
		int g=d/f;
		System.out.println("div is  ="+g);
		this.modulus(5, 5);
		
	}
	public void multi(int q, int w) {
		int e=q*w;
		System.out.println("multi is  ="+e);
		this.div(5, 5);
		
	}
	public void modulus(int r, int t) {
		int u=r%t;
		System.out.println("modulus is  ="+u);
		
		
	}
	public void sub(int a, int b) {
		int c= a-b;
		System.out.println("sub is  ="+c);
		this.multi(5, 5);
		
	}
	
	public void add(int x, int y) {
		int z= x+y;
		System.out.println("addition is  ="+z);
		this.sub(5, 5);
		
	}
	public static void main(String[] args) {
		Calaulation c=new Calaulation();
		c.add(5, 5);
	}

}
