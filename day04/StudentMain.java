package day04;

public class StudentMain {

	public static void main(String[] args) {
		StudentSunjuk s1=new StudentSunjuk("홍길동",100,80,70);
		s1.getTotal(); //홍길동님의 총점??
		System.out.println(s1.getAvg()); //홍길동님의 평균?? s1.getAvg()을 수행한 결과값이 나오길 원함. return을 통해 돌려받은 값을 출력.
		
	}
}
