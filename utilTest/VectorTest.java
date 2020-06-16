package utilTest;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		//Vector에는 동기화가 구현.
		Vector<Integer> v=new Vector<Integer>();
		v.add(5);
		v.add(new Integer(5)); //정확한 표현은 이렇게 클래스화를 하기..
		//Vector나 Arraylist는 중복이 됨. 순서에 중점.
		v.add(-1);
		v.add(2,100); //2는 위치값. 위치값을 안넣게 되면 맨끝에 붙음.
		for(Integer i:v) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		//iterator라는 메소드를 이용하여 객체를 이동시킬 수 있다. (for문 같은 것)
		//hasNext()는 그 다음에 이동할 공간이 있는지 물어봄. 나중에 false가 되면 자동으로 빠져나옴.
		Iterator<Integer> it=v.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"\t");
		}
		System.out.println();
		
	}
}
