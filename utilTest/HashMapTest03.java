package utilTest;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest03 {

	public static void main(String[] args) {
		/* 1.�ؽ��� map�� ����
		 * 2.�ܾ �Է¹޾� �ܾ�� �Է� Ƚ�� ����
		 * 3.��ҹ��� ���о��� xġ�� ����.
		 * 4.map���
		 */
		HashMap<String, Integer>map=new HashMap<String, Integer>();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("�ܾ �Է��ϼ���. ���� x>>");
			String word=sc.nextLine();
				if(word.toLowerCase().equals("x")) break;
				if(map.containsKey(word)) { //map�� �ܾ ������ �� ���� 1���ϱ� 
					map.put(word,map.get(word)+1);
				}else { //map�� �ܾ ������ value�� 1�̶� ǥ��.
					map.put(word,1);
				}
		//map.put(word,map.get(word)==null?1:map.get(word)+1);
		}System.out.println(map);	
	}
}