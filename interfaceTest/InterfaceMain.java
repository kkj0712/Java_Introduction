package interfaceTest;

public class InterfaceMain {
	
	public static void main(String[] args) {
		//앞에가 Rectangle, Circle형이 아니다. 부모클래스란 소리.
		Shape rec=new Rectangle(5,7);
		Shape circle=new Circle(5);
		//rec.a=5; //interface에 들어있기 때문에 수정될 수 없다.
		System.out.println(rec.a);
		
		System.out.println("원 넓이: "+circle.area());
		System.out.println("원 둘레: "+circle.circum());
		System.out.println("사각형 넓이: "+rec.area());
		System.out.println("사각형 둘레: "+rec.circum());
	}
}