// 일차원 배열
// 변수 : 하나의 이름으로 하나의 데이터형식을 하나만 저장하는 그릇 
// 배열 : 하나의 이름으로 하나의 데이터형식을 여러개 저장 가능한 공간
public class ArrayOneDemo {
	public static void main(String[] args) {
		// 지역 변수
		int v = 10;		
		// 배열 선언
		int [] arr;
		// 배열의 요소수 생성
		arr = new int[3];
		// 배열 초기화
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		// 배열 사용
		//System.out.println(arr[1]); // 20
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);			
		}
	}
}
