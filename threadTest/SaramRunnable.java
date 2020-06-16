package threadTest;
//자바에서 상속은 단일만 가능. Thread 이외에도 따로 상속받을 게 또 있다면?
//runnable이라는 인터페이스를 implements로 상속받으면 됨.
//인터페이스는 추상으로만 이루어져있기 때문에 반드시 추상메소드를 구현해야한다.
public class SaramRunnable implements Runnable{
	private String name;
	
	public SaramRunnable(String name) {
		this.name=name;
	}

	public static void main(String[] args) {
		SaramRunnable sr1=new SaramRunnable("홍길동");
		SaramRunnable sr2=new SaramRunnable("이순신");
		SaramRunnable sr3=new SaramRunnable("강감찬");
		Thread th1=new Thread(sr1);
		Thread th2=new Thread(sr2);
		Thread th3=new Thread(sr3);
		//Thread가 start를 부르기
		th1.start();
		th2.start();
		th3.start();
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(name+" 이 말한다.");
			try{
				Thread.sleep(1000); //1000ms->1초 동안 쉬어달라는 표시.
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}