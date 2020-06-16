package utilTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Student{
	private String id;
	private String tel;
	private String name;
	
	public Student(String id, String tel, String name) {
		this.id = id;
		this.tel = tel;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getTel() {
		return tel;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", tel=" + tel + ", name=" + name + "]";
	}

}
public class HashMapStudent {
	
	public static void main(String[] args) {
		//id�� ����� �л��� �ִ��� �˷�����ϴϱ� value������ Ŭ���� Student�� ��
		HashMap<String, Student>map=new HashMap<String, Student>();
		map.put("ȫ",new Student("1", "010-1111-1111","ȫ�浿"));
		map.put("��",new Student("2", "010-2222-2222","�̼���"));
		map.put("��",new Student("3", "010-3333-3333","������"));
		
		//Ű ���� "ȫ"�� �������� value ����?
		Student sid =map.get("ȫ");
		
		//System.out.println(sid.name)�ϸ� ������. name�� private�̶� ������.
		//���� name�� �����ִ� getter �޼ҵ� �� �ʿ���
		System.out.println(sid.getName());
		System.out.println(sid); //��ü�ϱ� �ּҰ��� ���� �� �ۿ� ����.
		//�ּ� ���� �ȳ������� toString()�� ����Ͽ� �������̵� �ؾ���.
		System.out.println(sid);
	
		System.out.println(sid.getTel());
		
		//map�� �л� ������ ����ϼ���. for�̿�
		for(String value: map.keySet()) {
			System.out.println(map.get(value));
		}
		
		//map�� �л� ������ ����ϼ���. iterator�̿�
		System.out.println("===iterator===");
		Set<String>set=map.keySet();
		Iterator<String>it=set.iterator();
		while(it.hasNext()) {
			System.out.println(map.get(it.next()));
		}
	}
}