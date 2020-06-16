package day03;

public class Exam03 {
	public static void main(String[] args) {
		
		int[] arr = new int [5]; //배열 arr 선언
		arr[0] =100;
		arr[1] =200;
		arr[2] =300;
		arr[3] =400;
		arr[4] =500;
		System.out.println(arr[3]); //400
		
		
		int[] test =new int[20]; //배열은 반드시 길이를 할당해줘야함. int형 배열은 0으로 초기화.
		System.out.println(test[5]); //0
		for(int i=0;i<test.length;i++) { //배열 0에 0, 1에 1 저장.
			test[i]=i;
		}
		System.out.println("test[5]: "+test[5]);
		test[5]=3000; //test[5]값을 3000으로 변경
		System.out.println("test[5]: "+test[5]);
		
		//int [] arr= new int[5]; // 0 0 0 0 0 이라는 배열이 만들어짐
		//1 2 3 4 5 라는 값으로 배열을 만들고 싶다면
		int[]arr1= new int[5];
		for(int i=0;i<arr1.length;i++) { //"배열명.length"는 배열의 길이를 반환함.
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
