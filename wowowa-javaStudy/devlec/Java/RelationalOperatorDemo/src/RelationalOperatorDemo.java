// ������(��) ������ : ==, !=, <, >, <=, >=
// ������� boolean��
public class RelationalOperatorDemo {
	public static void main(String[] args) {
		int a = 3, b = 5;
		
		// C Family : ==, VB �迭 : (a = b)
		boolean b1 = a == b; // a�� ���� b�� ���� ������? false
		// C Family : !=, VB �迭 : (a <> b)
		boolean b2 = (a != b); // a�� b�� �ٸ���? true
		boolean b3 = (a < b); // ������? 3 < 5 : true
		boolean b4 = (a > b); // ũ��? 3 > 5 : false
		boolean b5 = (a <= b); // �۰ų� ������? 3 <= 5 : true
		boolean b6 = (a >= b); // ũ�ų� ������? 3 >= 5 : false
		
		System.out.println(b1); 
		System.out.println(b2); 
		System.out.println(b3); 
		System.out.println(b4); 
		System.out.println(b5); 
		System.out.println(b6); 
	}
}
