// �־��� �����Ϳ��� ���� ū ���� ���ϴ� ���α׷�
public class MaxDemo {
	public static void main(String[] args) {
		// Input
		int [] data = { -3, -5, -2, -7, -6, -1}; // -1
		int max = Integer.MIN_VALUE; 
		// Process : Max �˰���
		for (int i = 0; i < data.length; i++)
		{
			if (max < data[i]) // max������ ������ �� �����Ͱ� ũ��
			{
				max = data[i]; // ū ������ �缳��
			}
		}
		// Output
		System.out.println("�ִ밪 : " + max); // -1
	}
}
