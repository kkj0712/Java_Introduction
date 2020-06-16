package day05_object;

import java.util.Scanner;

public class Teacher {
	Scanner sc=new Scanner(System.in);
	StudentBean[] arr=new StudentBean[50];
	int cnt; //��������� int�� �ʱⰪ�� 0�̴�.
	
	public void showMenu() {
		System.out.println("�����ϼ���");
		System.out.println("1.�������Է�");
		System.out.println("2.��ü����");
		System.out.println("3.����");
		System.out.println("����>>");
	}
	
	public void inputData() {
		System.out.println("�����Է� ����>>");
		System.out.print("�̸�>>");
		String name=ScoreMain.sc.next();
		System.out.print("����>>");
		int kor=ScoreMain.sc.nextInt();
		System.out.print("����>>");
		int eng=ScoreMain.sc.nextInt();
		System.out.print("����>>");
		int math=ScoreMain.sc.nextInt();
		//�迭�� StudentBean ��ü �ֱ�
		arr[cnt] = new StudentBean(name, kor, eng, math);
		cnt++;
	}

	public void rankMethod() { //���� ���ϴ� �޼ҵ�
		for(int i=0;i<cnt-1;i++) {
			for(int j=i+1;j<cnt;j++) {
				if(arr[i].getTotal()>arr[j].getTotal()) {
					arr[j].setRank(1); //arr[j]�� rank�� 1�� ���Ѵ�. 
				}else if(arr[i].getTotal()<arr[j].getTotal()) {
					arr[i].setRank(1); //arr[i]�� rank�� 1�� ���Ѵ�.
				}
			}
		}
	}
	
	public void viewData() {
		int sum=0; //���������� �ݵ�� �ʱⰪ�� �����.
		rankMethod();
		System.out.println("-----�л� ���� ����------");
		System.out.println("�̸�\t����\t���\t����");
		for(int i=0;i<cnt;i++) {
			System.out.print(arr[i].getName()+"\t");
			System.out.print(arr[i].getTotal()+"\t");
			sum+=arr[i].getTotal();
			System.out.print(arr[i].getAvg()+"\t");
			System.out.print(arr[i].getRank()+"\n");
			}
		System.out.println("�б� ����: "+sum);
		System.out.println("�б� ���: "+sum/cnt);
	}	
}