package utilTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test01 {

	public static void main(String[] args) {
		//1부터 20사이의 난수 10개를 map에 넣으시오
		//키 값은 1~10, value값은 1~20사이 난수
		//단 중복된 난수는 허용하지 않는다.
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=1;i<11;i++) {
			while(true) {
				int value=(int)(Math.random()*20)+1; //1에서 20사이
				if(!map.containsValue(value)) { 
					//map.containsValue(value)==false와 같은말
					//value가 없으면 value값에 넣으란 소리.
					//중복된 게 있으면 키값도 삭제해버리니까 while문을 쓰는게 좋음
				map.put(i,value);
				break;
				}
			}
		}
		for(Integer i:map.values()) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println(map);
		
		System.out.println();
		//map에 들어있는 value값들을 Integer형 ArrayList에 담는다. 
		List<Integer>list=new ArrayList<Integer>(map.values());
		//작은값부터 정렬한다.
		Collections.sort(list);
		for(int i:list) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		//거꾸로 정렬 reverse
		Collections.reverse(list);
		for(int i:list) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("최대값: "+Collections.max(list));
		System.out.println("최소값: "+Collections.min(list));
	}
}