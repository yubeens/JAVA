package task_0203;

//문제 ) 은행 계좌를 나타내는 BankAccount 클래스를 작성하라
//		(1) 필드는 계좌번호(accountNumber), 오너(owner), 잔액(balance)를 가지며, 클래스 전용 필드이다.
//		(2) 메소드는 입급(deposit), 출금(withdraw), 잔액조회(getBalance) 함수를 가진다. 단 출금함수는 잔액보다 출금액이 크지 않아야 한다.
//		(3) 계좌 이체함수는 다음과 같이 추가하라.
//			//현재 객체의 잔액에서 amount 만큼을 otherAccount 계좌로 송금한다.
//			public int transfer(int amount, BankAccount otherAccount)
//			{
//			...
//			}
//		(4) 입금, 출금, 잔액 조회, 계좌 이체를 테스트하는 메인을 작성하라.



public class Bank{

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		BankAccount account = new BankAccount("051-12-083467-8","조유빈", 100000);
		BankAccount otherAccount = new BankAccount("051-12-083567-9","임성빈", 100000);
		account.deposit("051-12-083467-8",10000); //만원 입금
		account.withdraw("051-12-083467-8",90000); //보유량보다 높은 금액 출금
		account.withdraw("051-12-083467-8",60000);
		account.getBalance("051-12-083467-8"); //잔액조회
		account.transfer(otherAccount,10000); //이체
	}
}
	
class BankAccount {
	private String accountNumber;
	private String owner;
	private int balance;
	
	public BankAccount() {}
	public BankAccount(String accountNumber, String owner, int balance) {
		this.accountNumber=accountNumber;
		this.owner=owner;
		this.balance=balance;
	}
	//입금 deposit
	public void deposit(String accountNumber, int inputMoney) {
		if(this.accountNumber.equals(accountNumber)) { //계좌번호와 이름이 같은지 확인
			System.out.println("입금 전 잔액 : " + balance);
			
			this.balance=this.balance+inputMoney;
			System.out.println("입금 후 잔액 : " + balance);
		}else
			System.out.println("계좌번호가 틀렸습니다.");
	}
	//출금 withdraw
	public void withdraw(String accountNumber, int outputMoney) {
		if(this.accountNumber.equals(accountNumber)) { //계좌번호와 이름이 같은지 확인
			if(balance !=0) { // 잔고가 0원이 아니면 (음수는 넣는 일이 없어서 배제)
				if(outputMoney < balance) { //출금할 금액이 잔고보다 작은가? 작으면 출금
					System.out.println("출금 전 잔액 : " +balance);
					
					balance = balance = outputMoney;
					System.out.println("출금액 : " + outputMoney);
					System.out.println("출금 후 잔액 : " +balance);
				}else
					System.out.println("현재 잔액보다 출금액이 더 큽니다.");
			}else
				System.out.println("잔액이 0원 입니다.");
		}else
			System.out.println("계좌번호가 틀렸습니다.");
	}
	//잔액조회 getBalance
	public void getBalance(String accountNumber) {
		if(this.accountNumber.equals(accountNumber)) {
			System.out.println("현재 잔액 : " + balance);
		}else
			System.out.println("계좌번호가 틀렸습니다.");
	}
	public void transfer(BankAccount otherAccount, int transMoney) {
		if(this.accountNumber.equals(accountNumber)) {
			if(balance !=0) {
				if(transMoney < this.balance) { //맞으면 내 잔고에 마이너스 후 이체
					this.balance -= transMoney;
					otherAccount.balance += transMoney;
					System.out.println(this.owner+"의 현재 잔액 : "+ balance);
					System.out.println(this.owner+"님의 "+this.accountNumber+" 계좌에서 " + balance+"이");
					System.out.println(otherAccount.owner + "님의 " + otherAccount.accountNumber + " 계좌로 " + transMoney + "만큼 이체 되었습니다.");
				}else
					System.out.println("현재 잔액보다 이체 금액이 더 큽니다.");
			}else
				System.out.println("잔액이 0원 입니다.");
		}else
			System.out.println("계좌번호나, 이름이 틀렸습니다.");
	}
}
