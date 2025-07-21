package ch04_3;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//정수 50의 약수 출력
		
		for(int i=1;i<=50;i++) {
			if(50 % i==0) { // 나누어 떨어지면 50의 약수이다
				System.out.println(i);
			}
		}
		
	}

}