// ���� ������ : ++, --
// Prefix : ���� : �� : �� ���� �� ����
// Suffix : ���� : �� : �� ���� �� ����
public class IncrementDecrementOperatorDemo {
	public static void main(String[] args) {
		// ���� ����
		int a, b, c, d;
	
		// ������ �� ����
		a = 3; 		b = 5;		c = 7;
		
		//  ���μ���
		//d = a; // 3
		//d = ++a; // 4
		//d = --a; // 1���� : 2
		//d = a++; // d�� a�� ���� ���� : 3
		//d = a--; // d�� a�� ���� �� a�� 1����
		//d = a-- - ++b; // d: -3, a: 2, b: 6
		//d = a-- - ++b * c++; //d: -39, a: 2, b: 6
		d = (a-- - ++b) * c++; //d: -21, a: 2, b: 6
		
		// ����� ��� // 3 -> 4 -> 2 -> (3, 4) -> (3, 2)
		System.out.println("d: " + d + ", a: " + a + ", b: " + b);
	}
}
