class Test5 {
	  void show() {
		 System.out.println("dynamic binding first");
	 }
	
		
	 }
 

public class DynamicBindingDemo extends Test5{
	 void show() {
		 System.out.println("dynamic binding second");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5 obj1 = new DynamicBindingDemo();
		 obj1.show();
	}

}
