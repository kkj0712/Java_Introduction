package day01;

import java.util.Scanner;

public class Exam13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° �� �Է�>>");
		int a=sc.nextInt();
		System.out.println("�ι�° �� �Է�>>");
		int b=sc.nextInt();
		System.out.println("�������Է�");
		String c=sc.next();
		
		/*
		switch(c) { //���⿡�� �ֵ���ǥ ����. ���� �� ������ ��.
			case "+" :
				System.out.println("�������: " +(a+b));break;
			case "-" :
				System.out.println("�������: " +(a-b));break;
			case "*" :
				System.out.println("�������: " +(a*b));break;
			case "/" :
				System.out.println("���������: " +(a/b));break;
			case "%" :
				System.out.println("���������: " +(a%b));break;
			default : 
				System.out.println("�����ڰ� Ʋ�Ƚ��ϴ�.");
		}
		*/
		
		if (c.equals("+")) { //���ڿ� ���� ���Ҷ��� equals() ���. ���� int�� ==��.
			System.out.println("�������: " +(a+b));
		}else if (c.equals("-")) {
			System.out.println("�������: " +(a-b));
		}else if (c.equals("*")) {
			System.out.println("�������: " +(a*b));
		}else if (c.equals("/")) {
			System.out.println("���������: " +(a/b));
		}else if (c.equals("%")) {
			System.out.println("���������: " +(a%b));
		}else {
			System.out.println("�����ڰ� Ʋ�Ƚ��ϴ�.");
		}
		sc.close();
		
	}
}
