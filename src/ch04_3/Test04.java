package ch04_3;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1부터 100까지 짝수와 홀수 개수 세기 
		
		
		int oddCount = 0;  // 홀수 개수
	    int evenCount = 0; // 짝수 개수

	        for (int i = 1; i <= 100; i++) {
	            if (i % 2 == 1) {
	                oddCount++;
	            } else {
	                evenCount++;
	            }
	        }

	        System.out.println(oddCount);
	        System.out.println(evenCount);
	
	}

}
