package day04;

import java.util.Scanner;

public class Gugudan {
	int dan; //�������
	
	public Gugudan(int dan) { //���� �����ڴ� �ʱ�ȭ�� ��Ų��. ����Ʈ �����ڴ� ���� �ʿ������ �ȸ��� ��.
		this.dan=dan;
	}
	
	public void viewData() { //������ ���
		System.out.println(dan+"��"); 
		for(int i=1;i<10;i++) {  
			System.out.println(dan+"*"+i+"="+(dan*i)); 
		}
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("�� �Է�");
	int dan2=sc.nextInt();
	
	Gugudan gn=new Gugudan(dan2);
	gn.viewData();
		
	Gugudan g1=new Gugudan(5);
	g1.viewData();
	/*
	 * 5*1=5
	 * 5*2=10
	 * 
	 * 5*9=45
	 */
	Gugudan g2=new Gugudan(7);
	g2.viewData();
	
	Gugudan g3=new Gugudan(9);
	g3.viewData();
	
	
		
	}
}
