package day04;

public class TV {
	String name; //멤버변수
	int year, inch; //멤버변수
	
	public TV(String name,int year, int inch) {  //생성자. 생성자는 void쓰면 안됨.
		this.name=name;     //자신의 멤버변수name에 지역변수name을 받음. 
		this.year=year;
		this.inch=inch;
	}
	
	public void show() {
		System.out.println(name+"에서 만든 "+year+"년 형 "+inch+"인치 TV");
	}
		
	public static void main(String[] args) {
		TV tv=new TV("LG",2020,60);             //앞의 TV는 클래스. 뒤에 TV는 생성자.
		tv.show(); //LG에서 만든 2020년형 60인치 TV
		
		TV mytv=new TV("삼성", 2019,55);
		mytv.show(); //삼성에서 만든 2019년형 55인치 TV
		
		
	}	
}
