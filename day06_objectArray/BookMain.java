package day06_objectArray;

import java.util.Scanner;

public class BookMain {
	static Scanner sc =new Scanner(System.in);
	BookBean[]arr=new BookBean[50];
	int cnt; //멤버변수의 초기값은 0이라서 굳이 0 안줘도 됨.
	
	public void showMenu() {
		System.out.println("선택하세요");
		System.out.println("1.데이터입력");
		System.out.println("2.전체보기");
		System.out.println("3.종료");
		System.out.println("선택>>");
	}
	//데이터 입력
	public void bookInsert() {
		System.out.println("데이터 입력하세요...");
		System.out.print("책제목: ");
		String title=sc.nextLine(); //한줄 입력받는 것. 한줄은 엔터 입력 전까지 인식.
		System.out.print("책저자: ");
		String writer=sc.nextLine();
		arr[cnt++] = new BookBean(title, writer); //입력받으면 배열에 저장하기.
	}
	
	public void bookList() {
		System.out.println("제목\t작가");
		/*
		for(int i=0;i<cnt;i++) {
			System.out.print(arr[i].title+"\t");
			System.out.print(arr[i].writer+"\n");
		}
		*/
		
		for(BookBean book : arr) { //향상된 for문. for-each
			if(book==null) break;
			System.out.print(book.getTitle()+"\t");
			System.out.print(book.getWriter()+"\n");
		}
		
	}
	
	public static void main(String[] args) {
		BookMain bm=new BookMain();
		while(true) {
			bm.showMenu(); //메뉴
			int choice=sc.nextInt();
			BookMain.sc.nextLine(); //그 전의 엔터를 버림
			switch(choice) {
			case 1 : bm.bookInsert(); break;
			case 2 : bm.bookList(); break;
			case 3 : System.out.println("종료");
					 System.exit(0);
			default : System.out.println("입력오류");
			}
		}
	}
}