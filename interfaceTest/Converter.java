package interfaceTest;

import java.util.Scanner;
//�߻��� �޼ҵ�, �߻�ƴ� �޼ҵ尡 ���� �����Ƿ� �߻� Ŭ������ �����. (��� �߻��̸� interface)
public abstract class Converter {
	abstract protected double convert(double src);
	abstract String srcString();
	abstract String destString();
	protected double ratio;
		
	Scanner scanner=new Scanner(System.in);
	public void run() { //��ȯ
		//srcString, destString�� ���� �� ����, ���� ������ �� ���� �ִ�.
		//���� ���� Convert Ŭ�����δ� �������� ���ϰ�
		//���� Ŭ�������� ���Ǹ� �ؾ��ϹǷ� �߻�޼ҵ�� �ٲٰ� ���� Ŭ������ �߻����� �ٲ���Ѵ�.
		System.out.println(srcString()+"�� "+destString()+"�� �ٲߴϴ�.");
		System.out.print(srcString()+"�� �Է��ϼ���>>");
		double val=scanner.nextDouble();
		double res=convert(val); //��ĳ�ʰ� �Է��� ���� �μ��� �޴´�.
		System.out.println("��ȯ ���: "+res+destString()+"�Դϴ�.");
	}
}