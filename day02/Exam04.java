package day02;

public class Exam04 {
	public static void main(String[] args) {
		
		/* 1���� 100������ ���� ����Ҷ� 10������ ������ ����ϱ�
		int hap=0;
		for(int i=1;i<=100;i++) {
			hap+=i; //1���� 100������ ���� hap������ ����
			if(i%10==0) { //i�� 10���� ������ ��������: 10,20,30,...100����. �׶��� hap�� ����ϰڴٴ� �ǹ�.
				System.out.println("1����"+i+"������ �� "+hap);
			}
		}
		*/
		
		/* 1+2+3+4+5+6+7+8+9+10=55 �������� ǥ���ϱ�
		int s=0;
		for(int i=1;i<=10;i++) {
			s+=i;
			if(i!=10) {
				System.out.print(i+"+");
			}else {
				System.out.print(i+"="+s);
			}
		}
		*/
		
		System.out.println("=======");
		
		int h=0;
		for(int i=1;i<=10;i++) {
			h+=i;
			if(i==1) {
				System.out.print(i);
			}else {
				System.out.print("+"+i);
			}
		}System.out.print("="+h);
		
	}
}