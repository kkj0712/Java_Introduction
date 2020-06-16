package utilTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test01 {

	public static void main(String[] args) {
		//1���� 20������ ���� 10���� map�� �����ÿ�
		//Ű ���� 1~10, value���� 1~20���� ����
		//�� �ߺ��� ������ ������� �ʴ´�.
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=1;i<11;i++) {
			while(true) {
				int value=(int)(Math.random()*20)+1; //1���� 20����
				if(!map.containsValue(value)) { 
					//map.containsValue(value)==false�� ������
					//value�� ������ value���� ������ �Ҹ�.
					//�ߺ��� �� ������ Ű���� �����ع����ϱ� while���� ���°� ����
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
		//map�� ����ִ� value������ Integer�� ArrayList�� ��´�. 
		List<Integer>list=new ArrayList<Integer>(map.values());
		//���������� �����Ѵ�.
		Collections.sort(list);
		for(int i:list) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		//�Ųٷ� ���� reverse
		Collections.reverse(list);
		for(int i:list) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("�ִ밪: "+Collections.max(list));
		System.out.println("�ּҰ�: "+Collections.min(list));
	}
}