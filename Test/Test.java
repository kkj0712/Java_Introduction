package Test;
class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void show() {
		System.out.print(name+" "+age+" ");
	}
}

class Student extends Person{
	String major;
	public Student(String name, int age, String major) {
		super(name, age);
		this.major=major;
	}
	@Override
	public void show() {
		super.show();
		System.out.print(major);
	}
}

public class Test {
	int y; //�������. y=0
	public static void main(String[] args) {
		Student s=new Student("���ڹ�", 25, "ȸ���");
		s.show(); //���ڹ� 25 ȸ��� ��µǵ��� �ٲٱ�
//		int x=0; //���������� �ݵ�� �ʱⰪ ���� 
//		System.out.println(x);
		Test t=new Test();
		System.out.println(t.y); //��������� int���̸� 0���� �����ȴ�.
	}
}