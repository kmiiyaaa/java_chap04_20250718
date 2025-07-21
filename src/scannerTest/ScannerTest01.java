package scannerTest;

import java.util.Scanner;

public class ScannerTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);  // 앞에 스캐너(객체)
		
		System.out.println("당신이 제일 좋아하는 숫자를 입력하세요.");
		int num1 = scanner.nextInt();  // 사용자ㅣ로부터 정수 입력 받아와 정수 변수 num1에 저장
		System.out.println("당신이 제일 좋아하는 숫자는 "+num1+"입니다."); 
		scanner.close(); // 스캐너는 쓰고 닫아주는거 필수!!
		
	}

}
