// 주어진 데이터에서 가장 큰 값을 구하는 프로그램
public class MaxDemo {
	public static void main(String[] args) {
		// Input
		int [] data = { -3, -5, -2, -7, -6, -1}; // -1
		int max = Integer.MIN_VALUE; 
		// Process : Max 알고리즘
		for (int i = 0; i < data.length; i++)
		{
			if (max < data[i]) // max변수의 값보다 비교 데이터가 크면
			{
				max = data[i]; // 큰 값으로 재설정
			}
		}
		// Output
		System.out.println("최대값 : " + max); // -1
	}
}
