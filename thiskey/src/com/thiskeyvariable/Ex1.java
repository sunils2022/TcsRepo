package com.thiskeyvariable;

public class Ex1 {
	int id ;
	String name;
public void setdetails(int eid, String ename) {
	id = eid;// what happen when we assign id =id see Ex5
	name=ename;
	
}
public static void main(String[] args) {
	Ex1 ex=new Ex1();
	ex.setdetails(11, "sunil");

	
	System.out.println(ex.id);
	System.out.println(ex.name);
	
}

}


