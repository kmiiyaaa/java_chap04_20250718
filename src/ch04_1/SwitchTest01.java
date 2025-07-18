package ch04_1;

public class SwitchTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = ((int)(Math.random()*6)+1);
		
		switch (number) {
		case 1:
			 System.out.println("일이 나왔습니다.");
			 System.out.println("1111");
			break; // 브레이크가 없으면 해당케이스 밑에도 값들도 같이 출력된다.
		case 2:
			 System.out.println("이가 나왔습니다.");
			 System.out.println("2222");
			break;
		case 3:
			 System.out.println("삼이 나왔습니다.");
			 System.out.println("3333");
			break;
		case 4:
			 System.out.println("사가 나왔습니다.");
			 System.out.println("4444");
			break;
		case 5:
			 System.out.println("오가 나왔습니다.");
			 System.out.println("5555");
			break;
		case 6:
			 System.out.println("육이 나왔습니다.");
			 System.out.println("6666");
		default: // 모든 case에 해당이 안되는값을 잡아준다. (= if문 else)
			 System.out.println("주사위에서 나올 수 없는 숫자가 입력되었습니다."); // 만약 1~6 말고 가끔 실수로 다른수 입력했을때 ??
			 
		}
	}

}
