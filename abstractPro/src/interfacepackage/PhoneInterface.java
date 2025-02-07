package interfacepackage;

public interface PhoneInterface {
	int timeout = 10000;
	
	void sendCall();
	void receiveCall();
	
	public default void printLog() {
		System.out.println("***Phone***");
	}
}
