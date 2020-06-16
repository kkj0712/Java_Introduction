package day04;

public class Car {
	String carKind;
	String carColor;
	int speed;
	
	//생성자. 반드시 클래스 이름으로 만들어야함. void가 있으면 생성자가 아니라 메소드라 생각하기때문에 없애야함.
	//인자가 없는 생성자를 디폴트 생성자라고 함. 디폴트 생성자만 사용할때는 인자 생략가능. 하지만 다른 생성자가 있을 때는 생략 불가능.
	//그래서 아무런 하는 일이 없더라도 디폴트 생성자를 하나 만들어줌.
	//오버로딩. 생성자 오버로딩. 생성자들의 이름이 같은데 들어가는 인자의 개수나 유형이 다를때.
	
	public Car() {
		System.out.println("디폴트 생성자");
	}
	
	public Car(String carColor, String carKind) { //매개변수가 있는걸 썼을때 디폴트 생성자 생략 불가능.
		this.carColor=carColor; 
		this.carKind=carKind;
		System.out.println("인자있는 생성자");
	}
	
	public void speedUp(int s) {
		speed+=s;
	}
	
	public void speedDown(int speed) { //speed는 지역변수를 의미.
		this.speed-=speed; //this는 자기 자신의 객체를 가리킴. 6번의 speed. this.speed는 멤버변수를 의미
	}
	
	public void stop() {
		speed=0;
	}
	
	public static void main(String[]args) {
		Car mycar = new Car(); //참조변수. 레퍼런스 변수. 객체는 주소값을 가진다. 주소값을 찾아가면 객체가 가지는 변수들을 접근할 수 있다.
		mycar.carKind="소나타";
		mycar.carColor="흰색";
		mycar.speedUp(100); //괄호가 있으니까 메서드로 선언. 괄호 안에 값이 있으므로 speedUp의 함수안에는 정수형 인수가 들어가야함.
		System.out.println("속도: "+mycar.speed);
		System.out.println("color: "+mycar.carColor);
		mycar.stop();
		System.out.println("속도: "+mycar.speed);
		
		Car c1=new Car();
		c1.carKind="뉴카";
		c1.carColor="검은색";
		c1.speedUp(80);
		System.out.println(c1.carKind+" 속도: "+c1.speed);
		c1.speedDown(50);
		System.out.println(c1.carKind+" 속도: "+c1.speed);
		System.out.println(c1);
		System.out.println(mycar);
		
		Car c2=new Car("분홍색","내차"); //앞에 Car는 클래스. 뒤에 Car는 생성자. 초기값으로 분홍색, 내차라는 초기값을 가짐. 아예 차가 나올때부터 세팅.
		//생성자=멤버변수 초기화
		System.out.println(c2.carColor);
		
		
		
	}
}
