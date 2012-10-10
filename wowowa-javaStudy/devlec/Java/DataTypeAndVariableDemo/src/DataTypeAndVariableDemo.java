
// ������ ���İ� ����(Data Type and Variable)
// ����(Variable) : �ϳ��� �̸����� �ϳ��� ������ ������ �ϳ��� ������ �� �ִ� �׸� ����
// ����, ����, �� �Ǵ� ����, ���ڿ�, ...

// �ڹ��� �⺻ �ڵ�(���� �ڵ�) �ۼ�
public class DataTypeAndVariableDemo
{
	// �ڹ� �ڵ��� ������(Entry Point) : main �޼ҵ�
	public static void main(String[] args)
	{
		// ���� �ڵ� �ۼ� �κ�
		//[1] ������
		int i; // ���� ����	: 32bit : -21�� + 21�� 	
		i = 1234; // ���� �ʱ�ȭ
		System.out.println("i = " + i); // ���� ���(����) 1234		
		
		byte b = 127; // -128~127 : byte 8bit(���� 1bit�� ��ȣ��Ʈ) : -2^7~2^7
		System.out.println("b = " + b);
		
		short s = 32767; // 16bit : 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, ..., 1048576
		System.out.println("s = " + s);
		
		long l = 1234L; // L ���̻�
		System.out.println("l = " + l);
		
		//[2] �Ǽ���
		float f = 0.123F; // F, f, 32bit
		System.out.println("f = " + f);
		
		double d = 0.1234; // 64bit
		System.out.print("d = " + d + '\n'); // �ٹٲ� ���� ����, \n : �̽������� ������ : Ư������ : ��ĭ ����				
		
		//[3] ����
		boolean bool = true; // true, false, �� �Ǵ� ����
		bool = false; 
		System.out.println("bool = " + bool);
		
		//[4] ������
		char c = 'A'; // ����(Ȭ) ����ǥ�� ����� ��
		char uc = '\u0041'; // A
		char kor = '��'; // �ѱ� : Java 2byte �ڵ�
		System.out.println("c = " + c + ", uc = " + uc + ", kor = " + kor);
		
		//[5] ���ڿ� : String Ŭ������ ���� ����
		String str = "�ȳ��ϼ���. �ݰ����ϴ�. �� ������...";
		System.out.println("str = " + str);
		
		// ����� ��� : System Ŭ������ out �Ӽ�(PrintStreamŬ���� �� ����)�� println() �޼��� ȣ��
		System.out.println("���α׷� ����.");		
	}
}

