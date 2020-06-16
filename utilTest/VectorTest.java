package utilTest;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		//Vector���� ����ȭ�� ����.
		Vector<Integer> v=new Vector<Integer>();
		v.add(5);
		v.add(new Integer(5)); //��Ȯ�� ǥ���� �̷��� Ŭ����ȭ�� �ϱ�..
		//Vector�� Arraylist�� �ߺ��� ��. ������ ����.
		v.add(-1);
		v.add(2,100); //2�� ��ġ��. ��ġ���� �ȳְ� �Ǹ� �ǳ��� ����.
		for(Integer i:v) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		//iterator��� �޼ҵ带 �̿��Ͽ� ��ü�� �̵���ų �� �ִ�. (for�� ���� ��)
		//hasNext()�� �� ������ �̵��� ������ �ִ��� ���. ���߿� false�� �Ǹ� �ڵ����� ��������.
		Iterator<Integer> it=v.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"\t");
		}
		System.out.println();
		
	}
}
