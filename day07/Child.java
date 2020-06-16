package day07;

public class Child extends Father { //Child는 Father걸 다 쓸 수 있다. 상속받는다.
	//이미 만들어져 있는걸 갖다 쓸 수 있기 때문에 중복을 최소화 할 수 있다. 코드가 간략해짐.
	//상속 받았기 때문에 무조건 생성자를 먼저 수행하고 자신의 메소드를 수행
	//자바에서 다중상속은 안되고 단일상속만 된다.

	public Child() {
//		super("부모를 호출"); //super();는 부모의 생성자를 부르는 말. 생략 가능하다.
		//super(인자); 
		System.out.println("자식 생성자");
	}
	
	public void childPrint() {
		System.out.println(super.str); //this가 자기 자신의 객체를 불렀던 것처럼, 괄호 없는 super는 부모의 객체를 부른다.
		System.out.println("child print 메소드");
	}
	
	public void test() {
		System.out.println("test method");
	}
}
