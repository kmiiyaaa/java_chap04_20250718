package ch04_3;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//1부터 100까지 홀수 합 출력
		
		int sum=0;
		
		for (int i=1; i<=100; i++){ 
			
			if (i%2 !=0) { // 혹은 i%2==1
				sum +=i; // sum=sum+i
			}	
			
			/* 
			 if (i%2 ==0) {    // 짝수 찾았을때 sum=sum+i 실행되지 않음 
			continue;        // for문으로 돌려보내기
			}
			sum +=i;
			
			*/
			
		}
		System.out.println(sum);
}

}