package day03;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		
		int[] data= {10,5,90,100,250,30,77};
		
		//�ִ밪�� ���ϱ�
		//�ִ밪�� ��ġ ���ϱ�
		
		int max=data[0]; //0��° �����Ͱ� ���� ũ�ٰ� max������ ����
		int maxPos=0;
		int sum=0;
		
		for(int i=0;i<data.length;i++) {		
			sum+=data[i];
			if(max<data[i]) {
				max=data[i];
				maxPos=i+1; //�迭�� �ּҴ� 0�������� �տ������� ������ ���ٰ� ���������� �ִ밪 250�� 5��°�� �ִ�.
			}
		}
		
		System.out.println("�ִ밪: " +max);
		System.out.println("�ִ밪�� ��ġ: "+maxPos);
		System.out.println("�迭�� �հ�: "+sum);
		System.out.println("�迭�� ���: "+(float)sum/data.length);
		
		
		Scanner sc=new Scanner(System.in);				
		System.out.println("ã�� ���� �Է��ϼ���>>");
		int search=sc.nextInt();
		boolean flag=false; //������ ����
		
		for(int i=0;i<data.length;i++) {
			if(search==data[i]) {
				System.out.println("ã�� �� "+search+" :"+(i+1));
				flag=true; //������ �� ���ο� ���� ������ ����->��¹� �ϳ��� ��������.
			}
		}
		if(flag==false) { //flag�� 0,1 ���� �ִ°� �ƴ϶� 0���� 1���� ���� �Ǻ��ϹǷ� == ��ȣ�� ����.
			System.out.println("ã�� ��"+search+"����");
		}
		sc.close();
		
		
	}
}
