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
		System.out.println("�̸�: " +name);
		System.out.println("�ּ�: " +address);
		System.out.println("����: " +age);
		System.out.println("Ű: " +height);
		System.out.println("������: " +weight);
	}

}
