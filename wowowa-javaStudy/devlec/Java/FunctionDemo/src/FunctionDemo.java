// �Լ�(Function/Sub Procedure) -> �޼ҵ�/�޽��/�޼���(Method)
public class FunctionDemo {
	// ���� �޼���(�Լ�)
	public static void main(String[] args) {
		//[!] �Լ� ȣ��(Call)
		hi(); hi(); 
		hello("�ݰ����ϴ�."); hello("�� ������.");
		int r = square(2);
		System.out.println("�Ѱܿ� ���� : " + r);
		show("�޼��� �����ε�");
		show("�޼��� �����ε�", 3);
	}
	//[1] �Ű�����(Parameter;Argument)�� ���� ��ȯ���� ����(void) �Լ� ����
	public static void hi() {
		System.out.println("�ȳ��ϼ���."); 
	}
	//[2] �Ű�����(����/�μ�/�Ķ����)�� �ִ� �Լ� ����
	public static void hello(String msg) {
		System.out.println(msg); // hello �Լ�(�޼���)�� �Ѱܿ� ���� ��� 
	}
	//[3] �Ű������� �ְ�, ��ȯ��(Return Value)�� �ִ� �Լ� ����
	public static int square(int i) { // 2 => 2 * 2 ��ȯ, 4 => 4 * 4 ��ȯ	
		int r = i * i; // �Ѱܿ� �Ű�ü�� �Ǵ� ������ �ι� ���Ѵ�.
		return r; // �Լ��� ȣ���� ������ ������� ��ȯ 
	}
	//[4] �Լ� �ߺ� : �޼��� �����ε�/�����ε� : method overload(���� ���� : ������ ����)
	// ���� Ŭ�������� ������ �̸��� �Լ�(�޼���)�� �Ű������� �޸��Ͽ� ������ ����
	public static void show(String msg) { System.out.println(msg); } // �Ѱܿ� ���ڿ� ���
	public static void show(String msg, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(msg); // �Ѱܿ� ���ڿ��� count��ŭ �ݺ��ؼ� ��� 
		}
	} 
}


