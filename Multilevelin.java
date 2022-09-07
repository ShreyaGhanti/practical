 // Multilevel Inheritence  
class Vehicle1 {//parent class a
			void running() {
				System.out.println("running mode on");
			}
		}
		class Car1 extends Vehicle1{//child class B
			void run() {
				System.out.println("Car run mode on");
			}
		}
		class Bike1 extends Car1{//child class B
			void Speed() {
				System.out.println("Speed is very high");
			}
		}
		public class Multilevelin {
			public static void main(String[]args) {
				Bike1 d=new Bike1();
				d.running();//child class methode
				d.run();//pzrents class methode
			    d.Speed();
			}
	    }


