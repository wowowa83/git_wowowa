// do~while�� : �� ���� �� ���� �Ǵ�
public class DoWhileDemo {
	public static void main(String[] args) {
		
		// �⺻ ���
		int i = 0;						// �ʱ��
		do
		{
			System.out.println("�ȳ�");	// ���๮
			i++; 						// ������ 
		} while (i < 5);				// ���ǽ�
		
		// 1���� 100���� 3�� ��� �Ǵ� 4�� ����� ��
		int sum = 0; 
		int j = 1;							// �ʱ��
		do
		{
			if (j % 3 == 0 || j % 4 == 0)	// ���͸�
			{
				sum += j; 					// ���๮
			}	
			j++;							// ������
		} while (j <= 100);					// ���ǽ�
		System.out.println("����� �� : " + sum); 
		
	}
}
