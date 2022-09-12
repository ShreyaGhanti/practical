package com;

public class Add {
	static int add(int a,int b) {
		return a+b;}
	static int add (int a,int b,int c) {
		return a+b+c;}}
class Test {
	public static void main(String[] args) {
		System.out.println(Add.add(3,3));
System.out.println(Add.add(2,2,3));
	}

}
