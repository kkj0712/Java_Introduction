package day03;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("�Է� ����>>");
		int cnt=sc.nextInt();
		
		System.out.println("������ �Է�>>");
		int sum=0;
				
		int[]arr= new int[cnt];
		
		for(int i=0;i<cnt;i++) {
			arr[i]=sc.nextInt(); //�迭�� �ٷ� ���� �Է��ϵ���
			sum+=arr[i];		//�հ� sum�� �迭�� ���ʴ�� �Էµ� ���� ����
		}
		System.out.println("�հ�: "+sum);
		for(int i=0;i<cnt;i++) {
			System.out.println("�Է� ������: "+arr[i]); 
			//for�� �ȿ� �ȳ����� �����߻�. �迭 arr�� �ּ� 0���� �Է� ����cnt ������ ���ʴ�� �����.
		}
		
		sc.close();
	}
}
