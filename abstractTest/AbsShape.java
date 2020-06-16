package abstractTest;

public abstract class AbsShape {
	/*
	 *그리다. 원을 그리면 원을 그리다. 사각형을 그리면 사각형을 그리다. 
	 *자식 클래스들에 따라 구현되도록. 
	 *그러려면 추상 메소드를 만들어놓고 클래스도 추상클래스로 변하게.
	 */
	public abstract void draw();
	//이동하다
	public abstract void move();
	
	public void print() {
		System.out.println("도형그리다");
	}
	
}
