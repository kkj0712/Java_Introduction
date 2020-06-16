package day05_object;

import java.util.Scanner;

public class TwoArrayScore {
	static Scanner sc=new Scanner(System.in);
	int[][] arr=new int[50][7]; //50개의 행과 7개의 열(학번, 국, 영, 수, 총점, 평균, 석차)을 가진 이차원 배열 선언
	//입력되는 성적들이 다른 값들로 대체되어 지워지지 않게 배열에다가 저장해둠.
	int row=0;
	
	public void showMenu() {
		System.out.println("선택하세요");
		System.out.println("1.데이터입력");
		System.out.println("2.전체보기/종료");
		System.out.println("선택>>");
	}
	
	public void inputData() { //성적입력
		System.out.println("성적입력 시작>>");
		System.out.print("학번>>");
		int yearNum=sc.nextInt();
		System.out.print("국어>>");
		int kor=sc.nextInt();
		System.out.print("영어>>");
		int eng=sc.nextInt();
		System.out.print("수학>>");
		int math=sc.nextInt();
		arr[row][0]=yearNum; 		//학번
		arr[row][1]=kor; 			//국어성적
		arr[row][2]=eng; 			//영어성적
		arr[row][3]=math; 		//수학성적
		arr[row][4]=kor+eng+math; //총점
		arr[row][5]=arr[row][4]/3;  //평균
		arr[row][6]=1; 			//석차
		row++;
	}
	
	public void rankMethod() { //석차 구하는 메소드
		for(int i=0;i<row-1;i++) { //i가 row행의 마지막 값이 되면 비교할 다음값이 없어서.
			for(int j=i+1;j<row;j++) {
				if(arr[i][4]>arr[j][4]) {
					arr[j][6]++; //j번째 총점이 더 작으므로 j가 순위에서 밀려나는 것.
				}else {
					arr[i][6]++; //i번째 총점이 더 작으므로 i가 순위에서 밀려나는 것.
				}
			}
		}
	}	
	
	public void viewData() { //전체보기
		rankMethod();
		System.out.println("------성적 보기------");
		System.out.print("학번\t국어\t수학\t영어\t총점\t평균\t순위");
		System.out.println();
		//for(int i=0;i<row;i++) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i][0]==0) break;
			for(int j=0;j<arr[i].length;j++) { //arr각 방에 들어있는 길이. 과목이 추가될 수도 있으니..
				System.out.print(arr[i][j]+"\t");
			}System.out.println();
		}
	}
	
	public static void main(String[] args) {
		TwoArrayScore manager=new TwoArrayScore();
		while(true) {
			manager.showMenu(); //메뉴보여주기
			int num=sc.nextInt(); //메뉴 선택 
			switch(num) {
			case 1 : manager.inputData(); break; //성적입력
			case 2 : manager.viewData(); System.exit(0); //전체보기/ 종료
			default : System.out.println("입력오류");
			}
			
		}

	}
}