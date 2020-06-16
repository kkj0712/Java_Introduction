package inheritance;

public class TV extends Product {
	
	public TV(int price) {
		super(price);
	}
	//toString은 Object이 가지는 메소드이기 때문에 오버라이딩 할 수 있다.
	//오버라이딩을 함으로써 주소가 아니라 TV, Computer등 문자가 나오도록 함
	@Override
	public String toString() {
		return "TV";
	}	
}