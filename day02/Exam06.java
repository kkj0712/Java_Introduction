package day02;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		
		/*
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
			if(i%10==0) {
				System.out.println((i-9)+"����"+i+"������ �� "+sum);
				sum=0;  //if�� �ѹ� ���� �� ������ sum�� 0���� �����ϵ���. ���� ������Ű�°� �ƴ϶� �ܰ躰�� ���ϱ� ���ؼ�.
			}
		}
		/*�л����� ���ٿ� ���� �л� ���� �Է¹޾� ����Ͻÿ�
		 * 
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("�л� ���� �Է�>>");
		int stuCnt=sc.nextInt();
		System.out.println("���� �ο� �� �Է�>>");
		int lineCnt=sc.nextInt();
		
		for(int i=1;i<=stuCnt;i++) {
			System.out.print(i+"\t"); //\t�� �Ǹ�ŭ ���ٴ� ��
			if(i%lineCnt==0) { //i�� lineCnt �� ���� �ο����� �Ȱ�����. ���ٿ� �� á����
				System.out.println(); //���� �ٷ� ����.
			}
		}
		
		/*
		int row=stuCnt%lineCnt;
		if(row==0) {
			System.out.println((stuCnt/lineCnt)+"�� �ʿ�");
		}else {
			System.out.println(((stuCnt/lineCnt)+1+"�� �ʿ�"));
		}
		
		*/
		//���� ������(���ǿ�����)
		
		int r=(stuCnt%lineCnt==0)? stuCnt/lineCnt:(stuCnt/lineCnt)+1;	
		System.out.println();
		System.out.println("�Ѷ��� ��: "+r);
		sc.close();
	}
}
