public class ArrayTwoDemo {
	public static void main(String[] args) {
		// ������ �迭 ����
		int [][] data = {{10, 20, 30}, {40, 50, 60}}; //new int[2][3]; // 6�� ������ ����
		// �ʱ�ȭ
		//data[0][0] = 10;
		//data[0][1] = 20;
		//data[0][2] = 30;		
		//data[1][0] = 40;
		//data[1][1] = 50;
		//data[1][2] = 60;
		// ����
		//System.out.println(data.length); // 2
		//System.out.println(data[0].length); // 0, 1 
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + "\t"); // �� ���				
			}
			System.out.println(); // �� ��� 
		}
	}
}
