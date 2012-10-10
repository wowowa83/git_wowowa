// 3항(조건) 연산자 : 항1 ? 항2 : 항3;
public class ConditionalOperatorDemo {
	public static void main(String[] args) {

		// 3항 연산자 : (조건) ? 참 : 거짓;
		System.out.println( (3 != 5) ? "다르다" : "나올리가 없다." );
		
		// 조건 판단
		int i = 10; 
		String msg = "";
		boolean bln = (i % 2 == 0) && !(i % 2 != 1); // && : ~이고 그리고, || : ~이거나 또는
		
		msg = (bln == true) ? "참" : "거짓" ; 
		System.out.println(msg);
		
		// 뒤에서 조건문 : if문
		if (bln == true)
		{
			msg = "참";
		}
		else	
		{
			msg = "거짓";
		}
		System.out.println(msg);
		
	}
}
