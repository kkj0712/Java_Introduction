package inheritance;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
}

public class AnimalTest1 {
	public static void main(String[] args) {
		AnimalTest1 aTest=new AnimalTest1();
		aTest.moveAnimal(new Human()); 
		aTest.moveAnimal(new Tiger()); //�ѹ��� ���� ���̻� �ȸ��� ���� ��ü�� ���� �������� �ʰ� new Tiger()�̷� ������ �Ű������� ������
		aTest.moveAnimal(new Eagle());
		
		Human h=new Human();
		if(h instanceof Animal) { //instanceof�� �� ��ü�� ��� �Ҽ����� ����� Ű����. Human���� Animal�� ���� �����̹Ƿ� �´ٶ�� ���. 
			System.out.println("�´�");
		}else {
			System.out.println("Ʋ����");
		}
		
		Animal a=new Animal();
		if(a instanceof Human) { //a�� Animal. Human���� ū �����̹Ƿ� Ʋ����11�� ���.
			System.out.println("�´�11");
		}else {
			System.out.println("Ʋ����11");
		}
		
	}
	
	public void moveAnimal(Animal animal) { //Animal���� ��ӹ��� Ŭ������ �Ű������� �Ѿ���� ��� Animal������ ��ȯ��. animal�� �޸�, Ÿ�̰�, �̱� ��..�ü� ����.
		animal.move();
	}
}
