package utilTest;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		//Key와 Value로 구성된 Map이란 자료구조.
		HashMap<String, String> hm=new HashMap<String, String>();
		//Map에 저장하는 명령어는 put.
		//순서는 중요하지 않고 값만 돌려줌.
		hm.put("one", "첫번째");
		hm.put("two", "두번째");
		hm.put("three", "세번째");
		hm.put("four", "네번째");
		System.out.println(hm);
		System.out.println(hm.size()); //크기는 length가 아닌 size();
		hm.put("one", "첫번째 one"); //키가 중복되면 허용하지 않고 덮어쓰기가 된다.
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.get("two")); //두번째. get의 인수로 키를 적으면 value값을 알려줌.
		hm.put("1","새로넣음");
		System.out.println(hm);
		
		//key의 값을 출력하려면 keySet()함수 이용.
		for(String s:hm.keySet()) {
			System.out.println(s);
		}
		//value값을 출력하려면 get()함수 이용
		for(String s:hm.keySet()) {
			System.out.println(hm.get(s));
		}
		System.out.println(hm.containsKey("1")); //true. key값에 1이 있는지 물어봄
		System.out.println(hm.containsValue("두번째")); //true. value값에 두번째가 있는지 물어봄
		
		//value값을 출력하는 또다른 함수 values()
		for(String s:hm.values()) {
			System.out.println(s); 
		}
		
	}
}
