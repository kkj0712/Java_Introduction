package day02;

public class Exam10 {

	public static void main(String[] args) {
	
		for(int k=2;k<=4;k++) { //���� for��. �ٱ� for�� �ѹ� ���� �ȿ� for�� �� ���� ���� �ٱ� for�� �ι�° ��.
			for(int i=1;i<=3;i++) {
				System.out.println(k+"*"+i+"="+k*i);	
			}
			System.out.println("===");
		}
	
		
		for(int i=1;i<=9;i++) {
			for(int d=4;d<=6;d++){
				System.out.print(d+"*"+i+"="+d*i+"\t");				
			}
			System.out.println();  
		}
		System.out.println("===");
		
		/*if���� ���� �ɰ� 6�̸� ��ĭ ����=>�̷������� ���ص� 6�Ǹ� �ڵ����� ��ĭ �����.
		 * 6��� ���� ��ĭ ���� �Ǵϱ� ���� for���� �ٱ� for�� ���̿� ����.
		 */
		/* 123456789
		 * 1234567
		 * 12345
		 * 123
		 * 1
		 */
		for(int i=9;i>0;i-=2) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("=====");
		
		for(int i=1;i<10;i+=2) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("=====");
		
		
		for(int i=3;i<=7;i+=2) {
			System.out.println(i+"��");
			for(int j=1;j<10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
		
	}	
}

