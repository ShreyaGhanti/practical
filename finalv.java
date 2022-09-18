/* final keyword example */
  final class finalv {			//if we declare class as  final then we cannot extends this class 
	 final int value =50;			//we cannot override this from anywhere if we declare final
		 final void display() {	//if we declare final we cannot asses this from base class
			
			 //constructor cannot be final bcz it doesnot inherit
			 //value =70;		//we cannot update the value of final variable
	
		 }
		class ab extends finalv{
			// void display() {		//cannot override this method bcz we declare it as a final 	
				
			}
			
		public static void main(String[] args) {
			finalv obj =new finalv();
			obj.display();
		}}

 //class b extends finalv{			//we cannot subclass the final variable there will be error
