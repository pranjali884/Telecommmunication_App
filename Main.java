spackage telecommunicationApp;

public class Main {

	public static void main(String[] args) {
		
		//Desk myphone=new Desk("98765");
		
		//myphone.powerOn();   //mobile is always powered
 
		//myphone.callphone("98765");
		
		//myphone.answer();
		MobilePhone myPhone=new MobilePhone("98765");
		//both numbers are matches then mobile is power on and phone ringing
		//if both numbers are not matching then either mobile is off or wrong number
		
		myPhone.powerOn();   
 
		myPhone.callphone("987654");
		
		myPhone.answer();
	}

}
