package com;
//single Inheritance
 class Vehicle {//parent class a
	void running() {
		System.out.println("running mode on");
	}}
class Bike extends Vehicle{//child class B
	void run() {
		System.out.println("Bike run mode on");
	}
}
class Vehicle1{
	public static void main(String[]args) {
		Bike d=new Bike();
		d.run();//child class methode
		d.running();//pzrents class methode
	}
}