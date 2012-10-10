// String Ŭ������ �ֿ� �޼��� ����
public class StringDemo {
	public static void main(String[] args) {
		String str = " Abc Def Fed Cba ";
		
		System.out.println(str); // ��ü ���
		System.out.println(str.length()); // ���ڿ��� ����		
		System.out.println(str.charAt(5)); // Ư�� �ε����� �ش��ϴ� ���� �˻� : D
		System.out.println(str.indexOf("Fed")); // Ư�� ���ڿ��� ���° �ε����� ��ġ�ϴ��� : 9
		System.out.println(str.indexOf("XYZ")); // Ư�� ���ڿ��� ���° �ε����� ��ġ�ϴ���		
		System.out.println(str.lastIndexOf("e")); // �ڿ������� �˻�. ��, �ε����� �տ������� : 10 
		System.out.println(str.indexOf("e", 7));// n��° �ε��� ���ķ� �˻� : 10	
		System.out.println(str.trim().length()); // ���� ���� : 17-2=15
		// ���ڿ� ġȯ, ����(white space) ���� �� Abc => aBC
		System.out.println(str.replace(" ", "").replace("Abc", "aBC")); 
		System.out.println(str.substring(5, 8)); // n��° �ε���~m��° �ε��������� ���ڿ� �˻�
		System.out.println(str.substring(5)); // n��° �ε��� ������ ���ڿ� �˻�
		char[] buff = new char[3];
		str.getChars(5, 8, buff, 0); // buff = "Def";
		System.out.println(buff); 	
		
		String s1 = "Test";
		String s2 = "test";
		System.out.println(s1 == s2); // false
		System.out.println(s1.equalsIgnoreCase(s2)); // ��ҹ��� �������� �ʰ� ��
		
		String url = "http://www.JavaCampus.com";
		System.out.println(url.startsWith("http")); // ~�� �����ϴ��� : true
		System.out.println(url.endsWith(".net")); // ~�� �������� : false
		
		int year = 2011;
		System.out.println(year + year); // ���� ��ü�� ���ڿ��� ��ȯ
		System.out.println(String.valueOf(year) + String.valueOf(year)); // ���� ��ü�� ���ڿ��� ��ȯ
		
		System.out.println("abcd".toUpperCase()); // �빮�ڷ� ���
		System.out.println("AbCd".toLowerCase()); // �ҹ��ڷ� ���
	}
}
