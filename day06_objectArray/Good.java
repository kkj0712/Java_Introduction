package day06_objectArray;

public class Good {
	String num;
	String name;
	String company;
	int price;
	double discountRate;
	
	public Good(String num, String name, String company, int price) {
		this.num=num;
		this.name=name;
		this.company=company;
		this.price=price;
	}
	
	public int getSellingPrice() {
		return price-(int)(price*discountRate);
	}
	
	public void updateDiscountRate(double rate) {
		discountRate=rate;
	}
	 
	public double discountRate() {
		return discountRate;
	}
}