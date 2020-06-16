package day04;

public class Bank {
	String name; //이름 멤버변수 (전역변수)
	int money; //잔액
	
	//생성자는 항상 클래스 바로 밑에 만들기
	public Bank() {
	}
	
	public Bank(String name, int money) {
		this.name=name; //앞의 name은 4번의 name, 뒤의 name은 12번의 name.
		this.money=money;
		System.out.println(name+" 님의 잔액은 "+money+"원 입니다.");
	}
			
	//입금. 잔액에다가 입금한 만큼의 돈을 더하는 것.
	public void inputMoney(int a) { //don은 지역변수
		money+=a;
	}
	//출금
	public void outputMoney(int b) {
		if(money<b) {
			System.out.println("잔액부족");
			return; //돌려줄 값이 없는 return은 break의 의미. if else와 똑같은 말
		}
		money-=b;
	}
	//잔액확인
	public void getMoney() {
		System.out.println(name+" 님의 잔액은 "+money+"원 입니다.");
	}
	
	public static void main(String[]args) {
		Bank b1=new Bank();
		b1.name="홍길동";
		b1.inputMoney(5000);
		b1.getMoney();
		b1.outputMoney(3000);
		b1.getMoney();
		
		Bank b2=new Bank();
		b2.name="이순신";
		b2.inputMoney(10000);
		b2.getMoney();
		b2.outputMoney(20000); //잔액부족
		b2.getMoney(); //이순신님 10000원
		
		Bank b3=new Bank("강감찬",20000);
		Bank b4=new Bank("유관순",10000);
		
	}
}
