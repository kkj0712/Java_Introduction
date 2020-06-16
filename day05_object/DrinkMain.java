package day05_object;

public class DrinkMain {
	
	public static void main(String[] args) {
		Drink coffee=new Drink("커피", 500, 3);
		coffee.getData(); //커피 500 3 1500
		
		Drink tea=new Drink("녹차", 800, 5);
		tea.getData(); //녹차 800 5 4000
		//판매금액
		System.out.println("판매금액: "+(coffee.getTotal()+tea.getTotal()));
	
		//판매되는 음료가 50개라면? 배열을 이용해서 판매금액을 구할 수 있다.
		//배열에는 Drink를 담으면 된다.
	
	}
}