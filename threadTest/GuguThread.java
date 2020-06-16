package threadTest;

public class GuguThread extends Thread{
	//Thread�� jvm�� ����. start��� �޼ҵ� �̸��� ���̸�
	//jvm�� �˾Ƽ� run()�� ����.
	private int dan;
	
	public GuguThread(int dan) {
		this.dan=dan;
	}
	
	public void run() {
		int gugudan;
		System.out.println(dan+"��");
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
