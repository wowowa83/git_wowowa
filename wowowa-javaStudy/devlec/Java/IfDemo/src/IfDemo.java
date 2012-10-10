// 조건문
public class IfDemo {
	public static void main(String[] args) {
		
		int a = 10;
		
		// 3항 연산자 : 조건 연산자
		String s = (a % 2 == 0) ? "짝수" : "홀수";
		System.out.println(s);		
		
		// if문 : 단일 조건 처리 : 참일 때 수행하는 문장
		if (a % 2 == 0) {
			System.out.println("짝수"); 
		}
		
		// else문
		if (a % 2 != 1) // 즉, 짝수라면...
		{			
			System.out.println("짝수");
		}
		else
		{			
			System.out.println("홀수");
		}
		
		// else if문 : 여러개의 조건 처리
		if (a % 3 == 0) // 3의 배수
		{
			System.out.println("3의 배수");
		}
		else if (a % 4 == 0) // 4의 배수
		{
			System.out.println("4의 배수");
		}
		else if (a % 7 == 0) // 7의 배수
		{
			System.out.println("7의 배수");
		}
		else
		{
			System.out.println("3, 4, 7의 배수가 아닌 수");
		}
		
	}
}
