package day02;

public class Exam072 {
	public static void main(String[] args) {
		
		for(int i=1;i<6;i++) {
			System.out.print(i+"\t");
		}
		System.out.println("\n-----");
		
		int n=1;
		while(n<6) { //조건에 안맞으면 실행 안함
			System.out.print(n+"\t");
			n++;
		}
		System.out.println("\n----");
		
		//1부터 5까지 출력 do~while
		int m=1;
		do { //최소한 한번은 실행
			System.out.print(m+"\t");
			m++;
		}while(m<6);
		
	}
}
