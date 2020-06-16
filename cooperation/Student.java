package cooperation;

public class Student { 
	private String studentName; //학생이름
	private int grade; //학년
	private int money; //학생이 가지고 있는 돈
	
	public Student(String studentName, int money) {
		this.studentName=studentName;
		this.money=money;
	}
	
	//버스타다
	public void takeBus(Bus bus) { //Bus형에 bus가 들어감. 매개변수에 객체가 들어감.
		bus.take(1000);
		this.money-=1000;
	}
	
	//지하철타다
	public void takeSubway(Subway subway) { //Subway형에 subway가 들어감.
		subway.take(1500);
		this.money-=1500;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money-=10000;
	}
	
	public void showInfo() {
		System.out.println("학생 이름: "+studentName);
		System.out.println("학생 잔액: "+money);
	}
	
}
