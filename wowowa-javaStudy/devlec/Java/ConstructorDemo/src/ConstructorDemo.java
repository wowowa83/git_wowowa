// ������
// Ŭ����
class Person {
	// �ʵ�/�Ӽ�/�������
	public String name;
	public int age; 
	// ������(�⺻)
	public Person() {
		// �ʵ忡 ���ؼ� �⺻���� �ְ����Ѵٸ�?
		name = "�Ӳ���"; age = 30; 
	}
	// �Ű������� �ִ� ������ : ������(�޼���) �����ε�(�����ε�;overload) : ���� ����
	public Person(String name, int age)	{
		this.name = name; // �� : �ʵ�, �� : �Ű����� 
		this.age = age; 
	}
	// �޼���
	public void show() {
		System.out.println("�̸� : " + this.name + "\n���� : " + age);		
	}
}
public class ConstructorDemo {
	public static void main(String[] args) {
		Person p1; // Person Ŭ������ ���� p1 ����
		p1 = new Person(); // Person Ŭ������ �⺻ �����ڸ� ���ؼ� ��ü ����
		p1.name = "ȫ�⵿"; p1.age = 21; p1.show(); 		
		Person p2 = new Person(); p2.show();
		Person p3 = new Person("��λ�", 100); p3.show(); 	
	}
}