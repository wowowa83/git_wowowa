// 증감 연산자 : ++, --
// Prefix : 전위 : 앞 : 선 증감 후 대입
// Suffix : 후위 : 뒤 : 선 대입 후 증감
public class IncrementDecrementOperatorDemo {
	public static void main(String[] args) {
		// 변수 선언
		int a, b, c, d;
	
		// 변수에 값 대입
		a = 3; 		b = 5;		c = 7;
		
		//  프로세스
		//d = a; // 3
		//d = ++a; // 4
		//d = --a; // 1감소 : 2
		//d = a++; // d에 a를 먼저 대입 : 3
		//d = a--; // d에 a를 대입 후 a를 1감소
		//d = a-- - ++b; // d: -3, a: 2, b: 6
		//d = a-- - ++b * c++; //d: -39, a: 2, b: 6
		d = (a-- - ++b) * c++; //d: -21, a: 2, b: 6
		
		// 결과값 출력 // 3 -> 4 -> 2 -> (3, 4) -> (3, 2)
		System.out.println("d: " + d + ", a: " + a + ", b: " + b);
	}
}
