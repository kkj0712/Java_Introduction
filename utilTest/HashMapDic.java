package utilTest;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDic {

	public static void main(String[] args) {
		
		HashMap<String, String>dic=new HashMap<String, String>();
		dic.put("baby", "�Ʊ�"); 
		dic.put("love", "���");
		dic.put("apple", "���");
		//����ڷκ��� ���� �ܾ �Է¹ް� �ѱ� �ܾ� �˻�.
		//"exit" �Է¹����� ����.
	
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("����ܾ� �Է�>> ���� exit");
			String word=sc.nextLine();
			if(word.toLowerCase().equals("exit")) {
				System.out.println("�����մϴ�.");
				break;
			}
			String kor=dic.get(word); //get�� �ϸ� value���� ���ϵǴϱ� �� ���� �ִٰ� �̸� �����ϴ� ��
			if(kor==null) {
				System.out.println(word+"�� ���� �ܾ�");
			}else {
				System.out.println(kor);
			}
		}System.out.println(dic);
	}
}
