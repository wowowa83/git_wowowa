// ����Ʈ(Shift) ������
// << : ���� ����Ʈ : ��Ʈ �� 2��
// >> : ������ ����Ʈ : ��Ʈ�� 1/2��
public class ShiftOperatorDemo {
	public static void main(String[] args) {

		int num = 0;
		int result = 0;
		
		num = 2;
		result = num << 2; // num�� ��Ʈ���� �������� 2ĭ �̵� => 8
		System.out.println(result);
		
		num = 40;
		result = num >> 2; // ��Ʈ���� ���������� 2ĭ �̵� => 40 * 1/4 => 10 
		System.out.println(result);
		
	}
}
