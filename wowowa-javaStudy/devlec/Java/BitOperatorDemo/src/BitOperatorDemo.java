// 비트 연산자
// & : AND : 논리곱
// | : OR : 논리합
// ~ : NOT : 부정
// ^ : XOR : 베타적논리합
public class BitOperatorDemo {
	public static void main(String[] args) {

		int a = 3; //  이진수(4bit) : 0011
		int b = 2; //                0010
		int r = 0; 
		
		r = a & b; // AND : 둘다 1(true)일때만 참 => 0010 => 2
		System.out.println(r); 
		
		r = a | b; // OR : 하나라도 1이면 참 => 0011 => 3
		System.out.println(r);
		
		r = ~a; // NOT : 1이면 0으로, 0이면 1로 => 1100 => -4
		System.out.println(r);

		r = a ^ b; // XOR : 서로 다를때에만 참(1) => 0001 => 1
		System.out.println(r);
		
	}
}
