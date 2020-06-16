package day06_objectArray;

public class Player {
	private String name, address;
	private int age;
	private double height, weight;

	public Player(String name, String address, int age, double height, double weight) {
		this.name=name;
		this.address=address;
		this.age=age;
		this.height=height;
		this.weight=weight;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void getInfo() {
		System.out.println("이름: " +name);
		System.out.println("주소: " +address);
		System.out.println("나이: " +age);
		System.out.println("키: " +height);
		System.out.println("몸무게: " +weight);
	}

}
