package inter;

public interface PhoneInterface {
	
	void sandCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("JSL Phone");
	}
}

interface MobilePhone extends PhoneInterface {
	void sendSMS();
	void revieceSMS();
}

interface Mp3Interface {
	void play();
	void stop();
}

abstract class Pda {
	abstract void map();
}

class iPhone extends Pda implements MobilePhone, Mp3Interface {

	@Override
	public void sandCall() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void revieceSMS() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void map() {
		// TODO Auto-generated method stub
		
	}
	
}