// 클래스 설계
// 상품 클래스
class Product {
	public static String modelName; // 상품명 저장 공간
	public static int unitPrice; // 단가
	public static void print() { System.out.println(modelName + ", " + unitPrice); }
}
// 고객 클래스
class Customer {
	public String name; // 고객명
	public int age; // 나이
	public void print() { System.out.println(name + ", " + this.age); } // this : 객체/인스턴스
}
public class StaticAndInstanceDemo {
	public static void main(String[] args) {
		// Product 클래스의 멤버에 접근하고자 한다면?
		// 클래스명.멤버명 : 정적 멤버에 접근/정적인 접근
		Product.modelName = "쉽게 배우는 자바 강의"; Product.unitPrice = 33000;
		Product.print(); 
		// Customer 클래스의 멤버에 접근하고자 한다면?
		// 인스턴스 접근 : 객체.멤버
		Customer cust1 = new Customer(); // 클래스의 인스턴스(실체;객체) 생성
		cust1.name = "홍길동"; cust1.age = 21; cust1.print();
		Customer cust2 = new Customer();
		cust2.name = "백두산"; cust2.age = 100; cust2.print(); 
	}
}
