package day03;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		
		int[] data= {10,5,90,100,250,30,77};
		
		//최대값을 구하기
		//최대값의 위치 구하기
		
		int max=data[0]; //0번째 데이터가 제일 크다고 max변수를 선언
		int maxPos=0;
		int sum=0;
		
		for(int i=0;i<data.length;i++) {		
			sum+=data[i];
			if(max<data[i]) {
				max=data[i];
				maxPos=i+1; //배열의 주소는 0부터지만 앞에서부터 개수를 센다고 생각했을때 최대값 250은 5번째에 있다.
			}
		}
		
		System.out.println("최대값: " +max);
		System.out.println("최대값의 위치: "+maxPos);
		System.out.println("배열의 합계: "+sum);
		System.out.println("배열의 평균: "+(float)sum/data.length);
		
		
		Scanner sc=new Scanner(System.in);				
		System.out.println("찾는 수를 입력하세요>>");
		int search=sc.nextInt();
		boolean flag=false; //변수를 선언
		
		for(int i=0;i<data.length;i++) {
			if(search==data[i]) {
				System.out.println("찾는 수 "+search+" :"+(i+1));
				flag=true; //변수의 참 여부에 따라 조건을 설정->출력문 하나만 나오도록.
			}
		}
		if(flag==false) { //flag에 0,1 값을 주는게 아니라 0인지 1인지 값을 판별하므로 == 기호를 쓴다.
			System.out.println("찾는 수"+search+"없음");
		}
		sc.close();
		
		
	}
}
