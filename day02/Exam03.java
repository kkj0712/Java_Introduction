package day02;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		/*
		for(int i=1;i<6;i++) { //i=1�ʱⰪ,2,3,4,5 6�� i<6������ �������� �ʱ� ������ for�� ��������.
			System.out.println(i+ ":�ȳ��ϼ���");
		}
		System.out.println("========");
		
		for(int i=5;i>0;i--) {
			System.out.println(i+ ":�ȳ��ϼ���");
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
		//���� �Է¹޾� �ش�Ǵ� ���� ������ ���
		
		Scanner sc=new Scanner(System.in);
		System.out.println("���� �Է�>>");
		int d=sc.nextInt();
		
		for(int j=1;j<10;j++) {
			System.out.println(d+"�� "+d+"*"+j+"="+(d*j));
		}
		sc.close();
	}
}
