package day02;

public class Exam08 {
	public static void main(String[] args) {
		//1���� 10���� Ȧ���� ���� ���ϱ�
		
		int i=0;
		int sum=0;
		while (i<10) {
			i++;
			if(i%2==1) {
				sum+=i;
			}
		}
		System.out.println("���: "+sum);
		System.out.println("======");
		
		int hap=0;
		for(int j=1;j<=10;j++) { 
			if(j%2!=1) continue;
			hap+=j;
		}
		System.out.println("continue ���: "+hap);
		System.out.println("======");
		/*j�� 1�϶� j%2!=1�̶� ���ǿ� �Ȱɸ�. continue �Ȱɸ��� hap�� j�� ����
		 * j�� 2�϶� j%2!=1�̶� ���ǿ� �ɸ�. �׷��� continue������ �ٽ� �ö�.
		 * �ᱹ Ȧ���� ���ϰ� �Ǵ°�.
		 */
		
		System.out.println("���: "+sum);
		System.out.println("======");
		
		int h=0;
		for(int k=1;k<=10;k++) { 
			if(k%2!=1) break; 
			h+=k;
		}
		System.out.println("break ���: "+h);
		System.out.println("======");
		/*break�� �ݺ����� �����. 
		 * k�� 1�϶� h�� 1. k�� 2�϶� �������� 1�� �ƴϹǷ� break�� ������ �ݺ����� ���. 
		 * �׷��� h�� 1�ۿ� �ȵ�
		 */
	
	}
}
