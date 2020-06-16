package inheritance;

public class ProductMain {
	
	public static void main(String[] args) {
		Buyer b=new Buyer(1000); //바이어가 가진 돈
		TV tv=new TV(50); //tv의 가격
		Computer com=new Computer(100); //computer의 가격
		Audio audio=new Audio(70); //audio의 가격
		
		b.buy(tv); //tv와 com을 아우를 수 있는 자료형은 Product
		b.buy(com);
		b.buy(audio);
		b.showInfo();
	}
}