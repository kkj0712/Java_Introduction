package day04;

public class TV {
	String name; //�������
	int year, inch; //�������
	
	public TV(String name,int year, int inch) {  //������. �����ڴ� void���� �ȵ�.
		this.name=name;     //�ڽ��� �������name�� ��������name�� ����. 
		this.year=year;
		this.inch=inch;
	}
	
	public void show() {
		System.out.println(name+"���� ���� "+year+"�� �� "+inch+"��ġ TV");
	}
		
	public static void main(String[] args) {
		TV tv=new TV("LG",2020,60);             //���� TV�� Ŭ����. �ڿ� TV�� ������.
		tv.show(); //LG���� ���� 2020���� 60��ġ TV
		
		TV mytv=new TV("�Ｚ", 2019,55);
		mytv.show(); //�Ｚ���� ���� 2019���� 55��ġ TV
		
		
	}	
}
