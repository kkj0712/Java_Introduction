package day06_objectArray;

public class PlayerManager {
	private final int MAX_INT=50;
	Player[]arr=new Player[MAX_INT];
	private int cnt;
	
	void insertPlayer() {
		System.out.println("���� ���� ���...");
		System.out.print("�̸�: ");
		String name=PlayerMain.sc.nextLine();
		System.out.print("�ּ�: ");
		String address=PlayerMain.sc.nextLine();
		System.out.print("����: ");
		int age=PlayerMain.sc.nextInt();
		System.out.print("Ű: ");
		double height=PlayerMain.sc.nextDouble();
		System.out.print("������: ");
		double weight=PlayerMain.sc.nextDouble();
		arr[cnt++]=new Player(name, address, age, height, weight);
	}
	
	public void viewPlayer() {
		System.out.println("�����̸�\t����");
		for(Player player : arr) {
			if(player==null) break;
			System.out.print(player.getName()+"\t");
			System.out.print(player.getAge()+"\n");
		}
	}
	
	public void searchPlayer() {
		System.out.println("ã�� ���� �̸�>>");
		String searchName=PlayerMain.sc.next();
		Player p = search(searchName);
		if(p==null) {
			System.out.println("ã�� ���� ����");
			return;
		}
		p.getInfo();
	}
	
	public Player search(String searchName) { //�������� ��ü�� ���� �ִ�.
		for(int i=0;i<cnt;i++) {
			if(searchName.equals(arr[i].getName())) {
				return arr[i]; //��ü�� ���Ͻ�����.
			}
		}
		return null;
	}
		
	/*
	public void searchPlayer() {
		System.out.println("ã�� ���� �̸�>>");
		//�̸��� ������ ã�� ����
		//ã�� ������ ��� ������ ���
		//������ ã�� ������ �����ϴ�. ��� ���
		
		String search=PlayerMain.sc.next();
		Player p=null;

		for(int i=0;i<cnt;i++) {
			if(search.equals(arr[i].getName())) {
				p=arr[i];
				break;
			}
		}
		if(p!=null) {
			//�̸�, ����, �ּ�, Ű, ������
			p.getInfo();
		}else{
			System.out.println("ã�� ������ �����ϴ�.");
		}
		*/
}
