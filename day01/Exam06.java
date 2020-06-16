package day01;
import java.util.Scanner; //java안에 util안에 Scanner를 import한다.

public class Exam06 {
	public static void main(String[] args) {
		System.out.println("수를 입력하세요>>"); //scanner 이용해서 수를 입력받아서 출력하도록 명령.
		Scanner sc = new Scanner(System.in); //new라는 키워드를 이용해 스캐너에 값 입력. 키보드로 입력하도록.
		int su = sc.nextInt(); //a라는 "문자"를 넣게되면 오류 발생
		if(su%2==0) {
			System.out.println(su+ " 짝수");
		}else {
			System.out.println(su+ " 홀수");	
		}
		
		System.out.println("나이를 입력하세요>>");
		int age = sc.nextInt(); //정수 입력 받음.
		if(age>=20) {
			System.out.println("입장가능");
		}else if(age>=15) { //&&를 쓸 필요 없음. 이미 20보다 작기때문에 여기로 내려온 거라서. else if 가 아니라 if라면 써야함. 
			System.out.println("부모님과 동반입장");
		}else {
			System.out.println("입장 불가능");
		}
		sc.close();
	}
}
