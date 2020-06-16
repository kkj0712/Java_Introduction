package day01;

public class Exam03 {
	public static void main (String[] args) {
		int a = 135;
		int b = 20;
		System.out.println("덧셈: " +(a+b));
		System.out.println("뺄셈: " +(a-b));
		System.out.println("곱셈: " +(a*b));
		System.out.println("나눗셈: " +(a/b));
		System.out.println("나머지: " +(a%b));
		System.out.println(a+"+"+b+"=" +(a+b));
		System.out.println(a+"%"+b+"=" +(a%b)); //문자열일때 "" 사이에.
		//int는 4바이트 (32비트)
		//long은 8바이트 
		long c = 1000000000000L; //정수형은 int가 디폴트.
		
		float f = 3.25f; //4바이트
		double d = 3.25; //8바이트. 부동 소수점은 더블이 디폴트임.
		
		//char는 문자 하나
		char ch = 'A';
		//char ch1 = "B"; 오류발생. 따옴표는 문자열을 표현.
		
		System.out.println(c);
		System.out.println(f);
		System.out.println(d+" "+ch);
	
		
	}
	
	
}
