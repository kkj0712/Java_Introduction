package day02;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("입력할 개수>>");
		int cnt=sc.nextInt(); //개수를 입력할 변수 cnt 선언
		
		System.out.println("데이터입력>>");
		int sum=0;
		
		for(int i=0;i<cnt;i++) { 
			int inputData = sc.nextInt(); //반복문 안에 nextInt()쓰면 여러번 쓸 수 있음. 언제까지? cnt까지 
			sum+=inputData; //입력한 수들을 자동으로 더하도록  sum변수 선언
		}
		System.out.println("합계:"+sum); //더한 값들을 출력
		sc.close();
	}
}

