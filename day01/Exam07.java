package day01;
import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Scanner�� �Ἥ Ű����� ���� �Է¹޵���
		System.out.println("������ �Է��ϼ���>>"); //������ �Է��϶�� ������ ���� ����ϵ���
		int score = sc.nextInt(); //���� ���� ���� point�� �޵���. ��ĳ�� �̸��� �����ϰ�.
		System.out.println("ĿƮ������ �Է��ϼ���>>"); //ĿƮ������ �Է��϶�� ������ ���� ����ϵ���
		int cutline = sc.nextInt(); //ĿƮ���� ���� ���� cutline�� �޵���. ��ĳ�� �̸� �����ϰ�.
		
		if(score>=cutline) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}
	
		if(score%3==0) {
			System.out.println(score+ " : 3�� ���");
		}else {
			System.out.println(score+ " : 3�� ����� �ƴϴ�");
		}
		sc.close();
	}
}
