package interfaceTest;

public class Won2Dollar extends Converter {
	public Won2Dollar(int don) {
		super.ratio=don;
	}
	@Override
	protected double convert(double src) {
		//src/don이라고 하면 don이 뭔지 모르니까 부모클래스에 ratio를 주고 그걸 나누는 것
		return src/ratio; 
	}
	@Override
	String srcString() {
		return "원";
	}
	@Override
	String destString() {
		return "달러";
	}
}