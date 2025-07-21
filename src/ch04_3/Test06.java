package ch04_3;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1부터 100까지 합 구하다가 합이 100이상이면 멈추고, 마지막으로 더한 수와 합을 출력하세요
		
		int sum=0;
		int steps=0;
		
		for(int i=1; i<=100; i++) {
			sum +=i;
			steps++;
			
			if(sum >= 100) {
				//steps = i;
				break;
			}
			
		 } 
		
		System.out.println("합 "+sum);
		System.out.println("마지막으로 더한 수 "+steps);
		
		
		
	}


}