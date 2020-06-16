package day07;

public class PointMain extends Point {
	private String color;

	public PointMain (int x, int y, String color) {
		super(x,y); //x,y가 있는 부모의 생성자를 불러준다.
		this.color=color;
	}
	//색깔도 출력시키고 싶다면 좌표만 출력시키는 부모의 disp()메소드를 오버라이딩 해주면 된다.
	//부모의 인자값 출력하려면 super를 붙이면 됨.
	@Override //어노테이션. 컴파일 할때 알려줌. 이름이 달라지면 오류발생. 오버라이드가 아니게 되므로.
	public void disp() {
		// TODO Auto-generated method stub
		super.disp();
		System.out.println("Color: "+color);
	}
	public static void main(String[] args) {
		PointMain pm=new PointMain(5,5,"Yellow");
		pm.disp();
		pm.move(10,20);
		pm.disp();	
		
		System.out.println(pm.str);
		
	}
}