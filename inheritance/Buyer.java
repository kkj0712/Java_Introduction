package inheritance;

import java.util.ArrayList;

public class Buyer {
	private int money;
	private int point;
	//Product[] arr=new Product[10];
	ArrayList <Product>list=new ArrayList<Product>();
	//int cnt;
	
	public Buyer(int money) { //�����ڴ� Ŭ���� �̸��� �Ȱ��� ����.
		this.money=money;
	}
	//�����ϱ�
	public void buy(Product p) {
		//arr[cnt++]=p;
		list.add(p);
		money-=p.price; //���̾ ���� ���� ������ ���ݸ�ŭ ���δ�.
		point+=p.bonusPoint;
	}
	//���ų���
	public void showInfo() {
		for(int i=0;i<list.size();i++) {
			System.out.println("���ų���: "+list.get(i)); 
			System.out.println("����: "+list.get(i).price);			
			//list.get(i)�� ������Ʈ.���� Product���̶�� ĳ������ �������.
			//((Product)list.get(i)).price
			//������ �� ���� Arraylist�� �����ٶ� Product���̶�� �̸� �����ϱ�.
		}
		System.out.println("�ܾ�: "+money);
		System.out.println("����Ʈ: "+point);
	}	
}