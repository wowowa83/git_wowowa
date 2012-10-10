// do~while문 : 선 실행 후 조건 판단
public class DoWhileDemo {
	public static void main(String[] args) {
		
		// 기본 사용
		int i = 0;						// 초기식
		do
		{
			System.out.println("안녕");	// 실행문
			i++; 						// 증감식 
		} while (i < 5);				// 조건식
		
		// 1부터 100까지 3의 배수 또는 4의 배수의 합
		int sum = 0; 
		int j = 1;							// 초기식
		do
		{
			if (j % 3 == 0 || j % 4 == 0)	// 필터링
			{
				sum += j; 					// 실행문
			}	
			j++;							// 증감식
		} while (j <= 100);					// 조건식
		System.out.println("배수의 합 : " + sum); 
		
	}
}
