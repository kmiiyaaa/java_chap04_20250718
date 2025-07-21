package scannerTest;

import java.util.Scanner;

public class ScannerTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {
		System.out.print("정수를 입력하세요(0입력시 프로그램 종료).");
		
		Scanner scanner = new Scanner(System.in);  // 앞에 스캐너(객체)
		int num = scanner.nextInt();  
		if(num==0) {
			System.out.println("****** 프로그램을 종료합니다! ******");
			break;
		} else if (num % 2  == 0) {
			System.out.println("짝!!"); 
		}else {
			System.out.println("홀!!"); 
		}
		
		}
		
	}

}
