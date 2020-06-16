package day01;

public class Exam04 {
	public static void main(String[] args){
		double r = 5;
		final double PI = 3.14; //final은 수정 못하도록 고정하는 거. final값은 보통 대문자로 표기.
		System.out.println(r*r*PI);
		
		float f = 5.0f; //4바이트
		int num = 10; //4바이트
		f = num; 
		//a=b 일때 a와 b는 같은 유형이어야 함. f와 num은 다른 데이터타입. 
		//자바에선 정수형보다 부동소수점이 더 큰 형태
		//float = int 형변환 (캐스팅) <-자동형변환
		
		System.out.println("f:" +f);
		
		// num = f; float형을 작은 int형에 넣을 수는 없음.
		num = (int) f; //int <-float 형변환 (캐스팅) <-명시적형변환
		long num1 = 100L;
		
		f = num1; //float = long
		double area = r*r*PI;
		System.out.println("원넓이:" +area);
		
	}
	
}
