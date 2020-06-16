package interfaceTest;
interface InterTest{
	public void test();
}

//���δ� �߻��̶�� �߻�Ŭ������ �Ⱥ��̰� interface�� ���δ�.
interface InterShape{
	public void draw();
	public void move();
	public void print();
}
//interface�� extends�� �ƴ� implements�� ���.
class InterCircle implements InterShape, InterTest{
	//���� Ŭ������ ���� �߻� Ŭ������ �޼ҵ带 �θ����� ����(�߰�ȣ {})�ؾ���.��.
	//InterTest�� ��ӹ޾ұ� ������ test(){}�� ����.
	public void draw() {}
	public void move() {}
	public void print() {}
	public void test() {}
}

class Inter {
	public void interTest() {
	}
}

//�ڹٴ� ���� ����� �ȵǰԲ� �Ǿ��ִµ� ���� ����� �޾ƾ��Ҷ��� �̷��� ǥ��.
//����� �ް� interface�� ����.
class InterRectangle extends Inter implements InterShape,
InterTest{
	public void draw() {}
	public void move() {}
	public void print() {}
	public void test() {}
}

public class InterExam {

}