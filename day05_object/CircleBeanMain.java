package day05_object;

public class CircleBeanMain {

	public static void main(String[] args) {
		//�������� 1,2,3,4,5 �� 5���� CircleBean��ü�� �����
		//�� CircleBean�� ���̸� ����ϰ�
		//�� ������ ����Ͻÿ�
		//�迭�� ���Ͻÿ�
		
		//�迭�� ����, ����, �ʱ�ȭ�� �Ǿ����. �� �ȿ� ���� ����־�� ��.
		CircleBean[]arr=new CircleBean[5]; //����&����
		for(int i=0;i<arr.length;i++) {
			arr[i]=new CircleBean(i+1); //�ʱ�ȭ. new�ؼ� CircleBean�� �� �渶�� ��������� ���. 1,2,3,4,5���� ����
		}
		double hap=0;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].getArea());
			hap+=arr[i].getArea();
		}
		System.out.println("�� ����: "+hap);
	}

}
