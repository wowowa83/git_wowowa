// 3��(����) ������ : ��1 ? ��2 : ��3;
public class ConditionalOperatorDemo {
	public static void main(String[] args) {

		// 3�� ������ : (����) ? �� : ����;
		System.out.println( (3 != 5) ? "�ٸ���" : "���ø��� ����." );
		
		// ���� �Ǵ�
		int i = 10; 
		String msg = "";
		boolean bln = (i % 2 == 0) && !(i % 2 != 1); // && : ~�̰� �׸���, || : ~�̰ų� �Ǵ�
		
		msg = (bln == true) ? "��" : "����" ; 
		System.out.println(msg);
		
		// �ڿ��� ���ǹ� : if��
		if (bln == true)
		{
			msg = "��";
		}
		else	
		{
			msg = "����";
		}
		System.out.println(msg);
		
	}
}
