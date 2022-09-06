package com;

public class Copyconst {
	int age;
	String name;
	Copyconst (int a,String n){
		age = a;
		name = n;
		}
	Copyconst (Copyconst c){
		age =c.age;
		name =c.name;
	}
	void show() {
System.out.println(age+" "+name);}
	public static void main(String[] args) {
		
		Copyconst c1= new Copyconst(22,"shreya");
		Copyconst c2= new Copyconst(c1);
		c1.show();
		c2.show();

	}

}
