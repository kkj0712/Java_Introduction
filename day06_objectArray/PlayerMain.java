package day06_objectArray;

import java.util.Scanner;

public class PlayerMain {
	static Scanner sc=new Scanner(System.in);

	public static void showMenu() {
		System.out.println("선택하세요");
		System.out.println("1.선수 데이터입력");
		System.out.println("2.전체보기");
		System.out.println("3.선수찾기");
		System.out.println("4.종료");
		System.out.println("선택>>");
	}
	
	public static void main(String[] args) {
		PlayerManager pm=new PlayerManager();
		while(true){
			PlayerMain.showMenu();
			int choice=PlayerMain.sc.nextInt();
			PlayerMain.sc.nextLine();
			switch(choice) {
			case 1 : pm.insertPlayer(); break; 
			//PlayerManager에다 pm을 만들었으니
			//PlayerManager에서 insertPlayer, viewPlayer메소드 만들어줌.
			case 2 : pm.viewPlayer(); break; //이름, 나이 출력
			case 3 : pm.searchPlayer(); break;
			case 4 : System.out.println("종료");
					 System.exit(0);
			default : System.out.println("입력오류");
			}
		}
	}
}
