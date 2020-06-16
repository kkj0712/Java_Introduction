package interfaceTest;
interface InterTest{
	public void test();
}

//전부다 추상이라면 추상클래스라 안붙이고 interface를 붙인다.
interface InterShape{
	public void draw();
	public void move();
	public void print();
}
//interface는 extends가 아닌 implements를 사용.
class InterCircle implements InterShape, InterTest{
	//하위 클래스가 상위 추상 클래스의 메소드를 부를때는 구현(중괄호 {})해야함.꼭.
	//InterTest도 상속받았기 때문에 test(){}도 구현.
	public void draw() {}
	public void move() {}
	public void print() {}
	public void test() {}
}

class Inter {
	public void interTest() {
	}
}

//자바는 다중 상속이 안되게끔 되어있는데 다중 상속을 받아야할때는 이렇게 표현.
//상속을 받고 interface를 써줌.
class InterRectangle extends Inter implements InterShape,
InterTest{
	public void draw() {}
	public void move() {}
	public void print() {}
	public void test() {}
}

public class InterExam {

}