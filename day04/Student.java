package day04;

public class Student { //클래스를 선언. 속성과 행위를 표현할 수 있고, 속성은 멤버변수, 행위는 메소드.
	int StudentID; //학번
	String name; //이름
	int grade; //학년
	String address; //주소
	
	//공부하다 라는 행위를 표현하고 싶다. 그 행위를 프로그램에서는 함수라고 함. 객체지향의 함수는 메소드.
	public void study() { //함수는 반드시 괄호가 있음
		System.out.println(name+"공부하다");
	}
	
	public void play() {
		System.out.println(name+"운동하다");
	}
	
	
	public static void main(String[] args) { //실행은 항상 main함수 부터
		Student s1=new Student(); //Student 클래스 안에 s1이라는 객체 생성
		s1.StudentID=100; //누구의 학번인지 표현해야하므로 점(.)을 찍는게 중요.
		s1.name="홍길동";
		s1.grade=1;
		s1.address="부산";
		System.out.println("s1의 이름: "+s1.name);
		
		Student s2=new Student();
		s2.StudentID=200;
		s2.name="이순신";
		s2.grade=4;
		s2.address="서울";
		System.out.println("s2의 이름: "+s2.name);
		
		System.out.println(s1.name+"의 주소: "+s1.address);
		
		//이름이 강감찬이고 3학년, 인천에 사는 학생 s3을
		//생성하고 s3의 이름과 주소를 출력하시오.
		
		Student s3=new Student();
		s3.name="강감찬";
		s3.grade=3;
		s3.address="인천";
		System.out.println("s3 이름: "+s3.name);
		System.out.println("s3 주소: "+s3.address);
		
		//홍길동이 공부하다
		s1.study();
		//강감찬이 공부하다
		s3.study();
		
		//학생이라는 클래스를 만들때 학번, 이름, 학년, 주소를 만들었고
		//공부하다라는 행위까지 표현.
		
		//학생이라는 클래스를 수정하는데 play()함수를 가지고 있고..
		//여기에서 이름 운동한다라는 값을 출력하시오
		s1.play();
		
		
		 
	}

}
