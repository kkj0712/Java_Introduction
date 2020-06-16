package day04;

public class StudentSunjuk {
	String name;
	int kor, math, eng;
	
	public StudentSunjuk(String name, int kor, int math, int eng) {
		this.name=name; //name을 멤버변수로 만들어주는 작업.
		this.kor=kor;
		this.math=math;
		this.eng=eng;
	}
	
	public void getTotal() {
		System.out.println(name+" 총점: "+(kor+math+eng));
	}
	
	public String getAvg() { //return 값이 있으면 void는 빼고 데이터타입을 적어줌. 문자+숫자이므로 문자형 String을 적어줌.
		return (name+" 평균: "+(kor+math+eng)/3); //return을 적어야 결과값을 StudentMain으로 돌려줄 수 있음.
	}
}
