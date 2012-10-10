// while문 : 조건이 만족하는 동안 실행
public class WhileDemo {
	public static void main(String[] args) {
		
		// for문과 비슷하게 표현
		int i = 0;						// 초기식
		while (i < 5)					// 조건식/최종값
		{			
			System.out.println("안녕");
			i++;						// 증감식
		}
		
		// 1부터 100까지 짝수의 합
		int sum = 0; 
		int j = 1;						// 초기식
		while (j <= 100)				// 조건식/최종값
		{
			if (j % 2 == 0)				// 필터링 : 추가 조건 처리
			{
				sum += j; 				// 실행문 : 문장
			}	
			j++;						// 증감식
		}
		System.out.println("1~100까지의 짝수의 합 : " + sum); 
		
	}
}
