package ch04_1;

public class IfTest002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 주사위를 굴려서 만약 3이나오면 한글로 "삼이 나왔습니다."를 출력하는 프로그램을 만드시오
		
		// System.out.println(((int) (Math.random()*6))+1); 
		// Math.random() : 0~1 사이의 수 중에서 소수점 16자리 가진 수를 랜덤으로 추출해주는 라이브러리, 1은 나오진 않음
		
		int number = ((int)(Math.random()*6))+1;  // 1~6 중에 랜덤으로 하나를 저장
		

		 if(number==1) {
			 System.out.println("일이 나왔습니다.");
		 } 
		 else if(number==2) {
			 System.out.println("이가 나왔습니다.");
		 } 
		 else if(number==3) {
			 System.out.println("삼이 나왔습니다.");
		 }
		 else if(number==4) {
			 System.out.println("사가 나왔습니다.");
		 } 
		 else if(number==5) {
			 System.out.println("오가 나왔습니다.");
		 } 
		 else {
			 System.out.println("육이 나왔습니다.");
		 }
	
		
			}

}
