// 클래스 : 하나의 이름으로 서로 다른 타입의 데이터를 여러개 보관 + 기능 포함
public class ClassDemo {
	// 메서드 : 엔트리 포인트 : 프로그램의 시작점
	public static void main(String[] args) {
		//[1] 
		hi(); // 같은 클래스내의 함수(메서드) 호출
		
		//[2] 메서드에 static 
		OtherClass.hello();
		
		//[3] 인스턴스 접근
		// OtherClass의 인스턴스(객체) 생성 : new 연산자를 사용해서
		OtherClass oc = new OtherClass();
		oc.bye(); // 객체명.멤버명(); 
		
		//[4] Person 클래스의 인스턴스 생성
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 21;
		p1.gender = 'M';
		p1.printName();
		
		Person p2 = new Person();
		p2.name = "백두산";
		p2.age = 100;
		p2.gender = 'F';
		p2.printName(); 
	}
	
	private static void hi()
	{
		System.out.println("안녕하세요.");
	}
}