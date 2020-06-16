package day07;

public class Square extends Shape {
	private int w,h;
	
	public Square(int x, int y, int w, int h) {
		super(x,y);
		this.w=w;
		this.h=h;
	}
	//오버라이딩
	public void print() {
		super.print();
		System.out.println("너비: "+w);
		System.out.println("높이: "+h);
	}
	//오버라이딩
	public double getArea() { //리턴될 유형이 같아야 하므로 double로 맞춰줌.
		return w*h; 
		//부모 getArea()에서 0.0을 리턴하긴 했지만 오버라이딩을 통해 w*h값을 돌려줌.
	}
	
}
