package utilTest;
//나라를 보여주면 수도를 맞추는 어플
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CapitalApp {
	public static Scanner sc=new Scanner(System.in);
	private HashMap<String, String>map=new HashMap<String, String>();
	public CapitalApp() {
		map.put("한국", "서울");
		map.put("일본", "동경");
		map.put("중국", "베이찡");
		map.put("미국", "워싱턴");
		map.put("영국", "런던");
		map.put("프랑스", "파리");
		map.put("독일", "베를린");
	}
	
	public static void showMenu() {
		System.out.println("***수도 맞추기 게임을 시작합니다.***");
		System.out.println("입력: 1, 퀴즈: 2, 종료: 3>>");
	}
	
	public void input() {
		System.out.println("현재 "+map.size()+" 개 나라와 수도 입력");
		while(true) {
			System.out.println("나라와 수도 입력(종료는 x)>>");
			String cont=sc.next(); //나라
			if(cont.toUpperCase().equals("X")) break;
			//맵에 입력한 나라가 있는지 확인
			if(map.containsKey(cont)==true) {
				System.out.println("이미 입력한 나라입니다.");
				continue; //다시 반복문을 수행해라
			}
			String cap=sc.next(); //수도
			map.put(cont,cap);
		}
	}
	
	public void test() {
		//나라를 알려주면 해당하는 수도를 맞추는 퀴즈.
		//나라를 랜덤하게 알려줘야함. 맵의 특성은 랜덤하게 값을 저장한다는 것.
		//맵은 위치값으로 접근할 수 없다. 해쉬맵을 배열에 담아줘야 순서를 정할 수 있다.
		//컴퓨터가 랜덤하게 나라를 알려주면 그에 대한 수도를 입력. 그에 대한 정답, 오답 판단.
		//중복을 허용하지 않는 자료구조를 set이라 함
		//왜 맵의 키값(나라)을 set자료구조에 담을까? set은 집합이라 중복이 허용되지 않음..
		Set<String> set = map.keySet();
		//배열로 변환
		Object[]arr=set.toArray(); //set을 배열 형태로 변환(순서를 알기위해)
		while(true) {
			int n=(int)(Math.random()*map.size());
			String city=(String)arr[n]; //나라 이름
			String dosi=map.get(city); //도시
			//문제출제
			System.out.println(city+" 의 수도는? 종료는 x>>");
			String dap=sc.next();
			if(dap.toLowerCase().equals("x")) {
				System.out.println("종료합니다.");
				break;
			}
			if(dap.equals(dosi)) {
				System.out.println("정답입니다.");
			}
			else {
				System.out.println("틀렸습니다.");
			}
		}
	}
		
	public static void main(String[] args) {
		CapitalApp ca=new CapitalApp();
		while(true) {
			//클래스 이름을 앞에 붙였단 것은 static으로 만들었다는 것.
			CapitalApp.showMenu();
			int choice=sc.nextInt();
			switch(choice) {
			case 1 : ca.input(); break;
			case 2 : ca.test(); break;
			case 3 : System.out.println("종료");
					 System.exit(0);
			default : System.out.println("입력오류");
			}
		}
	}
}
