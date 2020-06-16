package day07;

public class Main {
	public static void main(String[] args) {
		Father f1=new Father();
		Child c1=new Child();
		GrandFather g1=new GrandFather(); //선언&생성
		c1.grandPrint();
		f1.grandPrint();
		
		GrandFather g2; //선언. 
		Father f2=new Father();
		g2=f2; //GrandFather형=Father형. 서로 다른 형을 잡음.
		//상위의 개념은 하위의 개념을 포함시킨다.
		f2=(Father)g2; //강제로 하면 된다. 명시적으로는 되지만 묵시적으로는 안된다.
		//f2=g2; 컴파일 오류 발생
		//g2.fatherPrint(); //fatherPrint()는 Father메소드.
		//GrandFather 메소드가 출력. 단, 오버라이드 된 메소드는
		//오버라이딩 된게 있으면 자식 메소드가 실행된다.
		g2.grandPrint(); 
		
		GrandFather g3=new Father();
		//앞에는 클래스형. 뒤에는 생성자. 두개가 다르다.
		//g3는 GrandFather형. 오버라이딩 된것만 Father것을 쓸 수 있다.
		//GrandFather g3
		//Father f3=new Father();
		//g3=f3;
	}	
}