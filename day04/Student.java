package day04;

public class Student { //Ŭ������ ����. �Ӽ��� ������ ǥ���� �� �ְ�, �Ӽ��� �������, ������ �޼ҵ�.
	int StudentID; //�й�
	String name; //�̸�
	int grade; //�г�
	String address; //�ּ�
	
	//�����ϴ� ��� ������ ǥ���ϰ� �ʹ�. �� ������ ���α׷������� �Լ���� ��. ��ü������ �Լ��� �޼ҵ�.
	public void study() { //�Լ��� �ݵ�� ��ȣ�� ����
		System.out.println(name+"�����ϴ�");
	}
	
	public void play() {
		System.out.println(name+"��ϴ�");
	}
	
	
	public static void main(String[] args) { //������ �׻� main�Լ� ����
		Student s1=new Student(); //Student Ŭ���� �ȿ� s1�̶�� ��ü ����
		s1.StudentID=100; //������ �й����� ǥ���ؾ��ϹǷ� ��(.)�� ��°� �߿�.
		s1.name="ȫ�浿";
		s1.grade=1;
		s1.address="�λ�";
		System.out.println("s1�� �̸�: "+s1.name);
		
		Student s2=new Student();
		s2.StudentID=200;
		s2.name="�̼���";
		s2.grade=4;
		s2.address="����";
		System.out.println("s2�� �̸�: "+s2.name);
		
		System.out.println(s1.name+"�� �ּ�: "+s1.address);
		
		//�̸��� �������̰� 3�г�, ��õ�� ��� �л� s3��
		//�����ϰ� s3�� �̸��� �ּҸ� ����Ͻÿ�.
		
		Student s3=new Student();
		s3.name="������";
		s3.grade=3;
		s3.address="��õ";
		System.out.println("s3 �̸�: "+s3.name);
		System.out.println("s3 �ּ�: "+s3.address);
		
		//ȫ�浿�� �����ϴ�
		s1.study();
		//�������� �����ϴ�
		s3.study();
		
		//�л��̶�� Ŭ������ ���鶧 �й�, �̸�, �г�, �ּҸ� �������
		//�����ϴٶ�� �������� ǥ��.
		
		//�л��̶�� Ŭ������ �����ϴµ� play()�Լ��� ������ �ְ�..
		//���⿡�� �̸� ��Ѵٶ�� ���� ����Ͻÿ�
		s1.play();
		
		
		 
	}

}
