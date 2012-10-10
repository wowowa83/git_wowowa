// 구간반복 : for
public class ForDemo {
	public static void main(String[] args) {		
		// for(초기식;조건식;증감식) { 실행문; }
		// 초기식부터 조건식이 만족하는동안 실행문 실행
		// for(초기식; 최종값; 증감식) {...}		
		for (int i = 0; i < 5; i++) // i === 0, 1, 2, 3, 4
		{
			System.out.println("안녕하세요.");	
		}
		
		// 1부터 10까지의 정수의 합
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i; // sum = sum + i; // 누적
		}
		System.out.println("1~10까지의 합 : " + sum); 
	}
}
