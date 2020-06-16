package day02;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		
		/*
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
			if(i%10==0) {
				System.out.println((i-9)+"부터"+i+"까지의 합 "+sum);
				sum=0;  //if를 한번 돌고 난 다음에 sum이 0부터 시작하도록. 합을 누적시키는게 아니라 단계별로 구하기 위해서.
			}
		}
		/*학생수와 한줄에 앉을 학생 수를 입력받아 출력하시오
		 * 
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("학생 수를 입력>>");
		int stuCnt=sc.nextInt();
		System.out.println("한줄 인원 수 입력>>");
		int lineCnt=sc.nextInt();
		
		for(int i=1;i<=stuCnt;i++) {
			System.out.print(i+"\t"); //\t는 탭만큼 띄운다는 뜻
			if(i%lineCnt==0) { //i가 lineCnt 즉 한줄 인원수랑 똑같으면. 한줄에 다 찼으면
				System.out.println(); //다음 줄로 띄운다.
			}
		}
		
		/*
		int row=stuCnt%lineCnt;
		if(row==0) {
			System.out.println((stuCnt/lineCnt)+"줄 필요");
		}else {
			System.out.println(((stuCnt/lineCnt)+1+"줄 필요"));
		}
		
		*/
		//삼항 연산자(조건연산자)
		
		int r=(stuCnt%lineCnt==0)? stuCnt/lineCnt:(stuCnt/lineCnt)+1;	
		System.out.println();
		System.out.println("총라인 수: "+r);
		sc.close();
	}
}
