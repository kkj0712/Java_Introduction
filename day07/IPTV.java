package day07;

public class IPTV extends ColorTV {
	private String address;
	
	public IPTV(String address, int inch, int nColors) {
		super(inch,nColors); //super�� �������� ���ڵ��� �׻� �� ���ٿ� �����. 
		this.address=address;
	}
	
	public void printProperty() {
		System.out.println("���� IPTV�� "+this.address+" �ּ��� "+inch+"��ġ "+nColors+"�÷�");
		super.printProperty();
	}

}