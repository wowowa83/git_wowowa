// 대입(할당) 연산자 : =, +=, -=, *=, /=, %=, ...
public class AssignmentOperatorDemo {
	public static void main(String[] args) {
		
		// 변수 선언
		int a = 10;
		int b = 5;
		int c = 3;
		
		// a에 b의 값을 누적
		//a = a + b; // 기본
		a += b; // 위의 기본 코드와 동일한 기능을 수행		
		c -= b; // c = c - b; => 축약 표현
		
		// 결과값을 출력
		System.out.println("a의 값 : " + a);
		System.out.println("c의 값 : " + c);
		
	}
}
