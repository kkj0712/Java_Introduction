package day05_object;

public class Drink {
	String menu;
	int price;
	int quantity;
	
	public Drink(String menu, int price, int quantity) {
		this.menu=menu;
		this.price=price;
		this.quantity=quantity;
	}
	
	public int getTotal() {
		return (price*quantity);
	}
	
	public void getData() {
		System.out.print(menu+"\t");
		System.out.print(price+"\t");
		System.out.print(quantity+"\t");
		//System.out.print(price*quantity+"\n");
		System.out.println(getTotal()+"\n"); 
	}
}