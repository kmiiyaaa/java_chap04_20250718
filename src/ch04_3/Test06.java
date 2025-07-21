package ch04_3;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sum=0;
		int steps=0;
		
		for(int i=1; i<=100; i++) {
			sum +=i;
			steps++;
			
			if(sum >= 100) {
				break;
			}
			
		 } 
		System.out.println(steps);
		System.out.println(sum);
		
		
		
	}


}