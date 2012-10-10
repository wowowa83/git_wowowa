// 논리 연산자 : 
// &&(AND) : 둘 다 참일때에만 참, 하나라도 거짓이면 거짓
// ||(OR) : 하나라도 참이면 참, 둘 다 거짓일 때만 거짓
// !(NOT) : 참이면 거짓으로, 거짓이면 참으로
public class LogicalOperatorDemo {
	public static void main(String[] args) {
		System.out.println(true && false); // false
		System.out.println(true && true); // true
		
		boolean r1 = (3 == 5) && (3 < 5); // r1? false
		System.out.println(r1);
		
		int a = 1, b = 1;
		
		boolean r2 = (a == b) || (a != b); // true
		System.out.println(r2);		
		
		boolean r3 = !(a == b); // !true => false
		System.out.println(r3);
	}
}
