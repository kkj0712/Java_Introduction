package day01;

public class Exam04 {
	public static void main(String[] args){
		double r = 5;
		final double PI = 3.14; //final�� ���� ���ϵ��� �����ϴ� ��. final���� ���� �빮�ڷ� ǥ��.
		System.out.println(r*r*PI);
		
		float f = 5.0f; //4����Ʈ
		int num = 10; //4����Ʈ
		f = num; 
		//a=b �϶� a�� b�� ���� �����̾�� ��. f�� num�� �ٸ� ������Ÿ��. 
		//�ڹٿ��� ���������� �ε��Ҽ����� �� ū ����
		//float = int ����ȯ (ĳ����) <-�ڵ�����ȯ
		
		System.out.println("f:" +f);
		
		// num = f; float���� ���� int���� ���� ���� ����.
		num = (int) f; //int <-float ����ȯ (ĳ����) <-���������ȯ
		long num1 = 100L;
		
		f = num1; //float = long
		double area = r*r*PI;
		System.out.println("������:" +area);
		
	}
	
}
