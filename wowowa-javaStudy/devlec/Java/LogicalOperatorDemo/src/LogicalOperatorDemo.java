// �� ������ : 
// &&(AND) : �� �� ���϶����� ��, �ϳ��� �����̸� ����
// ||(OR) : �ϳ��� ���̸� ��, �� �� ������ ���� ����
// !(NOT) : ���̸� ��������, �����̸� ������
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
