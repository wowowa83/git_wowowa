
public class Person {
	// 멤버 변수 : 필드
	public String name;
	public int age;
	public char gender; // F/M
	// 멤버 메서드(기능)
	public void printName()
	{
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		String gen = "여자";
		if (gender == 'M')
		{
			gen = "남자";
		}	
		System.out.println("성별 : " + gen + "\n");
	}
}
