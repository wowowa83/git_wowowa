// switch�� : ���� if���� �Ǵٸ� ǥ�� ����
// �ð��� ���� ���� �ٸ� �޽��� ���
// ���� �ش�Ǵ� ���� �̸��� ���
public class SwitchDemo {
	public static void main(String[] args) {
		// �ð��븶�� ���� �ٸ� �޽��� ���
		int hour = 22;
		/*
		if (hour == 19)	{
			System.out.println("���� 7�ÿ� �ش��ϴ� �޽��� ���");			
		}
		else if (hour == 20) {
			System.out.println("���� 8�ÿ� �ش��ϴ� �޽��� ���");						
		}
		else {
			System.out.println("��ǻ�� ����");
		}
		*/
		
		switch (hour)
		{
			case 19: 
				System.out.println("���� 7�ÿ� �ش��ϴ� �޽��� ���");
				break;
			case 20:
				System.out.println("���� 8�ÿ� �ش��ϴ� �޽��� ���");
				break;				
			case 21:
				System.out.println("���� 9�ÿ� �ش��ϴ� �޽��� ���");
				break;				
			case 22:
				System.out.println("���� 10�ÿ� �ش��ϴ� �޽��� ���");
				break;	
			default:
				System.out.println("��ǻ�� ����");
				break;	
		}
		
	}
}
