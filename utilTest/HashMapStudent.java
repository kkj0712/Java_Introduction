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
		//id를 물어보면 학생이 있는지 알려줘야하니까 value값에는 클래스 Student가 들어감
		HashMap<String, Student>map=new HashMap<String, Student>();
		map.put("홍",new Student("1", "010-1111-1111","홍길동"));
		map.put("이",new Student("2", "010-2222-2222","이순신"));
		map.put("강",new Student("3", "010-3333-3333","강감찬"));
		
		//키 값에 "홍"이 있을때의 value 값은?
		Student sid =map.get("홍");
		
		//System.out.println(sid.name)하면 오류남. name을 private이라 했으니.
		//따라서 name을 돌려주는 getter 메소드 가 필요함
		System.out.println(sid.getName());
		System.out.println(sid); //객체니까 주소값이 나올 수 밖에 없음.
		//주소 값이 안나오도록 toString()을 사용하여 오버라이딩 해야함.
		System.out.println(sid);
	
		System.out.println(sid.getTel());
		
		//map의 학생 정보를 출력하세요. for이용
		for(String value: map.keySet()) {
			System.out.println(map.get(value));
		}
		
		//map의 학생 정보를 출력하세요. iterator이용
		System.out.println("===iterator===");
		Set<String>set=map.keySet();
		Iterator<String>it=set.iterator();
		while(it.hasNext()) {
			System.out.println(map.get(it.next()));
		}
	}
}