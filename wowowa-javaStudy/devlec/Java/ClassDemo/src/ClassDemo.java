// Ŭ���� : �ϳ��� �̸����� ���� �ٸ� Ÿ���� �����͸� ������ ���� + ��� ����
public class ClassDemo {
	// �޼��� : ��Ʈ�� ����Ʈ : ���α׷��� ������
	public static void main(String[] args) {
		//[1] 
		hi(); // ���� Ŭ�������� �Լ�(�޼���) ȣ��
		
		//[2] �޼��忡 static 
		OtherClass.hello();
		
		//[3] �ν��Ͻ� ����
		// OtherClass�� �ν��Ͻ�(��ü) ���� : new �����ڸ� ����ؼ�
		OtherClass oc = new OtherClass();
		oc.bye(); // ��ü��.�����(); 
		
		//[4] Person Ŭ������ �ν��Ͻ� ����
		Person p1 = new Person();
		p1.name = "ȫ�浿";
		p1.age = 21;
		p1.gender = 'M';
		p1.printName();
		
		Person p2 = new Person();
		p2.name = "��λ�";
		p2.age = 100;
		p2.gender = 'F';
		p2.printName(); 
	}
	
	private static void hi()
	{
		System.out.println("�ȳ��ϼ���.");
	}
}