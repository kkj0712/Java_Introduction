package day02;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		/*
		for(int i=1;i<6;i++) { //i=1초기값,2,3,4,5 6은 i<6조건을 만족하지 않기 때문에 for문 빠져나옴.
			System.out.println(i+ ":안녕하세요");
		}
		System.out.println("========");
		
		for(int i=5;i>0;i--) {
			System.out.println(i+ ":안녕하세요");
		}
		System.out.println("========");
		
		for(int j=1;j<10;j++) {
			System.out.println("2*"+ j+ "=" +2*j);
		}	
		System.out.println("========");
	
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println("=======");
		
		for(int i=2;i<=10;i+=2) {
			System.out.println(i);
		}
		*/
		//단을 입력받아 해당되는 단의 구구단 출력
		
		Scanner sc=new Scanner(System.in);
		System.out.println("단을 입력>>");
		int d=sc.nextInt();
		
		for(int j=1;j<10;j++) {
			System.out.println(d+"단 "+d+"*"+j+"="+(d*j));
		}
		sc.close();
	}
}
