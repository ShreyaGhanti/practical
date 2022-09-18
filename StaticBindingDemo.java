/*public class StaticBindingDemo {
int a=30; a is a integer type of variable
//reference have a type
 * staticbindingdemo sbd
 * object have a type
 * StaticBindingDemo obj = new StaticBinding(); */

 public class StaticBindingDemo {
	 private void show() {
		 System.out.println("static binding");
	 }
	 public static void main(String[] args) {
		 StaticBindingDemo obj1 = new StaticBindingDemo();
		 obj1.show();
		 
	 }
 }
