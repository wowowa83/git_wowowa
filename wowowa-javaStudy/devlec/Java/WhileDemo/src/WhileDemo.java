// while�� : ������ �����ϴ� ���� ����
public class WhileDemo {
	public static void main(String[] args) {
		
		// for���� ����ϰ� ǥ��
		int i = 0;						// �ʱ��
		while (i < 5)					// ���ǽ�/������
		{			
			System.out.println("�ȳ�");
			i++;						// ������
		}
		
		// 1���� 100���� ¦���� ��
		int sum = 0; 
		int j = 1;						// �ʱ��
		while (j <= 100)				// ���ǽ�/������
		{
			if (j % 2 == 0)				// ���͸� : �߰� ���� ó��
			{
				sum += j; 				// ���๮ : ����
			}	
			j++;						// ������
		}
		System.out.println("1~100������ ¦���� �� : " + sum); 
		
	}
}
