package test_0212;

import java.util.ArrayList;
import java.util.Scanner;

class Phone{
	private String name;
	private String tel;
	private String address;
	
	public Phone(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
				
	}
	
	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public String getAddress() {
		return address;
	}

	
}
public class PhoneManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Phone> PhoneList = new ArrayList<>();
		
		System.out.print("인원수 >> ");
		int count = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<count; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력), 주소 >> ");
			String input = sc.nextLine();
			String[] data = input.split(" ");

			if (data.length < 3) {
                System.out.println("입력 형식이 올바르지 않습니다. 다시 입력해주세요.");
                continue;
            }
			
            String name = data[0];
            String phoneNumber = data[1];
            String address = data[2];

            PhoneList.add(new Phone(name, phoneNumber, address));
        }
		System.out.println("저장되었습니다...");

        while (true) {
            System.out.print("검색할 이름>> ");
            String searchName = sc.nextLine();

            if (searchName.equals("exit")) {
                System.out.println("프로그램을 종료합니다...");
                break;
            }

            boolean found = false;
            for (Phone phone : PhoneList) {
                if (phone.getName().equals(searchName)) {
                    System.out.println(searchName + "의 번호와 주소는 " + phone.getTel() + ", " + phone.getAddress() + " 입니다.");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(searchName + " 은(는) 없습니다.");
            }
        }
        sc.close();
    }
}
