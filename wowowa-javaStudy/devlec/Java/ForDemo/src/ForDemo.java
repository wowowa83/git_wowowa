// �����ݺ� : for
public class ForDemo {
	public static void main(String[] args) {		
		// for(�ʱ��;���ǽ�;������) { ���๮; }
		// �ʱ�ĺ��� ���ǽ��� �����ϴµ��� ���๮ ����
		// for(�ʱ��; ������; ������) {...}		
		for (int i = 0; i < 5; i++) // i === 0, 1, 2, 3, 4
		{
			System.out.println("�ȳ��ϼ���.");	
		}
		
		// 1���� 10������ ������ ��
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i; // sum = sum + i; // ����
		}
		System.out.println("1~10������ �� : " + sum); 
	}
}
