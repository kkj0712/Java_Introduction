package day04;

public class Sachik {
	//덧셈
	public void sum(int a, int b) {
		System.out.println("덧셈: "+(a+b));
	}
	//뺄셈
	public void sub(int a, int b) {
		System.out.println("뺄셈: "+(a-b));
	}
	//곱셈
	public void mul(int a, int b) {
		System.out.println("곱셈: "+(a*b));
	}
	//나눗셈
	public int div(int a, int b) { //void는 리턴값이 없다는 뜻. 리턴이 있으므로 그 자료형을 void대신에 적어준다.
		//System.out.println("나눗셈: "+(a/b));
		return a/b; //return은 값을 돌려준다는 것.
	}
	
	public static void main(String[] args) {
		Sachik s1=new Sachik();
		s1.sum(10,5); //함수를 부를때 값을 전달할 매개변수. 5번으로 가서 각각 순서대로 정수형 변수 a,b에 전달됨.
		s1.sub(20,10);
		s1.mul(3,5);
		//s1.div(9,3);
		System.out.println(s1.div(20,5));
		
	}
}
