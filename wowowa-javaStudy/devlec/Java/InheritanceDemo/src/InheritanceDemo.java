// ���(Inheritance) : �θ� Ÿ���� ����� �ڽ� Ÿ�Կ��� �� ���
// public > protected > default > private
// public : ����, protected : �ٸ� ��Ű�������� ��� ����, 
// ���� : ���� ��Ű������ ��� ����, private : ��� �Ұ�
class Parent
{
	protected void Hi()
	{
		System.out.println("�ȳ��ϼ���.");
	}
}
class Child extends Parent // Parent Ŭ������ ��� ���
{
	public void Hello() { System.out.println("�ݰ����ϴ�."); }
}
public class InheritanceDemo {
	public static void main(String[] args) {
		Parent p = new Parent(); p.Hi();  
		Child c = new Child(); c.Hi(); c.Hello();
	}
}
