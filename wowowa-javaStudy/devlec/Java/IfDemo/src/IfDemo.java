// ���ǹ�
public class IfDemo {
	public static void main(String[] args) {
		
		int a = 10;
		
		// 3�� ������ : ���� ������
		String s = (a % 2 == 0) ? "¦��" : "Ȧ��";
		System.out.println(s);		
		
		// if�� : ���� ���� ó�� : ���� �� �����ϴ� ����
		if (a % 2 == 0) {
			System.out.println("¦��"); 
		}
		
		// else��
		if (a % 2 != 1) // ��, ¦�����...
		{			
			System.out.println("¦��");
		}
		else
		{			
			System.out.println("Ȧ��");
		}
		
		// else if�� : �������� ���� ó��
		if (a % 3 == 0) // 3�� ���
		{
			System.out.println("3�� ���");
		}
		else if (a % 4 == 0) // 4�� ���
		{
			System.out.println("4�� ���");
		}
		else if (a % 7 == 0) // 7�� ���
		{
			System.out.println("7�� ���");
		}
		else
		{
			System.out.println("3, 4, 7�� ����� �ƴ� ��");
		}
		
	}
}
