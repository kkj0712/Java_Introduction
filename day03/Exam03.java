package day03;

public class Exam03 {
	public static void main(String[] args) {
		
		int[] arr = new int [5]; //�迭 arr ����
		arr[0] =100;
		arr[1] =200;
		arr[2] =300;
		arr[3] =400;
		arr[4] =500;
		System.out.println(arr[3]); //400
		
		
		int[] test =new int[20]; //�迭�� �ݵ�� ���̸� �Ҵ��������. int�� �迭�� 0���� �ʱ�ȭ.
		System.out.println(test[5]); //0
		for(int i=0;i<test.length;i++) { //�迭 0�� 0, 1�� 1 ����.
			test[i]=i;
		}
		System.out.println("test[5]: "+test[5]);
		test[5]=3000; //test[5]���� 3000���� ����
		System.out.println("test[5]: "+test[5]);
		
		//int [] arr= new int[5]; // 0 0 0 0 0 �̶�� �迭�� �������
		//1 2 3 4 5 ��� ������ �迭�� ����� �ʹٸ�
		int[]arr1= new int[5];
		for(int i=0;i<arr1.length;i++) { //"�迭��.length"�� �迭�� ���̸� ��ȯ��.
			arr1[i]=i+1;
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.println("arr["+i+"]:"+arr1[i]);
		}
		
		int[]arr2 = {1,2,3,4,5,6,7};
		for(int i=0;i<arr2.length;i++) {
			System.out.println("arr2["+i+"]:"+arr2[i]);
		}
		
		String[]str = {"one","two","three"};
		for(int i=0;i<str.length;i++) {
			System.out.println("str["+i+"]:"+str[i]);
		}
		
		String[]str1= new String[3];
		str1[0]="one";
		str1[1]="tow";
		str1[2]="three";
		for(int i=0;i<str1.length;i++) {
			System.out.println("str1["+i+"]:"+str1[i]);
		}
		
		
		
		
	}
}
