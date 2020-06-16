package cooperation;

public class TakeTrans {
	
	public static void main(String[] args) {
		Student s1=new Student("홍길동", 5000);
		Student s2=new Student("이순신", 10000);
		Student s3=new Student("Edward", 20000);
		
		Bus bus=new Bus(100); //100번 버스
		//s1학생이 100번 버스를 탄다.
		s1.takeBus(bus); //매개변수가 객체가 됨.
		
		Subway subway=new Subway("2호선");
		//s2학생이 2호선 지하철을 딴다.
		s2.takeSubway(subway);
		
		Taxi taxi=new Taxi("yellow");
		s3.takeTaxi(taxi);
		
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
		
		bus.showInfo();
		subway.showInfo();
		taxi.showInfo();
		
	}
}
