package ch04_3;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1부터 100까지 홀수는 더하고 짝수는 빼기
		
		int sum = 0;

	        for (int i = 1; i <= 100; i++) {
	            if (i % 2 == 1) { // 홀수
	                sum += i;
	            } else { // 짝수
	                sum -= i;
	            }
	        }

	        System.out.println( sum);

	}

}
