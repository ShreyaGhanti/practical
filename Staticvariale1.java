public class Staticvariale1 {
	int rollno;
	String name;
	float fee;
	static String college= "SHM";

	Staticvariale1(int rollno,String name,float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+fee+" "+college);
	}
	public class Staticvariale {
	public static void main(String[] args) {
		
		Staticvariale1 s1 = new Staticvariale1(111,"pallabi",5000);
				Staticvariale1 s2 = new Staticvariale1(555,"shreya",6000);
				s1.display();
				s2.display();
	}

}
}