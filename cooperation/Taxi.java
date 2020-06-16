package cooperation;

public class Taxi {
	private String taxiColor;
	private int money;
	private int passengerCount;
	
	public Taxi(String taxiColor) {
		this.taxiColor=taxiColor;
	}
	
	public void take(int money) {
		this.money+=money; //��������
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("�ý� "+taxiColor);
		System.out.println("�°� "+passengerCount);
		System.out.println("���� "+money);
	}
	
}
