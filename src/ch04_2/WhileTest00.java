package ch04_2;

public class WhileTest00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		/*int score = 60;
		
		
		 * if(score>70) {     // 참이면 한 번 실행하고 종료
		 System.out.println("통과!!");	
		}
		*/
		
		
		int i =0;
		
		while(i <= 5) {	 // 참이면 계속 반복
		System.out.println("통과!!");
		i++; // i=i+1  , 이렇게 거짓이나오게 하는 값 설정해줘야 한다. 아니면 계속 무한으로 내려옴
	    }
		
		System.out.println("축하합니다!!");
	// 횟수 정해져 있을땐 for문
	// 횟수가 정해져있지 않았을땐 while문 
		
		
		
		int kor =80;
		
		while(kor>=100) {
			System.out.println("안녕 코리아!!!");	 //이경우는 실행x
		}
		
		
		
		do {
			System.out.println("안녕 코리아!!!");	//일단 한번은 실행된다
		}while(kor <= 100);  
		
		System.out.println("축하합니다!!");

		
		
		
		
	}

}

