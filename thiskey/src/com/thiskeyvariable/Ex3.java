package com.thiskeyvariable;

public class Ex3 {

		
		int id=100;
		public void setid(int eid) {
			int id=15;
			
			System.out.println(eid);
			
			System.out.println(this.id);// here due to this keywork refere global variable
			
			
			
		}
		public static void main(String[] args) {
			Ex3 ex=new Ex3();
			ex.setid(111);
			
		}

	}
	
