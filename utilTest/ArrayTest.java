package utilTest;

import java.util.ArrayList;

public class ArrayTest {

	public static void main(String[] args) {
		ArrayList arr=new ArrayList(); //ArrayList엔 객체가 들어간다. 메소드로 접근
		arr.add(1); //ArrayList에 추가하는 명령어는 add
		arr.add("안녕");
		arr.add(3.2); //Double이라는 클래스가 들어감. Wrapper 클래스로 변환되었기 때문에 추가가되는 것.
		System.out.println("마지막: " +arr.get(arr.size()-1)); //인덱스에 접근하는 메소드는 get()
		System.out.println(arr.size()); //length가 아니라 size를 사용
		arr.add(new Integer(3)); //add는 맨 끝에 붙임.
		System.out.println("크기: "+arr.size());
		System.out.println("마지막: " +arr.get(arr.size()-1));
		arr.remove(1); //안녕이 지워짐.
		arr.remove("안녕"); //안녕이 지워져있기 때문에 또 지울 수 없음.
		System.out.println("크기: "+arr.size());
		arr.add(1,"지금 자바"); 
		System.out.println("크기: "+arr.size());
		//ArrayList의 list엔 String형만 넣겠다. 제네릭 표시. 특정 개체로 유형을 정함.
		//클래스에 객체 오브젝이 들어감. int는 기본 자료형이기 때문에 정수만 받고 싶다면 Integer라고 적어야함.
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		ArrayList<String>alist=new ArrayList<String>();
		alist.add("자바");
		alist.add("Java");
		for(int i=0;i<alist.size();i++) {
			System.out.println(alist.get(i));
		}
		for(String s:alist) {
			System.out.print(s+"\t");
		}
		System.out.println();
		for(int i:list) { //컴파일러가 알아서 wrapper해줘서 int를 사용할 수 있다.
			System.out.print(i+"\t");
		}
	}
}