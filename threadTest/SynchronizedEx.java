package threadTest;
class SharedBoard{
	private int sum=0;
	//값이 하나 들어가 있을때 다른 값은 기다리도록.
	synchronized public void add() {
		int n=sum;
		n+=10;
		sum=n; //10씩 계속 증가
		System.out.println(Thread.currentThread().getName()+":"+sum);
	}
	public int getSum() {
		return sum;
	}
}

class StudentThread extends Thread{
	private SharedBoard board;
	public StudentThread(String name, SharedBoard board) {
		super(name);
		this.board=board;
	}
	//Thread를 상속받았으니 run()이 필요
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			board.add();
		}
	}
}

public class SynchronizedEx {
	public static void main(String[] args) {
		SharedBoard board=new SharedBoard();
		Thread th1=new StudentThread("이순신", board);
		Thread th2=new StudentThread("홍길동", board);
		th1.start();
		th2.start();
	}
}
