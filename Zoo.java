class zoo1{
	int a=10;
	void bark() {
		System.out.println("barking");
	}
}
class Cat extends zoo1{
	int a =20;
	//void bark() {
		//System.out.println("meaw");
	//}
}
class Dog extends zoo1{
	void bark() {
		System.out.println("bark");
	}
}
public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zoo1 z=new Cat();		//if same method in both the class then child class will print
		z.bark();			//
		//System.out.println(z.a);
	}}
