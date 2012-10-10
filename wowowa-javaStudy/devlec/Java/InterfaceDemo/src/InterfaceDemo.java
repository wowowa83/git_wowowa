// �������̽� : ���� ����, ǥ��(������)
// ��) �ڵ��� ����� ���� �� ����
// �������̽� : �ڵ����� ��ɿ� ���� ������ ǥ��
interface IStandard {
	void run(); // ��� �ڵ����� run�̶�� �ܾ�� �����ΰ�(����) ����
}
// �߻� Ŭ���� : �߻� �޼���� �Ϲ� ����� ���� : ǥ��/�Ծ�/����+����
abstract class KS {
	abstract void back(); // back�̶�� �ܾ ����... ����
	public void left() { } // �Ϲ� ��������� ������ ����
} 
// �Ϲ� Ŭ���� => final Ű���带 �ٿ��� ����(������/����) Ŭ���� ����
final class Hyundai extends KS implements IStandard {
	public void run() { System.out.println("�����ϴ�."); }
	public void back() { System.out.println("�����ϴ�."); }
	public void left() { System.out.println("��ȸ���ϴ�."); } // override
}
//class Spy extends Hyundai { } // Hyundai Ŭ������ ���� Ŭ�����̱⿡ ��� ����
// �׽�Ʈ
public class InterfaceDemo {
	public static void main(String[] args) {
		// Hyundai ���赵�κ��� ��ü �����ؼ� ���
		Hyundai sonata = new Hyundai(); 
		sonata.run(); sonata.back(); sonata.left();   
	}
}
