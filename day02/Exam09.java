package day02;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		//���� �Է��ϴµ� -1�� �ԷµǸ� �Է� ��.
		//�Է��� ���� �հ�� ����� ���Ͻÿ�
		//��)10 5 6 9 -1
		Scanner sc=new Scanner(System.in);
		System.out.println("���� �Է��ϼ���. �������� -1");
		
		int sum=0;
		int cnt=0; //����� ���Ϸ��� �հ踦 '�Է��� ���� ����'��ŭ ��������. �� ���� �Է��ߴ��� �˷��� ������ ī��Ʈ �Ǿ����. 
		
		while(true) {
			int su=sc.nextInt();
			if(su==-1) break; //-1�� �Է��ϸ� �����.
			sum+=su; //�Է��� ��, su�� ���� �Է� �Ҷ����� ����. su�� -1�� �ƴ϶�� ��� ����.
			cnt++; //-1�� �Է��ϱ� ������ ������ ��. su�� ���� �Է� �Ҷ����� 1�� ����.
		}
		System.out.println("�հ�: "+sum);
		System.out.println("�Է°���: "+cnt);
		System.out.println("���: "+sum/cnt);
		sc.close();
	}

}
