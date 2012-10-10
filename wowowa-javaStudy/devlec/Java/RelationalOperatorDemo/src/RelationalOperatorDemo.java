// 관계형(비교) 연산자 : ==, !=, <, >, <=, >=
// 결과값은 boolean값
public class RelationalOperatorDemo {
	public static void main(String[] args) {
		int a = 3, b = 5;
		
		// C Family : ==, VB 계열 : (a = b)
		boolean b1 = a == b; // a의 값과 b의 값이 같은지? false
		// C Family : !=, VB 계열 : (a <> b)
		boolean b2 = (a != b); // a와 b가 다르냐? true
		boolean b3 = (a < b); // 작은지? 3 < 5 : true
		boolean b4 = (a > b); // 크냐? 3 > 5 : false
		boolean b5 = (a <= b); // 작거나 같은지? 3 <= 5 : true
		boolean b6 = (a >= b); // 크거나 같은지? 3 >= 5 : false
		
		System.out.println(b1); 
		System.out.println(b2); 
		System.out.println(b3); 
		System.out.println(b4); 
		System.out.println(b5); 
		System.out.println(b6); 
	}
}
