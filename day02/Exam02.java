package day02;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ���");
		int money = sc.nextInt();
		
		int result = money/10000;
		System.out.println("������: " +result +"��");
		
		money = money%10000;
		result = money/1000;
		
		System.out.println("õ����: " +result +"��");
		sc.close();
	}
}
