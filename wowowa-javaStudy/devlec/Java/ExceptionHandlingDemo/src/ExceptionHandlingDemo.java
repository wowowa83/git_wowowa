// 예외 처리(에러 처리)
public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		
		int i = 3;
		int j = 0;

		int r = 0;
		
		//r = 3 / 0;  //[1] 문법적인 오류가 발생 => 컴파일 에러 => Java 인터프리터가 알아서 발생
		//r = i / j; //[2] 런타임 에러 => 컴파일되고, 실행시점에 에러가 발생 => 테스트 많이  	
		// 고객이 원하는 것 : i - j인데, 개발자 실수로 i + j => [3] 논리 에러 : 많은 프로그래밍 경험
		//r = i + j;
		
		// 예외 처리 구문 : try~catch~finally절
		try
		{
			// 인위적으로 예외를 발생하려면???
			//throw new Exception("아무 예외 발생");
			throw new ArithmeticException();
//			r = i / j; 
//			System.out.println(r);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("0으로 나눌 수 없습니다.");
		}
		catch (Exception e)
		{			
			System.out.println("에러가 발생함... : " + e);
			//System.exit(1); // <= 여기 시점에서 프로그램 종료, 0이면 정상종료, 1이면 비정상종료
		}		
		finally
		{
			System.out.println("프로그램을 종료합니다.");
		}
		
	}
}
