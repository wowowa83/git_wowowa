// String 클래스의 주요 메서드 정리
public class StringDemo {
	public static void main(String[] args) {
		String str = " Abc Def Fed Cba ";
		
		System.out.println(str); // 전체 출력
		System.out.println(str.length()); // 문자열의 길이		
		System.out.println(str.charAt(5)); // 특정 인덱스에 해당하는 문자 검색 : D
		System.out.println(str.indexOf("Fed")); // 특정 문자열이 몇번째 인덱스에 위치하는지 : 9
		System.out.println(str.indexOf("XYZ")); // 특정 문자열이 몇번째 인덱스에 위치하는지		
		System.out.println(str.lastIndexOf("e")); // 뒤에서부터 검색. 단, 인덱스는 앞에서부터 : 10 
		System.out.println(str.indexOf("e", 7));// n번째 인덱스 이후로 검색 : 10	
		System.out.println(str.trim().length()); // 공백 제거 : 17-2=15
		// 문자열 치환, 공백(white space) 제거 후 Abc => aBC
		System.out.println(str.replace(" ", "").replace("Abc", "aBC")); 
		System.out.println(str.substring(5, 8)); // n번째 인덱스~m번째 인덱스까지의 문자열 검색
		System.out.println(str.substring(5)); // n번째 인덱스 이후의 문자열 검색
		char[] buff = new char[3];
		str.getChars(5, 8, buff, 0); // buff = "Def";
		System.out.println(buff); 	
		
		String s1 = "Test";
		String s2 = "test";
		System.out.println(s1 == s2); // false
		System.out.println(s1.equalsIgnoreCase(s2)); // 대소문자 구분하지 않고 비교
		
		String url = "http://www.JavaCampus.com";
		System.out.println(url.startsWith("http")); // ~로 시작하는지 : true
		System.out.println(url.endsWith(".net")); // ~로 끝나는지 : false
		
		int year = 2011;
		System.out.println(year + year); // 성질 자체를 문자열로 변환
		System.out.println(String.valueOf(year) + String.valueOf(year)); // 성질 자체를 문자열로 변환
		
		System.out.println("abcd".toUpperCase()); // 대문자로 출력
		System.out.println("AbCd".toLowerCase()); // 소문자로 출력
	}
}
