package day07;

import java.util.ArrayList;

public class ShapeManager {
	//�Է¹��� ��ǥ, ������, �ʺ�, ���� ���� �����ϱ� ���� �迭 ����
	//�θ������� ������ �ؾ� Circle, Square ��� ���밡��
	//Shape[]arr=new Shape[50]; 
	ArrayList <Shape> slist=new ArrayList <Shape>();
	//int cnt;
	
	public void inputData(int num) { //��->x,y,r �簢��->x,y,w,h
		System.out.println("�����Է�....");
		System.out.print("x ��ǥ>>");
		int x=ShapeMain.sc.nextInt();
		System.out.print("y ��ǥ>>");
		int y=ShapeMain.sc.nextInt();
		
		if(num==1) { //��
			System.out.print("������>>");
			int r=ShapeMain.sc.nextInt();
			//arr[cnt++]=new Circle(x,y,r);
			slist.add(new Circle(x,y,r));
			//slist�� ��ü�� �����ϹǷ�.
		}
		else if(num==2) { //�簢��
			System.out.print("�ʺ�>>");
			int w=ShapeMain.sc.nextInt();
			System.out.print("����>>");
			int h=ShapeMain.sc.nextInt();
			//arr[cnt++]=new Square(x,y,w,h);
			slist.add(new Square(x,y,w,h));
		}
	}
	public void viewData() {
		//Shape sh=new Shape(); //shape�� �߻�Ŭ�����̱� ������ ���·θ� ����. ������ų �� ����. �װ� ���پ� �ڽ� Ŭ������ ����������. 
		double sum=0;
		for(Shape s: slist) {
			//if(s==null) break; slist�� ũ�⸸ŭ ��������Ƿ� �ʿ����.
			sum+=s.getArea();
			s.print();
		}
		//��ü���� ������ ��
		System.out.println("��ü ����: "+sum);
	}
}