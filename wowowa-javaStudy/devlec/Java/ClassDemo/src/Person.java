
public class Person {
	// ��� ���� : �ʵ�
	public String name;
	public int age;
	public char gender; // F/M
	// ��� �޼���(���)
	public void printName()
	{
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		String gen = "����";
		if (gender == 'M')
		{
			gen = "����";
		}	
		System.out.println("���� : " + gen + "\n");
	}
}
