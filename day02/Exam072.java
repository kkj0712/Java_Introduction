package day02;

public class Exam072 {
	public static void main(String[] args) {
		
		for(int i=1;i<6;i++) {
			System.out.print(i+"\t");
		}
		System.out.println("\n-----");
		
		int n=1;
		while(n<6) { //���ǿ� �ȸ����� ���� ����
			System.out.print(n+"\t");
			n++;
		}
		System.out.println("\n----");
		
		//1���� 5���� ��� do~while
		int m=1;
		do { //�ּ��� �ѹ��� ����
			System.out.print(m+"\t");
			m++;
		}while(m<6);
		
	}
}
