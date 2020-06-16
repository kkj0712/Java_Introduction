package utilTest;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("java", "1111");
		map.put("oracle", "1234");
		map.put("jsp", "abcd");

		System.out.println("ID를 입력하세요");
		String id=sc.nextLine();
		
		System.out.println("패스워드를 입력하세요");
		String pw=sc.nextLine();
		
		if(map.containsKey(id)==false) { //id가 없음
			System.out.println("ID 존재 안함");
		}
		//get(key)이 가리키는 value값과 pw가 일치하는지 물어봄.
		else if(map.get(id).equals(pw)==false) {//비번오류
			System.out.println("비번 일치 하지 않음");
		}
		else {
			System.out.println("ID/PWD 일치");
		}
	
		
	}
}