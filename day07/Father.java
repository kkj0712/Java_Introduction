package day07;

public class Father extends GrandFather {
	String str="아버지"; //멤버변수
	
	public Father() {
		System.out.println(str+" 생성자 ");
	}
	
	public Father(String msg) {
		System.out.println(msg);
	}
	
	public void fatherPrint() {
		System.out.println("father print 메소드");
	}
	
	public void methodTest() {
		System.out.println("test method");
	}
	
	//오버라이드. (메소드 오버라이딩) 상속관계에 있어서 부모의 것을 자식이 재정의 하는 것.
	//(오버로딩: 메소드나 생성자 이름은 같은데 괄호안에 들어있는 매개변수가 달라서 다르게 접근하는 것)
	public void grandPrint() { //할아버지 메소드. 오버라이딩 됨. 할아버지가 아니라 아버지에 있는 것이 출력됨.
		System.out.println("할아버지 grandPrint 메소드를 father가 수정함");
	}
}
