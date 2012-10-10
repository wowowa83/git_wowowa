/* 
 *  산술 연산자 : +, -, *, /, %(나머지)
 * 
 * 	피연산자 + 피연산자
 * */
public class ArithmeticOperatorDemo {
	public static void main(String[] args) {		
		int l = 3 + 5; // 리터럴
		System.out.println(l); // 8
		
		int a = 3;
		int b = 5;
		int c = a + b + 2; // 변수 + 변수 + 상수
		System.out.println(c); // 10
		
		int num1 = 3;
		int num2 = -2;
		int num3 = num1 - num2; 
		System.out.println(num3);
		
		int data1 = 3; 
		int data2 = 4;
		int data3 = 5;
		// (3 + 4 * 5) / 2 => 23 / 2 = 11.5
		//double result = (data1 + data2 * data3) / 2.0; 
		double result = (data1 + data2 * data3) / (double)2; 
		float result2 = (data1 + data2 * data3) / 2.0f; // 접미사 f
		System.out.println(result + ", " + result2);
		
		// 나머지(%) 연산자 : 피연산자 % 피연산자 => 몫, 나머지(!)
		int mod1 = 3; 
		int mod2 = 5;
		int modResult = mod1 % mod2; // 3 나누기 5 했을때의 몫이 아닌 나머지값? 3 / 5 = 0, 3
		System.out.print(modResult); // 3
	}
}




