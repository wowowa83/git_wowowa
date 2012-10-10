// 인터페이스 : 설계 레벨, 표준(강제성)
// 예) 자동의 기능을 설계 및 구현
// 인터페이스 : 자동차의 기능에 대한 전세계 표준
interface IStandard {
	void run(); // 모든 자동차는 run이라는 단어로 무엇인가(전진) 구현
}
// 추상 클래스 : 추상 메서드와 일반 멤버를 갖음 : 표준/규약/설계+구현
abstract class KS {
	abstract void back(); // back이라는 단어를 강제... 설계
	public void left() { } // 일반 멤버에대한 구현도 가능
} 
// 일반 클래스 => final 키워드를 붙여서 최종(마지막/봉인) 클래스 변경
final class Hyundai extends KS implements IStandard {
	public void run() { System.out.println("전진하다."); }
	public void back() { System.out.println("후진하다."); }
	public void left() { System.out.println("좌회전하다."); } // override
}
//class Spy extends Hyundai { } // Hyundai 클래스는 최종 클래스이기에 상속 금지
// 테스트
public class InterfaceDemo {
	public static void main(String[] args) {
		// Hyundai 설계도로부터 객체 생성해서 사용
		Hyundai sonata = new Hyundai(); 
		sonata.run(); sonata.back(); sonata.left();   
	}
}
