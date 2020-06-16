package cooperation;

public class Taxi {
	private String taxiColor;
	private int money;
	private int passengerCount;
	
	public Taxi(String taxiColor) {
		this.taxiColor=taxiColor;
	}
	
	public void take(int money) {
		this.money+=money; //수입증가
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("택시 "+taxiColor);
		System.out.println("승객 "+passengerCount);
		System.out.println("수입 "+money);
	}
	
}
