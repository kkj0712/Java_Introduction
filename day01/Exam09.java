package day01;

import java.util.Scanner;

public class Exam09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.println("ù��° �� �Է�>>");
		int num1 = sc.nextInt();
		System.out.println("�ι�° �� �Է�>>");
		int num2 = sc.nextInt();
	
		if(num1>num2){
			System.out.println("ū ��: " +num1);
			System.out.println("���� ��: " +num2);
			System.out.println("�� ���� ��: " +(num1-num2));
		}else if(num1<num2){
			System.out.println("ū ��: " +num2);
			System.out.println("���� ��: " +num1);
			System.out.println("�� ���� ��: " +(num2-num1));
		}else {
			System.out.println("�� ���� ����");
		}
	*/
		
		System.out.println("ù��° �� �Է�>>");
		int max = sc.nextInt();
		System.out.println("�ι�° �� �Է�>>");
		int min = sc.nextInt();
		if(min>max) {
			int tmp = max; //�ӽ÷� max�� ���� ������ ������ ���� tmp ����.
			max = min; //min�� ���� max�� ��.
			min = tmp; //�Ʊ� max�� ���� �ӽ÷� �����ߴ� tmp�� ���� min�� ��.
		}
		System.out.println("ū ��: " +max);
		System.out.println("���� ��: " +min);
		System.out.println("�� �� ��: " +(max-min));
		sc.close();
	}
}

