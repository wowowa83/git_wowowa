// ����(�Ҵ�) ������ : =, +=, -=, *=, /=, %=, ...
public class AssignmentOperatorDemo {
	public static void main(String[] args) {
		
		// ���� ����
		int a = 10;
		int b = 5;
		int c = 3;
		
		// a�� b�� ���� ����
		//a = a + b; // �⺻
		a += b; // ���� �⺻ �ڵ�� ������ ����� ����		
		c -= b; // c = c - b; => ��� ǥ��
		
		// ������� ���
		System.out.println("a�� �� : " + a);
		System.out.println("c�� �� : " + c);
		
	}
}
