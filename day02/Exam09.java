package day02;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		//수를 입력하는데 -1이 입력되면 입력 끝.
		//입력한 수의 합계와 평균을 구하시오
		//예)10 5 6 9 -1
		Scanner sc=new Scanner(System.in);
		System.out.println("수를 입력하세요. 마지막은 -1");
		
		int sum=0;
		int cnt=0; //평균을 구하려면 합계를 '입력한 수의 개수'만큼 나눠야함. 몇 번을 입력했는지 알려면 개수도 카운트 되어야함. 
		
		while(true) {
			int su=sc.nextInt();
			if(su==-1) break; //-1을 입력하면 벗어나기.
			sum+=su; //입력한 수, su에 수를 입력 할때마다 덧셈. su가 -1이 아니라면 계속 더함.
			cnt++; //-1을 입력하기 전까지 개수를 셈. su에 수를 입력 할때마다 1씩 증가.
		}
		System.out.println("합계: "+sum);
		System.out.println("입력개수: "+cnt);
		System.out.println("평균: "+sum/cnt);
		sc.close();
	}

}
