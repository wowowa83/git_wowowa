// 함수(Function/Sub Procedure) -> 메소드/메쏘드/메서드(Method)
public class FunctionDemo {
	// 메인 메서드(함수)
	public static void main(String[] args) {
		//[!] 함수 호출(Call)
		hi(); hi(); 
		hello("반갑습니다."); hello("또 만나요.");
		int r = square(2);
		System.out.println("넘겨온 값은 : " + r);
		show("메서드 오버로드");
		show("메서드 오버로딩", 3);
	}
	//[1] 매개변수(Parameter;Argument)도 없고 반환값도 없는(void) 함수 선언
	public static void hi() {
		System.out.println("안녕하세요."); 
	}
	//[2] 매개변수(인자/인수/파라미터)가 있는 함수 선언
	public static void hello(String msg) {
		System.out.println(msg); // hello 함수(메서드)에 넘겨온 값을 출력 
	}
	//[3] 매개변수도 있고, 반환값(Return Value)도 있는 함수 선언
	public static int square(int i) { // 2 => 2 * 2 반환, 4 => 4 * 4 반환	
		int r = i * i; // 넘겨온 매개체가 되는 변수를 두번 곱한다.
		return r; // 함수를 호출한 쪽으로 결과값을 반환 
	}
	//[4] 함수 중복 : 메서드 오버로드/오버로딩 : method overload(다중 정의 : 여러번 정의)
	// 같은 클래스내에 동일한 이름의 함수(메서드)를 매개변수를 달리하여 여러번 정의
	public static void show(String msg) { System.out.println(msg); } // 넘겨온 문자열 출력
	public static void show(String msg, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(msg); // 넘겨온 문자열을 count만큼 반복해서 출력 
		}
	} 
}


