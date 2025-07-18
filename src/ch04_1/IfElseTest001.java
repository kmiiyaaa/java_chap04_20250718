package ch04_1;

public class IfElseTest001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 점수가 90점 이상이면 "수" , 80점 이상이면"우", ... 60점 이상이면 "양" 출력 프로그램
		
		int score = 75;
		
		if(score >=90) {
			System.out.println("수");
			
		}  else if(score >= 80) {
				System.out.println("우");
				
			}  else if (score >= 70) {
					System.out.println("미");
					
				} else if(score >= 60) {
						System.out.println("양");

	              } else {   // 생략가능, 필수는 아님
						System.out.println("가");
						}
		System.out.println("축하합니다");
		
		
		// value 값이 10이상 20미만이면 통과를 출력하시오 -> 두 조건다 true - 논리곱 사용
		
		int value = 15;
		
		if(value < 20 && value >=10) {
			System.out.println("통과");
		}
          
	
	}

         }