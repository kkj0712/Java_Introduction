package day03;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("입력 갯수>>");
		int cnt=sc.nextInt();
		
		System.out.println("데이터 입력>>");
		int sum=0;
				
		int[]arr= new int[cnt];
		
		for(int i=0;i<cnt;i++) {
			arr[i]=sc.nextInt(); //배열에 바로 수를 입력하도록
			sum+=arr[i];		//합계 sum은 배열에 차례대로 입력된 수를 더함
		}
		System.out.println("합계: "+sum);
		for(int i=0;i<cnt;i++) {
			System.out.println("입력 데이터: "+arr[i]); 
			//for문 안에 안넣으면 오류발생. 배열 arr의 주소 0부터 입력 개수cnt 전까지 차례대로 출력함.
		}
		
		sc.close();
	}
}
