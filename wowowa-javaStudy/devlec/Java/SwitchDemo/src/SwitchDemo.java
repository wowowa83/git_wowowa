// switch문 : 다중 if문의 또다른 표현 형태
// 시간에 따른 서로 다른 메시지 출력
// 월에 해당되는 영문 이름을 출력
public class SwitchDemo {
	public static void main(String[] args) {
		// 시간대마다 서로 다른 메시지 출력
		int hour = 22;
		/*
		if (hour == 19)	{
			System.out.println("저녁 7시에 해당하는 메시지 출력");			
		}
		else if (hour == 20) {
			System.out.println("저녁 8시에 해당하는 메시지 출력");						
		}
		else {
			System.out.println("컴퓨터 고장");
		}
		*/
		
		switch (hour)
		{
			case 19: 
				System.out.println("저녁 7시에 해당하는 메시지 출력");
				break;
			case 20:
				System.out.println("저녁 8시에 해당하는 메시지 출력");
				break;				
			case 21:
				System.out.println("저녁 9시에 해당하는 메시지 출력");
				break;				
			case 22:
				System.out.println("저녁 10시에 해당하는 메시지 출력");
				break;	
			default:
				System.out.println("컴퓨터 고장");
				break;	
		}
		
	}
}
