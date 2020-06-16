package day02;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("국어점수 입력>>");
		int kor=sc.nextInt();
		System.out.println("영어점수 입력>>");
		int eng=sc.nextInt();
		System.out.println("수학점수 입력>>");
		int math=sc.nextInt();
		int total=(kor+eng+math);
		int avg=(kor+eng+math)/3;
		
		String grade="";
		
		switch(avg/10) { //A학점, B학점, C학점의 공통점: 점수를 10으로 나눴을때 몫이 9, 8, 7...
		case 9 : 
			grade="A";break;
		case 8 : 
			grade="B";break;
		case 7 : 
			grade="C";break;
		default : 
			grade="F";break;
		}
		System.out.println("총점: " +total);
		System.out.println("평균: " +avg);
		System.out.println("학점: " +grade);
		sc.close();
	}
}
