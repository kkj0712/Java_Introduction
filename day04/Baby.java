package day04;

public class Baby { //클래스는 보통 대문자로 시작하게끔 표현
	String name;
	int age;
	
	public Baby() {
	}
	
	public Baby(String name) {
		this.name=name;
	}
	
	public void smile() {
		System.out.println(name+" 웃는다.");
	}
	
	public void cry() {
		System.out.println(name+" 운다.");
	}
	
	
	
	public static void main(String[] args) {
		//Baby 객체 b1을 만들고
		//이름 베이비1 나이 2
		//베이비1 이 웃는다
		Baby b1=new Baby();
		b1.name="베이비1";
		b1.age=2;
		b1.smile();
		
		//Baby 객체 b2을 만들고
		//이름 베이비2 나이 1
		//베이비2 이 운다
		Baby b2=new Baby();
		b2.name="베이비2";
		b2.age=1;
		b2.cry();
		
	}

}
