// ������ �迭
// ���� : �ϳ��� �̸����� �ϳ��� ������������ �ϳ��� �����ϴ� �׸� 
// �迭 : �ϳ��� �̸����� �ϳ��� ������������ ������ ���� ������ ����
public class ArrayOneDemo {
	public static void main(String[] args) {
		// ���� ����
		int v = 10;		
		// �迭 ����
		int [] arr;
		// �迭�� ��Ҽ� ����
		arr = new int[3];
		// �迭 �ʱ�ȭ
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		// �迭 ���
		//System.out.println(arr[1]); // 20
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);			
		}
	}
}
