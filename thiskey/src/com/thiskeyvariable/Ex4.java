package com.thiskeyvariable;

public class Ex4 {
	int id;
	String name;
	public void setdetails(int id ,String name) {
		id =id;
		name =name;
		
	}
public static void main (String argsb[]) {
	Ex4 ex =new Ex4();
	ex.setdetails(11, "ram");
	System.out.println(ex.id);
	System.out.println(ex.name);
}

}
