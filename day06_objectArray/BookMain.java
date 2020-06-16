package day06_objectArray;

import java.util.Scanner;

public class BookMain {
	static Scanner sc =new Scanner(System.in);
	BookBean[]arr=new BookBean[50];
	int cnt; //��������� �ʱⰪ�� 0�̶� ���� 0 ���൵ ��.
	
	public void showMenu() {
		System.out.println("�����ϼ���");
		System.out.println("1.�������Է�");
		System.out.println("2.��ü����");
		System.out.println("3.����");
		System.out.println("����>>");
	}
	//������ �Է�
	public void bookInsert() {
		System.out.println("������ �Է��ϼ���...");
		System.out.print("å����: ");
		String title=sc.nextLine(); //���� �Է¹޴� ��. ������ ���� �Է� ������ �ν�.
		System.out.print("å����: ");
		String writer=sc.nextLine();
		arr[cnt++] = new BookBean(title, writer); //�Է¹����� �迭�� �����ϱ�.
	}
	
	public void bookList() {
		System.out.println("����\t�۰�");
		/*
		for(int i=0;i<cnt;i++) {
			System.out.print(arr[i].title+"\t");
			System.out.print(arr[i].writer+"\n");
		}
		*/
		
		for(BookBean book : arr) { //���� for��. for-each
			if(book==null) break;
			System.out.print(book.getTitle()+"\t");
			System.out.print(book.getWriter()+"\n");
		}
		
	}
	
	public static void main(String[] args) {
		BookMain bm=new BookMain();
		while(true) {
			bm.showMenu(); //�޴�
			int choice=sc.nextInt();
			BookMain.sc.nextLine(); //�� ���� ���͸� ����
			switch(choice) {
			case 1 : bm.bookInsert(); break;
			case 2 : bm.bookList(); break;
			case 3 : System.out.println("����");
					 System.exit(0);
			default : System.out.println("�Է¿���");
			}
		}
	}
}