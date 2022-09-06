
public class Thiskeyword {
	int rollno;
	String name;
	float fee;
	Thiskeyword(int rollno,String name,float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+fee);
	}
	
public class Test{
	public static void main(String[] args) {
		Thiskeyword s1= new Thiskeyword(444,"pallabi",5000);
				Thiskeyword s2= new Thiskeyword(555,"shreya",6000);
				s1.display();
				s2.display();

	}

}
}