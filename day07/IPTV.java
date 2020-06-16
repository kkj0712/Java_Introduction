package day07;

public class IPTV extends ColorTV {
	private String address;
	
	public IPTV(String address, int inch, int nColors) {
		super(inch,nColors); //super로 가져오는 인자들은 항상 맨 윗줄에 써야함. 
		this.address=address;
	}
	
	public void printProperty() {
		System.out.println("나의 IPTV는 "+this.address+" 주소의 "+inch+"인치 "+nColors+"컬러");
		super.printProperty();
	}

}