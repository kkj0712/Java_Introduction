package day04;

public class Exam02 {
	public static void main(String[] args) {
		//������ �迭�� �Է��ϵ�
		//�� ��ġ�� �����ϰ� ���ϰ�
		//1���� 100������ ���� �����ÿ�
		//��, ���� �̹� �� ������ ���� �ʴ´�.
		
		int []arr=new int[5]; //0 0 0 0 0
		int n=0;
		while(n<arr.length){ //�迭�� ���� ��ŭ �ݺ��Ѵ�. 
			int col=(int)(Math.random()*5); //�迭��ġ�� �����ϰ� ���Ѵ�.
			if(arr[col]!=0) { //�� ��ġ���� �̹� ���� ����. �׷� �ٽ� while���� ���Ƽ� "�迭�� ��ġ"�� ���Ѵ�. 
				continue; 
			}else { //�迭�� �� ���� 0�̶�� (=���� ���ٸ�) 1���� 100������ ������ �߻�. 
				arr[col]=(int)(Math.random()*100)+1; //1���� 100�����̹Ƿ� 0�� �������� 1�� �����ִ� ��.
				n++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		
		
	}
}
