
public class OtherClass {
	// 정적인 접근 : 멤버 메서드에 static을 붙이면 : 클래스명.멤버명
	public static void hello()
	{
		System.out.println("반갑습니다.");
	}
	// 인스턴스 접근 : static을 빼면 : 클래스의 인스턴스(객체) 생성 후 호출
	public void bye()
	{
		System.out.println("또 만나요.");
	}
}
