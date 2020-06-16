package day02;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		int money = sc.nextInt();
		
		int result = money/10000;
		System.out.println("만원권: " +result +"장");
		
		money = money%10000;
		result = money/1000;
		
		System.out.println("천원권: " +result +"장");
		sc.close();
	}
}
