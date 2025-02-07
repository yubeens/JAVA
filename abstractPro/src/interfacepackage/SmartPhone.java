package interfacepackage;

public class SmartPhone extends PDA implements MusicPhoneInterface{

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("따르릉따르릉~~");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화 왔어요.");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("문자갑니다.");
	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		System.out.println("문자왔어요.");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("음악 연주합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("음악 중단합니다.");
	}
	
	@Override
	public void MP3RingTone() {
		// TODO Auto-generated method stub
		System.out.println("MP3RingTone");
	}
	
	//추가로 작성한 메소드
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
}




