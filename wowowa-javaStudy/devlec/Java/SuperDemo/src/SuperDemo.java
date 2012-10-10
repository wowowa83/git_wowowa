// 부모 클래스 : super 클래스
class P {
	public String word; // 필드
	public P() {
		this.word = "안녕하세요.";
	}
	public P(String word) {
		this.word = word; // this.필드 = 매개변수;
	}
}
class C extends P {
	public C(){}
	public C(String word) { 
		super(word); // 부모의 생성자 접근 : super();
	}
	public void say() { 
		System.out.println(super.word); // 부모의 멤버에 접근 super.멤버명 
	}
}
public class SuperDemo {
	public static void main(String[] args) {
		C c = new C(); c.say(); 
		//P p = new P("반갑습니다.");
		C c2 = new C("반갑습니다."); c2.say();  
	}
}
