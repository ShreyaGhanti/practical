// Methode overloading
package com;

public class Addition {
	static int add(int a, int b) {
		return(a+b);}
	static double add(double a,double b) {
		return (a+b);}
class overloading {
	public static void main(String[] args) {
		System.out.println(Addition.add(3,3));
System.out.println(Addition.add(2.9,2.8));
	}

}
}