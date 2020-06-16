package day01;

import java.util.Scanner;

public class Exam13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수 입력>>");
		int a=sc.nextInt();
		System.out.println("두번째 수 입력>>");
		int b=sc.nextInt();
		System.out.println("연산자입력");
		String c=sc.next();
		
		/*
		switch(c) { //여기에는 쌍따옴표 안함. 변수 명만 적으면 됨.
			case "+" :
				System.out.println("덧셈결과: " +(a+b));break;
			case "-" :
				System.out.println("뺄셈결과: " +(a-b));break;
			case "*" :
				System.out.println("곱셈결과: " +(a*b));break;
			case "/" :
				System.out.println("나눗셈결과: " +(a/b));break;
			case "%" :
				System.out.println("나머지결과: " +(a%b));break;
			default : 
				System.out.println("연산자가 틀렸습니다.");
		}
		*/
		
		if (c.equals("+")) { //문자열 값을 비교할때는 equals() 사용. 숫자 int는 ==임.
			System.out.println("덧셈결과: " +(a+b));
		}else if (c.equals("-")) {
			System.out.println("뺄셈결과: " +(a-b));
		}else if (c.equals("*")) {
			System.out.println("곱셈결과: " +(a*b));
		}else if (c.equals("/")) {
			System.out.println("나눗셈결과: " +(a/b));
		}else if (c.equals("%")) {
			System.out.println("나머지결과: " +(a%b));
		}else {
			System.out.println("연산자가 틀렸습니다.");
		}
		sc.close();
		
	}
}
