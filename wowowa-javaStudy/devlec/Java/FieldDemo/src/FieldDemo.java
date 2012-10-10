// �ʵ�(Field) : Ŭ�������� ����� ����(Variable) / ���(Constant)
// �ʵ��� ���� : Ŭ����(�ڵ������赵)�� �ν��Ͻ�(�ڵ�����ü)�� �Ӽ�(�ʵ�;����/ũ��)
class FieldTest {
	// �ʵ� : ��� ���� -> public�� �ʵ� = �Ӽ�(Property)
	public String name;
	public int age;
	private String addr;
	public final String PROJECT_NAME = "�ʵ� ����"; // ������� �빮�ڷ� ����.
}
public class FieldDemo {
	//[2] ���� ����(Global Variable) -> ��� ���� -> �ʵ�(Field)
	public static int age = 21; 
	public static final double PI = 3.14; // ��� : final / const
	public static void main(String[] args) {
		//[1] ���� ����(Local Variable)
		String name = "ȫ�浿";
		System.out.println(name);
		System.out.println(age);
		//[!] �ٸ� Ŭ������ �ʵ忡 ����
		FieldTest ft = new FieldTest(); // Ŭ������ �ν��Ͻ� ����
		ft.name = "��λ�"; // set
		ft.age = 100;
		System.out.println(
				ft.PROJECT_NAME + "," + ft.name + ", " + ft.age); // get		
		//[!] ����� ����
		//PI = 3.10; // ����� ���߿� ���� �Ҵ��Ϸ����ϸ� ������ ����
		System.out.println(PI);
	}
}




