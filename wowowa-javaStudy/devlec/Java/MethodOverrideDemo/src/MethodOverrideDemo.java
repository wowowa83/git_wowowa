// �޼��� �������̵�(override) : �� ����/�����/���Ӱ� ����...
class P {
	public void Say() { System.out.println("�ȳ�"); }
	public void Run() { System.out.println("�޸���"); }
}
class C extends P {
	// �θ��� ����� ������ / ���׷��̵�...
	public void Say() { System.out.println("�氡"); }
	public void Run() { 
		super.Run(); // �θ� ����� Run ��� + �ڽ��� Run ���
		System.out.println("�� �޸���"); 
	}
}
public class MethodOverrideDemo {
	public static void main(String[] args) {
		Hi(); Hi("�氡");
		// �ڽ� Ŭ������ �ν��Ͻ� ����
		C c = new C(); c.Say(); c.Run();
	}	
	// �޼��� �����ε�(overload) : ���� ����
	private static void Hi() { System.out.println("�ȳ�"); }
	private static void Hi(String msg) { System.out.println(msg); }
}
