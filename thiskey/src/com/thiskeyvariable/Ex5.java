package com.thiskeyvariable;

public class Ex5 {
	
		int id;
		String name;
		public void setdetails(int id ,String name) {
			this.id =id;// id id same ahe mg diff kas karav use this key
			this.name =name;
			
		}
	public static void main (String argsb[]) {
		Ex5 ex =new Ex5();
		ex.setdetails(11, "ram");
		System.out.println(ex.id);
		System.out.println(ex.name);
	}

}
