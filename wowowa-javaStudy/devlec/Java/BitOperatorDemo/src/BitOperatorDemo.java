// ��Ʈ ������
// & : AND : ����
// | : OR : ����
// ~ : NOT : ����
// ^ : XOR : ��Ÿ������
public class BitOperatorDemo {
	public static void main(String[] args) {

		int a = 3; //  ������(4bit) : 0011
		int b = 2; //                0010
		int r = 0; 
		
		r = a & b; // AND : �Ѵ� 1(true)�϶��� �� => 0010 => 2
		System.out.println(r); 
		
		r = a | b; // OR : �ϳ��� 1�̸� �� => 0011 => 3
		System.out.println(r);
		
		r = ~a; // NOT : 1�̸� 0����, 0�̸� 1�� => 1100 => -4
		System.out.println(r);

		r = a ^ b; // XOR : ���� �ٸ������� ��(1) => 0001 => 1
		System.out.println(r);
		
	}
}
