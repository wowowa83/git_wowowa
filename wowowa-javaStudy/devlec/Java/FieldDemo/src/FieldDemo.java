// 필드(Field) : 클래스내에 선언된 변수(Variable) / 상수(Constant)
// 필드의 역할 : 클래스(자동차설계도)의 인스턴스(자동차객체)의 속성(필드;색상/크기)
class FieldTest {
	// 필드 : 멤버 변수 -> public한 필드 = 속성(Property)
	public String name;
	public int age;
	private String addr;
	public final String PROJECT_NAME = "필드 데모"; // 상수명은 대문자로 하자.
}
public class FieldDemo {
	//[2] 전역 변수(Global Variable) -> 멤버 변수 -> 필드(Field)
	public static int age = 21; 
	public static final double PI = 3.14; // 상수 : final / const
	public static void main(String[] args) {
		//[1] 지역 변수(Local Variable)
		String name = "홍길동";
		System.out.println(name);
		System.out.println(age);
		//[!] 다른 클래스의 필드에 접근
		FieldTest ft = new FieldTest(); // 클래스의 인스턴스 생성
		ft.name = "백두산"; // set
		ft.age = 100;
		System.out.println(
				ft.PROJECT_NAME + "," + ft.name + ", " + ft.age); // get		
		//[!] 상수에 접근
		//PI = 3.10; // 상수에 나중에 값을 할당하려고하면 무조건 에러
		System.out.println(PI);
	}
}




