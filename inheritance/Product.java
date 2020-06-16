package inheritance;

public class Product {
	protected int price;
	protected int bonusPoint;
	
	/* 생성자를 만들면 항상 부모의 생성자로 먼저 간다. 
	 * 부모의 생성자 Product에 인자가 있음. 
	 * 자식 클래스에 인자가 없는 생성자들이 있었음.
	 * (Buyer클래스로 인해 하위 클래스가 인자가 있는 생성자로 바꾸면서 삭제)
	 * 그러면 똑같이 인자가 없는 Product를 만들어줘야함.
	public Product() {
		
	}
	*/
	public Product(int price) {
		this.price=price;
		bonusPoint=price/10;
	}	
}