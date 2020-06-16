package day04;

import java.util.Scanner;

public class Gugudan {
	int dan; //멤버변수
	
	public Gugudan(int dan) { //보통 생성자는 초기화만 시킨다. 디폴트 생성자는 굳이 필요없으면 안만들어도 됨.
		this.dan=dan;
	}
	
	public void viewData() { //구구단 출력
		System.out.println(dan+"단"); 
		for(int i=1;i<10;i++) {  
			System.out.println(dan+"*"+i+"="+(dan*i)); 
		}
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("단 입력");
	int dan2=sc.nextInt();
	
	Gugudan gn=new Gugudan(dan2);
	gn.viewData();
		
	Gugudan g1=new Gugudan(5);
	g1.viewData();
	/*
	 * 5*1=5
	 * 5*2=10
	 * 
	 * 5*9=45
	 */
	Gugudan g2=new Gugudan(7);
	g2.viewData();
	
	Gugudan g3=new Gugudan(9);
	g3.viewData();
	
	
		
	}
}
