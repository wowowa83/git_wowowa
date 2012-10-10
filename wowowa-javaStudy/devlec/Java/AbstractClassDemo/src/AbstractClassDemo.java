// 추상(Abstract) 클래스 : 다른 클래스에게 상속을 주기 위한 클래스 명세서 역할을 하는 클래스
// 클래스에 대한 설계서 역할, 회사내의 표준 정의(반드시 그 이름으로 기능 구현)

// 부모/Parent/Base/Super 클래스
abstract class Hyundai {
	// 일반 멤버
	public void run() { System.out.println("달리다."); }
	// 추상 메서드 : 자식 클래스에게 강제적으로 반드시 구현해라~
	abstract void left(); // 좌회전 프로토타입
	abstract void right(); // 우회전 명세... 표준...
}
// 자식/Child/Sub/Derived(파생) 클래스
class Car extends Hyundai {
	void left() { System.out.println("좌회전하다."); }
	void right() { System.out.println("우회전하다."); }
}
public class AbstractClassDemo {
	public static void main(String[] args) {
		Car car = new Car(); car.run(); car.left(); car.right(); 
	}
}
