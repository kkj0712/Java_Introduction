package utilTest;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest03 {

	public static void main(String[] args) {
		/* 1.해쉬맵 map을 생성
		 * 2.단어를 입력받아 단어와 입력 횟수 저장
		 * 3.대소문자 구분없이 x치면 종료.
		 * 4.map출력
		 */
		HashMap<String, Integer>map=new HashMap<String, Integer>();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("단어를 입력하세요. 종료 x>>");
			String word=sc.nextLine();
				if(word.toLowerCase().equals("x")) break;
				if(map.containsKey(word)) { //map에 단어가 있으면 그 수에 1더하기 
					map.put(word,map.get(word)+1);
				}else { //map에 단어가 없으면 value에 1이라 표시.
					map.put(word,1);
				}
		//map.put(word,map.get(word)==null?1:map.get(word)+1);
		}System.out.println(map);	
	}
}