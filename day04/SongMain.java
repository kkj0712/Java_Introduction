package day04;

public class SongMain {
	public static void main(String[] args) {
		
		Song s1=new Song(1978,"스웨덴","ABBA","Dancing Queen");
		s1.show();
		//1978년 스웨덴 국적의 ABBA가 부른 Dancing Queen
		
		Song s2=new Song(2001, "미국","Avril Lavigne","Sk8ter Boi");
		s2.show();
		
		Song s3=new Song(2011, "영국","Amy Winehouse","Back to Black");
		s3.show();
		
	}
}
