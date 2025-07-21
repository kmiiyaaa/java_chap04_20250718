package ch04_2;

public class ContinueTest00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i=1; i<=10; i++) {
			if ( 1%2==0) {
				continue;
				// continue문이 실행되게 된다면 다음은 실행이 안된다. / 참이면 다시돌아가고 거짓이면 그대로 지나가서 실행
			}
			System.out.println(i);
		}

		
		
	}

}
