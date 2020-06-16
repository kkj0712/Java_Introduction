package day07;

import java.util.ArrayList;

public class ShapeManager {
	//입력받은 좌표, 반지름, 너비, 높이 등을 저장하기 위해 배열 선언
	//부모형으로 선언을 해야 Circle, Square 모두 적용가능
	//Shape[]arr=new Shape[50]; 
	ArrayList <Shape> slist=new ArrayList <Shape>();
	//int cnt;
	
	public void inputData(int num) { //원->x,y,r 사각형->x,y,w,h
		System.out.println("도형입력....");
		System.out.print("x 좌표>>");
		int x=ShapeMain.sc.nextInt();
		System.out.print("y 좌표>>");
		int y=ShapeMain.sc.nextInt();
		
		if(num==1) { //원
			System.out.print("반지름>>");
			int r=ShapeMain.sc.nextInt();
			//arr[cnt++]=new Circle(x,y,r);
			slist.add(new Circle(x,y,r));
			//slist에 객체가 들어가야하므로.
		}
		else if(num==2) { //사각형
			System.out.print("너비>>");
			int w=ShapeMain.sc.nextInt();
			System.out.print("높이>>");
			int h=ShapeMain.sc.nextInt();
			//arr[cnt++]=new Square(x,y,w,h);
			slist.add(new Square(x,y,w,h));
		}
	}
	public void viewData() {
		//Shape sh=new Shape(); //shape은 추상클래스이기 때문에 형태로만 존재. 생성시킬 수 없다. 그걸 갖다쓴 자식 클래스를 생성시켜줌. 
		double sum=0;
		for(Shape s: slist) {
			//if(s==null) break; slist는 크기만큼 만들어지므로 필요없다.
			sum+=s.getArea();
			s.print();
		}
		//전체도형 넓이의 합
		System.out.println("전체 넓이: "+sum);
	}
}