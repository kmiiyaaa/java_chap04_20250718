package ch04_3;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
