package day01;

public class Exam03 {
	public static void main (String[] args) {
		int a = 135;
		int b = 20;
		System.out.println("����: " +(a+b));
		System.out.println("����: " +(a-b));
		System.out.println("����: " +(a*b));
		System.out.println("������: " +(a/b));
		System.out.println("������: " +(a%b));
		System.out.println(a+"+"+b+"=" +(a+b));
		System.out.println(a+"%"+b+"=" +(a%b)); //���ڿ��϶� "" ���̿�.
		//int�� 4����Ʈ (32��Ʈ)
		//long�� 8����Ʈ 
		long c = 1000000000000L; //�������� int�� ����Ʈ.
		
		float f = 3.25f; //4����Ʈ
		double d = 3.25; //8����Ʈ. �ε� �Ҽ����� ������ ����Ʈ��.
		
		//char�� ���� �ϳ�
		char ch = 'A';
		//char ch1 = "B"; �����߻�. ����ǥ�� ���ڿ��� ǥ��.
		
		System.out.println(c);
		System.out.println(f);
		System.out.println(d+" "+ch);
	
		
	}
	
	
}
