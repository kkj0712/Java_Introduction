package day02;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�Է��� ����>>");
		int cnt=sc.nextInt(); //������ �Է��� ���� cnt ����
		
		System.out.println("�������Է�>>");
		int sum=0;
		
		for(int i=0;i<cnt;i++) { 
			int inputData = sc.nextInt(); //�ݺ��� �ȿ� nextInt()���� ������ �� �� ����. ��������? cnt���� 
			sum+=inputData; //�Է��� ������ �ڵ����� ���ϵ���  sum���� ����
		}
		System.out.println("�հ�:"+sum); //���� ������ ���
		sc.close();
	}
}

