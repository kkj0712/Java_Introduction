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

		System.out.println("ID�� �Է��ϼ���");
		String id=sc.nextLine();
		
		System.out.println("�н����带 �Է��ϼ���");
		String pw=sc.nextLine();
		
		if(map.containsKey(id)==false) { //id�� ����
			System.out.println("ID ���� ����");
		}
		//get(key)�� ����Ű�� value���� pw�� ��ġ�ϴ��� ���.
		else if(map.get(id).equals(pw)==false) {//�������
			System.out.println("��� ��ġ ���� ����");
		}
		else {
			System.out.println("ID/PWD ��ġ");
		}
	
		
	}
}