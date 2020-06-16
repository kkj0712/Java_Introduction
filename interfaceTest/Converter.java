package interfaceTest;

import java.util.Scanner;
//추상인 메소드, 추상아닌 메소드가 섞여 있으므로 추상 클래스로 만든다. (모두 추상이면 interface)
public abstract class Converter {
	abstract protected double convert(double src);
	abstract String srcString();
	abstract String destString();
	protected double ratio;
		
	Scanner scanner=new Scanner(System.in);
	public void run() { //교환
		//srcString, destString은 돈이 들어갈 수도, 길이 단위가 들어갈 수도 있다.
		//따라서 현재 Convert 클래스로는 정의하지 못하고
		//하위 클래스들이 정의를 해야하므로 추상메소드로 바꾸고 따라서 클래스도 추상으로 바꿔야한다.
		System.out.println(srcString()+"을 "+destString()+"로 바꿉니다.");
		System.out.print(srcString()+"을 입력하세요>>");
		double val=scanner.nextDouble();
		double res=convert(val); //스캐너가 입력한 값을 인수로 받는다.
		System.out.println("변환 결과: "+res+destString()+"입니다.");
	}
}