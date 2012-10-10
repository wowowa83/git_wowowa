// 메서드 오버라이드(override) : 재 정의/덮어쓰기/새롭게 정의...
class P {
	public void Say() { System.out.println("안녕"); }
	public void Run() { System.out.println("달리다"); }
}
class C extends P {
	// 부모의 기능을 재정의 / 업그레이드...
	public void Say() { System.out.println("방가"); }
	public void Run() { 
		super.Run(); // 부모 멤버의 Run 기능 + 자식의 Run 기능
		System.out.println("또 달리다"); 
	}
}
public class MethodOverrideDemo {
	public static void main(String[] args) {
		Hi(); Hi("방가");
		// 자식 클래스의 인스턴스 생성
		C c = new C(); c.Say(); c.Run();
	}	
	// 메서드 오버로드(overload) : 다중 정의
	private static void Hi() { System.out.println("안녕"); }
	private static void Hi(String msg) { System.out.println(msg); }
}
