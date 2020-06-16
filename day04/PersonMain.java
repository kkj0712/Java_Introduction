package day04;

public class PersonMain {
	
	public static void main(String[] args) {
		Person p1=new Person(); //여기는 PersonMain클래스 이므로 Person클래스를 만들어서 Person생성자를 만들면 됨.
		p1.name="홍길동";
		p1.addr="부산";
		p1.study();
		
		Bank b=new Bank("김자바", 5000); //필요하면 언제든지 부를 수 있음. 재사용성.
		b.getMoney();
		
		Baby baby=new Baby();
		baby.name="애기";
		baby.smile(); //String의 초기값은 null. 
		
		Baby baby1=new Baby("김애기");
		baby1.cry();
		
		//구구단 10단을 출력
		Gugudan g10=new Gugudan(10);
		g10.viewData();
		
	}
}
