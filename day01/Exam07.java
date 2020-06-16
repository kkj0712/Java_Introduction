package day01;
import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Scanner를 써서 키보드로 수를 입력받도록
		System.out.println("점수를 입력하세요>>"); //점수를 입력하라는 문장을 먼저 출력하도록
		int score = sc.nextInt(); //점수 값을 변수 point에 받도록. 스캐너 이름을 동일하게.
		System.out.println("커트라인을 입력하세요>>"); //커트라인을 입력하라는 문장을 먼저 출력하도록
		int cutline = sc.nextInt(); //커트라인 값을 변수 cutline에 받도록. 스캐너 이름 동일하게.
		
		if(score>=cutline) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	
		if(score%3==0) {
			System.out.println(score+ " : 3의 배수");
		}else {
			System.out.println(score+ " : 3의 배수가 아니다");
		}
		sc.close();
	}
}
