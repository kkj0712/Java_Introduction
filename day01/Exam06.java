package day01;
import java.util.Scanner; //java�ȿ� util�ȿ� Scanner�� import�Ѵ�.

public class Exam06 {
	public static void main(String[] args) {
		System.out.println("���� �Է��ϼ���>>"); //scanner �̿��ؼ� ���� �Է¹޾Ƽ� ����ϵ��� ���.
		Scanner sc = new Scanner(System.in); //new��� Ű���带 �̿��� ��ĳ�ʿ� �� �Է�. Ű����� �Է��ϵ���.
		int su = sc.nextInt(); //a��� "����"�� �ְԵǸ� ���� �߻�
		if(su%2==0) {
			System.out.println(su+ " ¦��");
		}else {
			System.out.println(su+ " Ȧ��");	
		}
		
		System.out.println("���̸� �Է��ϼ���>>");
		int age = sc.nextInt(); //���� �Է� ����.
		if(age>=20) {
			System.out.println("���尡��");
		}else if(age>=15) { //&&�� �� �ʿ� ����. �̹� 20���� �۱⶧���� ����� ������ �Ŷ�. else if �� �ƴ϶� if��� �����. 
			System.out.println("�θ�԰� ��������");
		}else {
			System.out.println("���� �Ұ���");
		}
		sc.close();
	}
}
