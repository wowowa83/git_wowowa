public class ArrayThreeDemo {
	public static void main(String[] args) {
		// 3���� �迭 ���� / ��Ҽ� ���� / �ʱ�ȭ : ��/��/��
		//int [][][] arr = new int[2][2][2];
		//arr[0][0][0] = 1;
		//arr[1][1][1] = 8;
		int [][][] arr = {
			{{1, 2},{3, 4}}, // 1��
			{{5, 6},{7, 8}}  // 2��
		};
		// ��(��), ��, ���� �����ؼ� ���
		for (int i = 0; i < arr.length; i++ ) { // ��(��)
			for (int j = 0; j < arr[i].length; j++) { // ��
				for (int k = 0; k < arr[i][j].length; k++) { // ��
					System.out.print(arr[i][j][k]);					
				}
				System.out.println(); // �ٹٲ�
			}			
			System.out.println(); // �ٹٲ�
		}
	}
}
