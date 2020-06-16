package abstractTest;

public class AbsShapeMain {
	public static void main(String[] args) {
		AbsCircle ac=new AbsCircle();
		ac.draw();
		ac.move();
		
		AbsSquare as=new AbsSquare();
		as.draw();
		as.move();
		as.print();
		
		//AbsShape ah=new AbsShape(); //추상이라서 안된다. 추상클래스엔 객체를 생성할 수 없다. 하위클래스에서 반드시 추상클래스의 추상 메소드 구현.
		AbsShape ah=new AbsCircle(); //이런식으로 접근한다. 
	}
}
