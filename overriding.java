 public class overriding {
void run() {
	System.out.println("running mode on");
}}
class Testoverriding extends overriding{
	void run() {
		System.out.println("running mode off");
	}
	public static void main(String[] args) {
		 Testoverriding to=new  Testoverriding();
		// Overriding or=new Overriding();
		 to.run();
}}