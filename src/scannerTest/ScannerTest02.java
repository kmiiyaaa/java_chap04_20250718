package scannerTest;

import java.util.Scanner;

public class ScannerTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {  //무한루트
	    System.out.println("***종료하려면 나이에 0을 입력하세요***");   // 문자열 등호로 입력하면 오류날 수도 있음, 숫자를 등호로 받기
		
		Scanner scanner = new Scanner(System.in); //객체이름은 보통 클래스이름에서 앞글자 소문자로 만들고 쓰는게 관례이다, 필수는 아님
		System.out.print("당신의 이름을 입력하세요. :");
		String str = scanner.nextLine();  // 문자열 받기
		
		System.out.print("당신의 나이를 입력하세요. :");
		int age = scanner.nextInt();  // 정수 받기
		if(age == 0) { 
			System.out.print("프로그램을 종료합니다!");
			break;
			
		}
		
		
		
		System.out.println("입력한 이름 : "+ str);
		System.out.println("입력한 나이 : "+ age);
		}
	}

}
