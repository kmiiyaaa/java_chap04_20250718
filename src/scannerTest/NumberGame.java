package scannerTest;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1~100 사이 정수 중 컴퓨터가  생각한 숫자를 맞추는 게임
		
		Scanner scanner = new Scanner(System.in);
		int comNumber = (int) ( Math.random() * 100) + 1 ; // 랜덤으로 컴퓨터가 생각한 수 생산
//		System.out.println(comNumber); --- 숫자 나오는거 보기 테스트용
		
		System.out.println("**** 숫자 맞추기 게임 ****");
		System.out.println("**** 1~100사이 숫자를 맞춰보세요~! ****");
		int count =0; // 횟수 출력 변수
		
		
		while(true) {
			count++;
			
			System.out.println("1~100사이 숫자 하나를 입력하세요(0입력시 게임 종료).");
			int num  = scanner.nextInt();
			if (num == 0) break;  // if 문에서 한줄만 쓸경우 { } 괄호 생략가능!
			if(num > comNumber) {
				System.out.println("당신이 생각한 숫자가 너무 큽니다!");
			} else if (num < comNumber) {
				System.out.println("당신이 생각한 숫자가 너무 작습니다!");
			} else {
				System.out.println("정답입니다!!! " + count + "번 만에 맞추셨네요. 게임을 종료합니다!");
				break;
				
			}
			
		}
				

	}

}
