package day01;
import java.util.Scanner;

public class Exam08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력>>");
		String name = sc.next(); //nextInt은 정수를, next()는 문자를 입력받는다.
		System.out.println("국어 점수를 입력하세요>>");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요>>");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요>>");
		int math = sc.nextInt();
		
		int total = kor+math+eng; //총점
		int avg = total/3; //평균은 total 나누기 3
		
		System.out.println("이름:" +name);
		System.out.println("총점:" +total);
		System.out.println("평균:" +avg);
		String grade =""; //문자열 변수 grade를 만들기
		
		if(avg>=90) {
			grade="A학점";  
		} else if(avg>=80) {
			grade="B학점";
		} else if(avg>=70) {
			grade="C학점";
		} else {
			grade="F학점";
		}
		System.out.println(grade); //system.out.println("A학점") 이런식으로 계속 쓰는 거 보단 grade 이용하고 맨 밑에 한번만 출력문 적어주면 됨
		sc.close();
	
	}
}
