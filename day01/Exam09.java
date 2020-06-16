package day01;

import java.util.Scanner;

public class Exam09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.println("첫번째 수 입력>>");
		int num1 = sc.nextInt();
		System.out.println("두번째 수 입력>>");
		int num2 = sc.nextInt();
	
		if(num1>num2){
			System.out.println("큰 수: " +num1);
			System.out.println("작은 수: " +num2);
			System.out.println("두 수의 차: " +(num1-num2));
		}else if(num1<num2){
			System.out.println("큰 수: " +num2);
			System.out.println("작은 수: " +num1);
			System.out.println("두 수의 차: " +(num2-num1));
		}else {
			System.out.println("두 수는 같다");
		}
	*/
		
		System.out.println("첫번째 수 입력>>");
		int max = sc.nextInt();
		System.out.println("두번째 수 입력>>");
		int min = sc.nextInt();
		if(min>max) {
			int tmp = max; //임시로 max의 값을 저장할 정수형 변수 tmp 선언.
			max = min; //min의 값이 max에 들어감.
			min = tmp; //아까 max의 값을 임시로 저장했던 tmp의 값이 min에 들어감.
		}
		System.out.println("큰 수: " +max);
		System.out.println("작은 수: " +min);
		System.out.println("두 수 차: " +(max-min));
		sc.close();
	}
}

