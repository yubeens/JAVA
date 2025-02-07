package interfacepackage;

public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SmartPhone phone = new SmartPhone();
//		phone.printLog();
//		phone.sendCall();
//		phone.play();
//		System.out.println("3과 5를 더하면 " + phone.calculate(3,5));
//		phone.schedule();
//		
		//PhoneInterface p1 = new PhoneInterface();
		SmartPhone smartPhone = new SmartPhone();
		System.out.println(smartPhone.calculate(3,5));
		smartPhone.MP3RingTone();
		smartPhone.play();
		smartPhone.stop();
		smartPhone.sendSMS();
		smartPhone.receiveSMS();
		smartPhone.sendCall();
		smartPhone.receiveCall();
		smartPhone.printLog();
		
		
		System.out.println(PhoneInterface.timeout);
		SamsungPhone sp = new SamsungPhone();
		sp.printLog();
		sp.sendCall();
		sp.receiveCall();
		sp.flash();
	}
}
