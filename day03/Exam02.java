package day03;

public class Exam02 {
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i+=10) {
			int sum=0; //sum�� �ʱ�ȭ���Ѿ� �ٽ� 11���� 20����, 21���� 30���� ���� ���� �� ����.
			int j;
			for(j=i;j<i+10;j++) {
				sum+=j;
			}
			System.out.println(i+"����"+(j-1)+"������ ��: "+sum);
		}
		System.out.println();



	}
}
