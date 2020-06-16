package interfaceTest;

public class ConverterMain {

	public static void main(String[] args) {
		//원화를 달러로
		Won2Dollar toDollar=new Won2Dollar(1200);
		toDollar.run();
		//km를 마일로
		Km2Mile toMile=new Km2Mile(1.6);
		toMile.run();
	}
}