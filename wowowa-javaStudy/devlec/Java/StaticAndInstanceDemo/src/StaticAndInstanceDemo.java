// Ŭ���� ����
// ��ǰ Ŭ����
class Product {
	public static String modelName; // ��ǰ�� ���� ����
	public static int unitPrice; // �ܰ�
	public static void print() { System.out.println(modelName + ", " + unitPrice); }
}
// �� Ŭ����
class Customer {
	public String name; // ����
	public int age; // ����
	public void print() { System.out.println(name + ", " + this.age); } // this : ��ü/�ν��Ͻ�
}
public class StaticAndInstanceDemo {
	public static void main(String[] args) {
		// Product Ŭ������ ����� �����ϰ��� �Ѵٸ�?
		// Ŭ������.����� : ���� ����� ����/������ ����
		Product.modelName = "���� ���� �ڹ� ����"; Product.unitPrice = 33000;
		Product.print(); 
		// Customer Ŭ������ ����� �����ϰ��� �Ѵٸ�?
		// �ν��Ͻ� ���� : ��ü.���
		Customer cust1 = new Customer(); // Ŭ������ �ν��Ͻ�(��ü;��ü) ����
		cust1.name = "ȫ�浿"; cust1.age = 21; cust1.print();
		Customer cust2 = new Customer();
		cust2.name = "��λ�"; cust2.age = 100; cust2.print(); 
	}
}
