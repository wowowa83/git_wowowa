// �θ� Ŭ���� : super Ŭ����
class P {
	public String word; // �ʵ�
	public P() {
		this.word = "�ȳ��ϼ���.";
	}
	public P(String word) {
		this.word = word; // this.�ʵ� = �Ű�����;
	}
}
class C extends P {
	public C(){}
	public C(String word) { 
		super(word); // �θ��� ������ ���� : super();
	}
	public void say() { 
		System.out.println(super.word); // �θ��� ����� ���� super.����� 
	}
}
public class SuperDemo {
	public static void main(String[] args) {
		C c = new C(); c.say(); 
		//P p = new P("�ݰ����ϴ�.");
		C c2 = new C("�ݰ����ϴ�."); c2.say();  
	}
}
