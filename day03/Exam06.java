package day03;

public class Exam06 {
	public static void main(String[] args) {
		
		//���� �߻�. double ���� ������. �ε� �Ҽ���. 0.0���� 1.0����. ������ �ʿ��ϴٸ� ���� �ڿ� int������ �ٲ��ֱ�
		/*System.out.println((int)(Math.random()*50)); 
		 * ũ�Ⱑ 10�� �迭�� �����
		 * 0���� 50���� ������ �߻�����
		 * 0�� �ƴ� ���� �迭�� �������� -> ������ 0�϶��� �ٽ� ���� �߻�
		 * �ߺ����
		 */
		
		int[] arr=new int[10]; //���� 10�� �迭 ����
		int n=0;
		while(n<arr.length){ //�迭ũ�� 10�� �ݺ�
			int r=(int)(Math.random()*50); //�����߻��� ���� r�� �Ҵ�
			if(r==0) { //������ 0���� �Ǵ�
				continue; //������ 0�̶�� �ٽ� �ö�. �ٽ� �ݺ�=>while�� continue��� �� ����ϱ�
			} //������ 0�� �ƴ�
				arr[n]=r;
				n++;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println("======");
		
		for(int i:arr) { //for-each. �迭 �ȿ� ����ִ� ���� ������ ��. ó������ ������. ���°���� ������ ���� ����.
			System.out.print(i+"\t");
		}
		System.out.println("======");
		
		String[]str= {"one","two","three","four"};
		//for-each
		for(String s:str) {
			System.out.println(s);
		}
	
		
		
	}
}
