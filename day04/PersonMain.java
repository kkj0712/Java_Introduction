package day04;

public class PersonMain {
	
	public static void main(String[] args) {
		Person p1=new Person(); //����� PersonMainŬ���� �̹Ƿ� PersonŬ������ ���� Person�����ڸ� ����� ��.
		p1.name="ȫ�浿";
		p1.addr="�λ�";
		p1.study();
		
		Bank b=new Bank("���ڹ�", 5000); //�ʿ��ϸ� �������� �θ� �� ����. ���뼺.
		b.getMoney();
		
		Baby baby=new Baby();
		baby.name="�ֱ�";
		baby.smile(); //String�� �ʱⰪ�� null. 
		
		Baby baby1=new Baby("��ֱ�");
		baby1.cry();
		
		//������ 10���� ���
		Gugudan g10=new Gugudan(10);
		g10.viewData();
		
	}
}
