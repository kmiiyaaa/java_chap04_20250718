package ch04_2;


public class forTest_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("안녕하세요~!");
		System.out.println("안녕하세요~!");	
		System.out.println("안녕하세요~!");	
		System.out.println("안녕하세요~!");	
		System.out.println("안녕하세요~!");	
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		
		for(int i = 1; i<=5 ; i++) { // for(초;조;증) , 보통 for문 안에 들어가는 초기화식의 변수는 i j k 순으로 쓴다
			System.out.println("안녕하세요~!");
			System.out.println("i값 : " + i);
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		
		//0~100사이 짝수만 출력
		for(int i=0;i<=100;i=i+2){ 
			System.out.println("i값 : " + i);
		}	
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
			
		//0~100사이 홀수만 출력
		for(int i=1;i<=100;i=i+2) {
			System.out.println("i값 : " + i);
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		
		//1~100까지 모든 수의 합 출력
		
		int sum=0;
		
		for(int i=1;i<=100;i=i+1) {
			
			sum +=i; // sum=sum+i , 기억해두면좋다
		} 
		System.out.println(sum);
		
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		
		//0~100사이 짝수만 출력
		  
//		for(int i=1; i<=100; i=i+1) { 
//			if (i%2==0) {
//				System.out.println("i값 : " + i);
//			}
//		
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
			
		//0~100사이 홀수만 출력
		for (int i=1; i<=100; i++){ 
			if (i%2 !=0) {
				System.out.println("i값 : " + i);
			}	  
		
	    
		
		}
		
		
		
		
	}
	
	
	
	
	
	
		
		
		
	}


