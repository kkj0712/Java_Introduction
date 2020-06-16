package inheritance;

import java.util.ArrayList;

public class Buyer {
	private int money;
	private int point;
	//Product[] arr=new Product[10];
	ArrayList <Product>list=new ArrayList<Product>();
	//int cnt;
	
	public Buyer(int money) { //생성자는 클래스 이름과 똑같이 만듦.
		this.money=money;
	}
	//구매하기
	public void buy(Product p) {
		//arr[cnt++]=p;
		list.add(p);
		money-=p.price; //바이어가 가진 돈은 물건의 가격만큼 깎인다.
		point+=p.bonusPoint;
	}
	//구매내역
	public void showInfo() {
		for(int i=0;i<list.size();i++) {
			System.out.println("구매내역: "+list.get(i)); 
			System.out.println("가격: "+list.get(i).price);			
			//list.get(i)는 오브젝트.따라서 Product형이라고 캐스팅을 해줘야함.
			//((Product)list.get(i)).price
			//하지만 맨 위에 Arraylist를 적어줄때 Product형이라고 미리 선언하기.
		}
		System.out.println("잔액: "+money);
		System.out.println("포인트: "+point);
	}	
}