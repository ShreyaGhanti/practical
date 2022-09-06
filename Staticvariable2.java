public class Staticvariable2 {
	int rollno;
	String name;
	float fee;
	static String college= "SHM";
	static void change() {
		college = "ITC";}

	Staticvariable2(int rollno,String name,float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	 void display() {
		System.out.println(rollno+" "+name+" "+fee+" "+college);
	}
	public class Staticvariale {
	public static void main(String[] args) {
		
		Staticvariable2 s1 = new Staticvariable2(111,"pallabi",5000);
				Staticvariable2 s2 = new Staticvariable2(555,"shreya",6000);
				s1.display();
				s2.display();
	}

}
}
