package utilTest;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		//Key�� Value�� ������ Map�̶� �ڷᱸ��.
		HashMap<String, String> hm=new HashMap<String, String>();
		//Map�� �����ϴ� ��ɾ�� put.
		//������ �߿����� �ʰ� ���� ������.
		hm.put("one", "ù��°");
		hm.put("two", "�ι�°");
		hm.put("three", "����°");
		hm.put("four", "�׹�°");
		System.out.println(hm);
		System.out.println(hm.size()); //ũ��� length�� �ƴ� size();
		hm.put("one", "ù��° one"); //Ű�� �ߺ��Ǹ� ������� �ʰ� ����Ⱑ �ȴ�.
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.get("two")); //�ι�°. get�� �μ��� Ű�� ������ value���� �˷���.
		hm.put("1","���γ���");
		System.out.println(hm);
		
		//key�� ���� ����Ϸ��� keySet()�Լ� �̿�.
		for(String s:hm.keySet()) {
			System.out.println(s);
		}
		//value���� ����Ϸ��� get()�Լ� �̿�
		for(String s:hm.keySet()) {
			System.out.println(hm.get(s));
		}
		System.out.println(hm.containsKey("1")); //true. key���� 1�� �ִ��� ���
		System.out.println(hm.containsValue("�ι�°")); //true. value���� �ι�°�� �ִ��� ���
		
		//value���� ����ϴ� �Ǵٸ� �Լ� values()
		for(String s:hm.values()) {
			System.out.println(s); 
		}
		
	}
}
