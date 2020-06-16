package utilTest;
//���� �����ָ� ������ ���ߴ� ����
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CapitalApp {
	public static Scanner sc=new Scanner(System.in);
	private HashMap<String, String>map=new HashMap<String, String>();
	public CapitalApp() {
		map.put("�ѱ�", "����");
		map.put("�Ϻ�", "����");
		map.put("�߱�", "������");
		map.put("�̱�", "������");
		map.put("����", "����");
		map.put("������", "�ĸ�");
		map.put("����", "������");
	}
	
	public static void showMenu() {
		System.out.println("***���� ���߱� ������ �����մϴ�.***");
		System.out.println("�Է�: 1, ����: 2, ����: 3>>");
	}
	
	public void input() {
		System.out.println("���� "+map.size()+" �� ����� ���� �Է�");
		while(true) {
			System.out.println("����� ���� �Է�(����� x)>>");
			String cont=sc.next(); //����
			if(cont.toUpperCase().equals("X")) break;
			//�ʿ� �Է��� ���� �ִ��� Ȯ��
			if(map.containsKey(cont)==true) {
				System.out.println("�̹� �Է��� �����Դϴ�.");
				continue; //�ٽ� �ݺ����� �����ض�
			}
			String cap=sc.next(); //����
			map.put(cont,cap);
		}
	}
	
	public void test() {
		//���� �˷��ָ� �ش��ϴ� ������ ���ߴ� ����.
		//���� �����ϰ� �˷������. ���� Ư���� �����ϰ� ���� �����Ѵٴ� ��.
		//���� ��ġ������ ������ �� ����. �ؽ����� �迭�� ������ ������ ���� �� �ִ�.
		//��ǻ�Ͱ� �����ϰ� ���� �˷��ָ� �׿� ���� ������ �Է�. �׿� ���� ����, ���� �Ǵ�.
		//�ߺ��� ������� �ʴ� �ڷᱸ���� set�̶� ��
		//�� ���� Ű��(����)�� set�ڷᱸ���� ������? set�� �����̶� �ߺ��� ������ ����..
		Set<String> set = map.keySet();
		//�迭�� ��ȯ
		Object[]arr=set.toArray(); //set�� �迭 ���·� ��ȯ(������ �˱�����)
		while(true) {
			int n=(int)(Math.random()*map.size());
			String city=(String)arr[n]; //���� �̸�
			String dosi=map.get(city); //����
			//��������
			System.out.println(city+" �� ������? ����� x>>");
			String dap=sc.next();
			if(dap.toLowerCase().equals("x")) {
				System.out.println("�����մϴ�.");
				break;
			}
			if(dap.equals(dosi)) {
				System.out.println("�����Դϴ�.");
			}
			else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
		}
	}
		
	public static void main(String[] args) {
		CapitalApp ca=new CapitalApp();
		while(true) {
			//Ŭ���� �̸��� �տ� �ٿ��� ���� static���� ������ٴ� ��.
			CapitalApp.showMenu();
			int choice=sc.nextInt();
			switch(choice) {
			case 1 : ca.input(); break;
			case 2 : ca.test(); break;
			case 3 : System.out.println("����");
					 System.exit(0);
			default : System.out.println("�Է¿���");
			}
		}
	}
}
