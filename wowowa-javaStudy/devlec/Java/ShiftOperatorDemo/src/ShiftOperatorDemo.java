// 시프트(Shift) 연산자
// << : 왼쪽 시프트 : 비트 당 2배
// >> : 오른쪽 쉬프트 : 비트당 1/2배
public class ShiftOperatorDemo {
	public static void main(String[] args) {

		int num = 0;
		int result = 0;
		
		num = 2;
		result = num << 2; // num의 비트값을 왼쪽으로 2칸 이동 => 8
		System.out.println(result);
		
		num = 40;
		result = num >> 2; // 비트값을 오른쪽으로 2칸 이동 => 40 * 1/4 => 10 
		System.out.println(result);
		
	}
}
