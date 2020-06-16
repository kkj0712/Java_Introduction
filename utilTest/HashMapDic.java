package utilTest;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDic {

	public static void main(String[] args) {
		
		HashMap<String, String>dic=new HashMap<String, String>();
		dic.put("baby", "아기"); 
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		//사용자로부터 영어 단어를 입력받고 한글 단어 검색.
		//"exit" 입력받으면 종료.
	
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("영어단어 입력>> 종료 exit");
			String word=sc.nextLine();
			if(word.toLowerCase().equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			String kor=dic.get(word); //get을 하면 value값이 리턴되니까 그 값이 있다고 미리 가정하는 것
			if(kor==null) {
				System.out.println(word+"는 없는 단어");
			}else {
				System.out.println(kor);
			}
		}System.out.println(dic);
	}
}
