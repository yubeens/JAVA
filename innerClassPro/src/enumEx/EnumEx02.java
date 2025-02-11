package enumEx;

enum Human2{MAN,WOMAN}
enum Machine2{TANK,AIRPLANE}

public class EnumEx02 {
	public static void createUnit(Machine2 kind) { 
		switch(kind) {
		case TANK:
			System.out.println("탱크를 만듬");
			break;
		case AIRPLANE:
			System.out.println("비행기를 만듬");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createUnit(Machine2.TANK);
		//createUnit(Human2.MAN); => 오류인식
	}

}
