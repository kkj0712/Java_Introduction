package day01;
import java.util.Scanner;

public class Exam08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸� �Է�>>");
		String name = sc.next(); //nextInt�� ������, next()�� ���ڸ� �Է¹޴´�.
		System.out.println("���� ������ �Է��ϼ���>>");
		int kor = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���>>");
		int eng = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���>>");
		int math = sc.nextInt();
		
		int total = kor+math+eng; //����
		int avg = total/3; //����� total ������ 3
		
		System.out.println("�̸�:" +name);
		System.out.println("����:" +total);
		System.out.println("���:" +avg);
		String grade =""; //���ڿ� ���� grade�� �����
		
		if(avg>=90) {
			grade="A����";  
		} else if(avg>=80) {
			grade="B����";
		} else if(avg>=70) {
			grade="C����";
		} else {
			grade="F����";
		}
		System.out.println(grade); //system.out.println("A����") �̷������� ��� ���� �� ���� grade �̿��ϰ� �� �ؿ� �ѹ��� ��¹� �����ָ� ��
		sc.close();
	
	}
}
