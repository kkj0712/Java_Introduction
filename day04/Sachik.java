package day04;

public class Sachik {
	//����
	public void sum(int a, int b) {
		System.out.println("����: "+(a+b));
	}
	//����
	public void sub(int a, int b) {
		System.out.println("����: "+(a-b));
	}
	//����
	public void mul(int a, int b) {
		System.out.println("����: "+(a*b));
	}
	//������
	public int div(int a, int b) { //void�� ���ϰ��� ���ٴ� ��. ������ �����Ƿ� �� �ڷ����� void��ſ� �����ش�.
		//System.out.println("������: "+(a/b));
		return a/b; //return�� ���� �����شٴ� ��.
	}
	
	public static void main(String[] args) {
		Sachik s1=new Sachik();
		s1.sum(10,5); //�Լ��� �θ��� ���� ������ �Ű�����. 5������ ���� ���� ������� ������ ���� a,b�� ���޵�.
		s1.sub(20,10);
		s1.mul(3,5);
		//s1.div(9,3);
		System.out.println(s1.div(20,5));
		
	}
}
