package interfaceTest;

public class ConverterMain {

	public static void main(String[] args) {
		//��ȭ�� �޷���
		Won2Dollar toDollar=new Won2Dollar(1200);
		toDollar.run();
		//km�� ���Ϸ�
		Km2Mile toMile=new Km2Mile(1.6);
		toMile.run();
	}
}