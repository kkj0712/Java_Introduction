package day04;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		//10���� ���� �Է¹޾� �迭�� �ְ�
		//�� �迭�� �հ�� ���� ���� �� ���ϱ�
		
		Scanner sc=new Scanner(System.in);
		System.out.println("10���� ��� �Է�>>");
		
		int []arr=new int[10];
		
		int sum=0;
		
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("�հ�: "+sum);
		
		int min=arr[0];
		for(int i=0;i<10;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("�ּҰ�: "+min);
		
		for(int a:arr) { //���� a�� �迭 arr�� ���� ���ʴ�� �Ҵ�ȴ�. 
			System.out.print(a+"\t");
		}
		System.out.println();
		
		
		sc.close();
		
	}
}
