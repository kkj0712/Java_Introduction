package day04;

public class StudentSunjuk {
	String name;
	int kor, math, eng;
	
	public StudentSunjuk(String name, int kor, int math, int eng) {
		this.name=name; //name�� ��������� ������ִ� �۾�.
		this.kor=kor;
		this.math=math;
		this.eng=eng;
	}
	
	public void getTotal() {
		System.out.println(name+" ����: "+(kor+math+eng));
	}
	
	public String getAvg() { //return ���� ������ void�� ���� ������Ÿ���� ������. ����+�����̹Ƿ� ������ String�� ������.
		return (name+" ���: "+(kor+math+eng)/3); //return�� ����� ������� StudentMain���� ������ �� ����.
	}
}
