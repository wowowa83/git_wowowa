
// 데이터 형식과 변수(Data Type and Variable)
// 변수(Variable) : 하나의 이름으로 하나의 데이터 형식을 하나만 보관할 수 있는 그릇 역할
// 숫자, 문자, 참 또는 거짓, 문자열, ...

// 자바의 기본 코드(원시 코드) 작성
public class DataTypeAndVariableDemo
{
	// 자바 코드의 시작점(Entry Point) : main 메소드
	public static void main(String[] args)
	{
		// 실제 코드 작성 부분
		//[1] 정수형
		int i; // 변수 선언	: 32bit : -21억 + 21억 	
		i = 1234; // 변수 초기화
		System.out.println("i = " + i); // 변수 사용(참조) 1234		
		
		byte b = 127; // -128~127 : byte 8bit(왼쪽 1bit는 부호비트) : -2^7~2^7
		System.out.println("b = " + b);
		
		short s = 32767; // 16bit : 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, ..., 1048576
		System.out.println("s = " + s);
		
		long l = 1234L; // L 접미사
		System.out.println("l = " + l);
		
		//[2] 실수형
		float f = 0.123F; // F, f, 32bit
		System.out.println("f = " + f);
		
		double d = 0.1234; // 64bit
		System.out.print("d = " + d + '\n'); // 줄바꿈 하지 않음, \n : 이스케이프 시퀀스 : 특수문자 : 한칸 내림				
		
		//[3] 논리형
		boolean bool = true; // true, false, 참 또는 거짓
		bool = false; 
		System.out.println("bool = " + bool);
		
		//[4] 문자형
		char c = 'A'; // 작은(홑) 따옴표로 묶어야 함
		char uc = '\u0041'; // A
		char kor = '박'; // 한글 : Java 2byte 코드
		System.out.println("c = " + c + ", uc = " + uc + ", kor = " + kor);
		
		//[5] 문자열 : String 클래스형 변수 선언
		String str = "안녕하세요. 반갑습니다. 또 만나요...";
		System.out.println("str = " + str);
		
		// 결과값 출력 : System 클래스의 out 속성(PrintStream클래스 형 변수)의 println() 메서드 호출
		System.out.println("프로그램 종료.");		
	}
}

