package inheritance;

public class ProductMain {
	
	public static void main(String[] args) {
		Buyer b=new Buyer(1000); //���̾ ���� ��
		TV tv=new TV(50); //tv�� ����
		Computer com=new Computer(100); //computer�� ����
		Audio audio=new Audio(70); //audio�� ����
		
		b.buy(tv); //tv�� com�� �ƿ츦 �� �ִ� �ڷ����� Product
		b.buy(com);
		b.buy(audio);
		b.showInfo();
	}
}