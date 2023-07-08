package telecommunicationApp;

public class Desk implements Telephone {
	private String mynumber;
	private boolean isring;
	 
	public Desk(String mynumber)
	{
		this.mynumber=mynumber;
	}

	@Override
	public void powerOn() {
		System.out.println("mobile is always powered");
	}

	@Override
	public void dial(String PhoneNumber) {
		System.out.println("now ringing" + PhoneNumber +" on mobile");
	}

	@Override
	public void answer() {
		if(isring)
		{
			System.out.println("Answering the phone");
			isring=false;
		}
		else
		{
			System.out.println("Phone is not ringing");
		}
		
	}

	@Override
	public boolean callphone(String PhoneNumber) {
		if(PhoneNumber==mynumber)
		{
			isring=true;
			System.out.println("Phone Ringing");
		}
		else
		{
			//System.out.println("");
			isring=false;
			
		}
		return isring;
	}

	@Override
	public boolean isRing() {
		return isring;
	}
	

}
