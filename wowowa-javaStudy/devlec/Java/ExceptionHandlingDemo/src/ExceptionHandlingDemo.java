// ���� ó��(���� ó��)
public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		
		int i = 3;
		int j = 0;

		int r = 0;
		
		//r = 3 / 0;  //[1] �������� ������ �߻� => ������ ���� => Java ���������Ͱ� �˾Ƽ� �߻�
		//r = i / j; //[2] ��Ÿ�� ���� => �����ϵǰ�, ��������� ������ �߻� => �׽�Ʈ ����  	
		// ���� ���ϴ� �� : i - j�ε�, ������ �Ǽ��� i + j => [3] �� ���� : ���� ���α׷��� ����
		//r = i + j;
		
		// ���� ó�� ���� : try~catch~finally��
		try
		{
			// ���������� ���ܸ� �߻��Ϸ���???
			//throw new Exception("�ƹ� ���� �߻�");
			throw new ArithmeticException();
//			r = i / j; 
//			System.out.println(r);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		catch (Exception e)
		{			
			System.out.println("������ �߻���... : " + e);
			//System.exit(1); // <= ���� �������� ���α׷� ����, 0�̸� ��������, 1�̸� ����������
		}		
		finally
		{
			System.out.println("���α׷��� �����մϴ�.");
		}
		
	}
}
