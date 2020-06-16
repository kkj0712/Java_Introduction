package day06_objectArray;

public class PlayerManager {
	private final int MAX_INT=50;
	Player[]arr=new Player[MAX_INT];
	private int cnt;
	
	void insertPlayer() {
		System.out.println("선수 정보 등록...");
		System.out.print("이름: ");
		String name=PlayerMain.sc.nextLine();
		System.out.print("주소: ");
		String address=PlayerMain.sc.nextLine();
		System.out.print("나이: ");
		int age=PlayerMain.sc.nextInt();
		System.out.print("키: ");
		double height=PlayerMain.sc.nextDouble();
		System.out.print("몸무게: ");
		double weight=PlayerMain.sc.nextDouble();
		arr[cnt++]=new Player(name, address, age, height, weight);
	}
	
	public void viewPlayer() {
		System.out.println("선수이름\t나이");
		for(Player player : arr) {
			if(player==null) break;
			System.out.print(player.getName()+"\t");
			System.out.print(player.getAge()+"\n");
		}
	}
	
	public void searchPlayer() {
		System.out.println("찾을 선수 이름>>");
		String searchName=PlayerMain.sc.next();
		Player p = search(searchName);
		if(p==null) {
			System.out.println("찾는 선수 없음");
			return;
		}
		p.getInfo();
	}
	
	public Player search(String searchName) { //리턴형이 객체일 수도 있다.
		for(int i=0;i<cnt;i++) {
			if(searchName.equals(arr[i].getName())) {
				return arr[i]; //객체를 리턴시켜줌.
			}
		}
		return null;
	}
		
	/*
	public void searchPlayer() {
		System.out.println("찾을 선수 이름>>");
		//이름이 같으면 찾는 선수
		//찾는 선수의 모든 정보를 출력
		//없으면 찾는 선수가 없습니다. 라고 출력
		
		String search=PlayerMain.sc.next();
		Player p=null;

		for(int i=0;i<cnt;i++) {
			if(search.equals(arr[i].getName())) {
				p=arr[i];
				break;
			}
		}
		if(p!=null) {
			//이름, 나이, 주소, 키, 몸무게
			p.getInfo();
		}else{
			System.out.println("찾는 선수가 없습니다.");
		}
		*/
}
