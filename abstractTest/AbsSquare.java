package abstractTest;

public class AbsSquare extends AbsShape {
	public void draw() { //반드시 선언해줘야함. 부모 클래스인 AbsShape은 추상클래스이기 때문에 그 안에 있는 추상메소드를 구현하도록 해야함.
		System.out.println("사각형 그리기");
	}
	public void move() {
		System.out.println("사각형 이동하기");
	}
}
