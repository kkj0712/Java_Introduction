package day03;

import java.util.Scanner;

public class Exam08 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("금액입력>>"); //65589
		int unit[]= {50000,10000,1000,500,100,50,10,1};
		int money=sc.nextInt();
			
		for(int i=0;i<unit.length;i++) {
			if(money/unit[i]>0) {  //몫을 먼저 구한뒤에 나머지를 계산해야 하니까 %연산자 보다 /연산자가 더 먼저 나와야 함. 
				System.out.println(unit[i]+":"+money/unit[i]); //result값을 따로 주지 않고 money/arr[i]로 표현.
				money=money%unit[i];
			}
		}
		
		sc.close();
		
	}
}
