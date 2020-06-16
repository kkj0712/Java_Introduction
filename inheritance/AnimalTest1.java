package inheritance;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}

public class AnimalTest1 {
	public static void main(String[] args) {
		AnimalTest1 aTest=new AnimalTest1();
		aTest.moveAnimal(new Human()); 
		aTest.moveAnimal(new Tiger()); //한번만 쓰고 더이상 안만들 것은 객체를 따로 선언하지 않고 new Tiger()이런 식으로 매개변수로 적어줌
		aTest.moveAnimal(new Eagle());
		
		Human h=new Human();
		if(h instanceof Animal) { //instanceof는 이 객체가 어느 소속인지 물어보는 키워드. Human보다 Animal이 상위 개념이므로 맞다라고 출력. 
			System.out.println("맞다");
		}else {
			System.out.println("틀리다");
		}
		
		Animal a=new Animal();
		if(a instanceof Human) { //a는 Animal. Human보다 큰 개념이므로 틀리다11가 출력.
			System.out.println("맞다11");
		}else {
			System.out.println("틀리다11");
		}
		
	}
	
	public void moveAnimal(Animal animal) { //Animal에서 상속받은 클래스가 매개변수로 넘어오면 모두 Animal형으로 변환됨. animal에 휴먼, 타이거, 이글 등..올수 있음.
		animal.move();
	}
}
