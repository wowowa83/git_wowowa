public class ArrayThreeDemo {
	public static void main(String[] args) {
		// 3차원 배열 선언 / 요소수 생성 / 초기화 : 층/행/열
		//int [][][] arr = new int[2][2][2];
		//arr[0][0][0] = 1;
		//arr[1][1][1] = 8;
		int [][][] arr = {
			{{1, 2},{3, 4}}, // 1층
			{{5, 6},{7, 8}}  // 2층
		};
		// 층(면), 행, 열을 구분해서 출력
		for (int i = 0; i < arr.length; i++ ) { // 층(면)
			for (int j = 0; j < arr[i].length; j++) { // 행
				for (int k = 0; k < arr[i][j].length; k++) { // 열
					System.out.print(arr[i][j][k]);					
				}
				System.out.println(); // 줄바꿈
			}			
			System.out.println(); // 줄바꿈
		}
	}
}
