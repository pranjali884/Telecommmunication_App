package telecommunicationApp;

public class MobilePhone implements Telephone {
	private String mynumber;
	private boolean isring;
	private boolean isPowerOn;
	
	public MobilePhone(String mynumber)
	{
		this.mynumber=mynumber;
	}

	@Override
	public void powerOn() {
		isPowerOn=true;
		System.out.println("mobile is  power on");
	}

	@Override
	public void dial(String PhoneNumber) {
		System.out.println("now ringing" + PhoneNumber +" on mobile");
	}

	@Override
	public void answer() {
		if(isring && isPowerOn)
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
		if(PhoneNumber==mynumber && isPowerOn)
		{
			isring=true;
			System.out.println("Phone Ringing");
		}
		else
		{
			System.out.println("Either wrong number or phone is off");
			isring=false;
			
		}
		return isring;
	}

	@Override
	public boolean isRing() {
		return isring;
	}
	

}



