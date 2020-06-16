package threadTest;

public class GuguRunnable implements Runnable {
	private int dan;
	public GuguRunnable(int dan) {
		this.dan=dan;
	}
	
	public static void main(String[] args) {
		GuguRunnable g1=new GuguRunnable(5);
		Thread th1=new Thread(g1);
		th1.start();
		GuguRunnable g2=new GuguRunnable(7);
		Thread th2=new Thread(g2);
		th2.start();
		GuguRunnable g3=new GuguRunnable(3);
		Thread th3=new Thread(g3);
		th3.start();
	}

	@Override
	public void run() {
		int gugudan;
		System.out.println(dan+"´Ü");
		for(int i=1;i<10;i++) {
			gugudan=dan*i; 
			System.out.println(dan+"*"+i+": "+gugudan);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}