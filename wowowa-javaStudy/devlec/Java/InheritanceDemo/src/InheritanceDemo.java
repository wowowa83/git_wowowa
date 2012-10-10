// 상속(Inheritance) : 부모 타입의 기능을 자식 타입에서 재 사용
// public > protected > default > private
// public : 공용, protected : 다른 패키지에서도 상속 가능, 
// 생략 : 같은 패키지에서 상속 가능, private : 상속 불가
class Parent
{
	protected void Hi()
	{
		System.out.println("안녕하세요.");
	}
}
class Child extends Parent // Parent 클래스의 멤버 상속
{
	public void Hello() { System.out.println("반갑습니다."); }
}
public class InheritanceDemo {
	public static void main(String[] args) {
		Parent p = new Parent(); p.Hi();  
		Child c = new Child(); c.Hi(); c.Hello();
	}
}
