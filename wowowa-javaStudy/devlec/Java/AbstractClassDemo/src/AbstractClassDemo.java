// �߻�(Abstract) Ŭ���� : �ٸ� Ŭ�������� ����� �ֱ� ���� Ŭ���� ���� ������ �ϴ� Ŭ����
// Ŭ������ ���� ���輭 ����, ȸ�系�� ǥ�� ����(�ݵ�� �� �̸����� ��� ����)

// �θ�/Parent/Base/Super Ŭ����
abstract class Hyundai {
	// �Ϲ� ���
	public void run() { System.out.println("�޸���."); }
	// �߻� �޼��� : �ڽ� Ŭ�������� ���������� �ݵ�� �����ض�~
	abstract void left(); // ��ȸ�� ������Ÿ��
	abstract void right(); // ��ȸ�� ��... ǥ��...
}
// �ڽ�/Child/Sub/Derived(�Ļ�) Ŭ����
class Car extends Hyundai {
	void left() { System.out.println("��ȸ���ϴ�."); }
	void right() { System.out.println("��ȸ���ϴ�."); }
}
public class AbstractClassDemo {
	public static void main(String[] args) {
		Car car = new Car(); car.run(); car.left(); car.right(); 
	}
}
