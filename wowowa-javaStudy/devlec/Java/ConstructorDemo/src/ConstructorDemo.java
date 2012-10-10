// 생성자
// 클래스
class Person {
	// 필드/속성/멤버변수
	public String name;
	public int age; 
	// 생성자(기본)
	public Person() {
		// 필드에 대해서 기본값을 주고자한다면?
		name = "임꺽정"; age = 30; 
	}
	// 매개변수가 있는 생성자 : 생성자(메서드) 오버로드(오버로딩;overload) : 다중 정의
	public Person(String name, int age)	{
		this.name = name; // 앞 : 필드, 뒤 : 매개변수 
		this.age = age; 
	}
	// 메서드
	public void show() {
		System.out.println("이름 : " + this.name + "\n나이 : " + age);		
	}
}
public class ConstructorDemo {
	public static void main(String[] args) {
		Person p1; // Person 클래스형 변수 p1 선언
		p1 = new Person(); // Person 클래스의 기본 생성자를 통해서 객체 생성
		p1.name = "홍기동"; p1.age = 21; p1.show(); 		
		Person p2 = new Person(); p2.show();
		Person p3 = new Person("백두산", 100); p3.show(); 	
	}
}