package day04;

public class Bank {
	String name; //�̸� ������� (��������)
	int money; //�ܾ�
	
	//�����ڴ� �׻� Ŭ���� �ٷ� �ؿ� �����
	public Bank() {
	}
	
	public Bank(String name, int money) {
		this.name=name; //���� name�� 4���� name, ���� name�� 12���� name.
		this.money=money;
		System.out.println(name+" ���� �ܾ��� "+money+"�� �Դϴ�.");
	}
			
	//�Ա�. �ܾ׿��ٰ� �Ա��� ��ŭ�� ���� ���ϴ� ��.
	public void inputMoney(int a) { //don�� ��������
		money+=a;
	}
	//���
	public void outputMoney(int b) {
		if(money<b) {
			System.out.println("�ܾ׺���");
			return; //������ ���� ���� return�� break�� �ǹ�. if else�� �Ȱ��� ��
		}
		money-=b;
	}
	//�ܾ�Ȯ��
	public void getMoney() {
		System.out.println(name+" ���� �ܾ��� "+money+"�� �Դϴ�.");
	}
	
	public static void main(String[]args) {
		Bank b1=new Bank();
		b1.name="ȫ�浿";
		b1.inputMoney(5000);
		b1.getMoney();
		b1.outputMoney(3000);
		b1.getMoney();
		
		Bank b2=new Bank();
		b2.name="�̼���";
		b2.inputMoney(10000);
		b2.getMoney();
		b2.outputMoney(20000); //�ܾ׺���
		b2.getMoney(); //�̼��Ŵ� 10000��
		
		Bank b3=new Bank("������",20000);
		Bank b4=new Bank("������",10000);
		
	}
}
