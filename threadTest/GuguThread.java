package threadTest;

public class GuguThread extends Thread{
	//Thread는 jvm이 실행. start라고 메소드 이름을 붙이면
	//jvm이 알아서 run()을 실행.
	private int dan;
	
	public GuguThread(int dan) {
		this.dan=dan;
	}
	
	public void run() {
		int gugudan;
		System.out.println(dan+"단");
		for(int i=1;i<10;i++) {
			gugudan=dan*i;
			System.out.println(dan+"*"+i+": "+gugudan);
		}
	}
	
	public static void main(String[] args) {
		GuguThread g1=new GuguThread(5);
		g1.start();
		GuguThread g2=new GuguThread(7);
		g2.start();
		GuguThread g3=new GuguThread(3);
		g3.start();
	}
}
