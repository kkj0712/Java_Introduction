package cooperation;

public class TakeTrans {
	
	public static void main(String[] args) {
		Student s1=new Student("ȫ�浿", 5000);
		Student s2=new Student("�̼���", 10000);
		Student s3=new Student("Edward", 20000);
		
		Bus bus=new Bus(100); //100�� ����
		//s1�л��� 100�� ������ ź��.
		s1.takeBus(bus); //�Ű������� ��ü�� ��.
		
		Subway subway=new Subway("2ȣ��");
		//s2�л��� 2ȣ�� ����ö�� ����.
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
