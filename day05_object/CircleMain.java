package day05_object;

class Circle {
	String name;
	int r;
	
	public Circle() { //디폴트 생성자
	}
	
	public Circle(int r) { //오버로딩
		this.r=r; 
	}
	
	public void getArea() {
		System.out.println(name+"의 반지름이 "+r+"일 때 면적: "+(r*r*3.14));
	}
	
	public void setR(int r) {
		this.r=r; //초기값을 변경시켜준다.
	}
	
	public Circle(int r, String name) { //오버로딩
		this.name=name;
		this.r=r; 
	}
	
}
	
public class CircleMain {
	public static void main(String[] args) {
		Circle c1=new Circle();
		c1.name="피자";
		c1.r=10;
		//피자의 넓이를 구하시오
		c1.getArea(); //피자의 면적은?
		c1.setR(8); //피자의 반지름을 8로 만들기
		c1.getArea();
		
		Circle c2=new Circle();
		c2.name="도너츠";
		c2.r=2;
		c2.getArea();
		
		//반지름이 5인 생성자를 이용해서 김치전 면적을 구하시오
		Circle c3=new Circle(5);
		c3.name="김치전";
		c3.getArea();
		
		//초기값으로 반지름이 4, 파전이란 이름을 가진 생성자를 이용한 파전 면적
		Circle c4=new Circle(4, "파전");
		c4.getArea();
		
		//생성된 Circle 객체의 총 면적을 구하시오
		
		
	}
	
}