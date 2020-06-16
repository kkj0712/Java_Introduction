package utilTest;

import java.util.ArrayList;

public class ArrayTest {

	public static void main(String[] args) {
		ArrayList arr=new ArrayList(); //ArrayList�� ��ü�� ����. �޼ҵ�� ����
		arr.add(1); //ArrayList�� �߰��ϴ� ��ɾ�� add
		arr.add("�ȳ�");
		arr.add(3.2); //Double�̶�� Ŭ������ ��. Wrapper Ŭ������ ��ȯ�Ǿ��� ������ �߰����Ǵ� ��.
		System.out.println("������: " +arr.get(arr.size()-1)); //�ε����� �����ϴ� �޼ҵ�� get()
		System.out.println(arr.size()); //length�� �ƴ϶� size�� ���
		arr.add(new Integer(3)); //add�� �� ���� ����.
		System.out.println("ũ��: "+arr.size());
		System.out.println("������: " +arr.get(arr.size()-1));
		arr.remove(1); //�ȳ��� ������.
		arr.remove("�ȳ�"); //�ȳ��� �������ֱ� ������ �� ���� �� ����.
		System.out.println("ũ��: "+arr.size());
		arr.add(1,"���� �ڹ�"); 
		System.out.println("ũ��: "+arr.size());
		//ArrayList�� list�� String���� �ְڴ�. ���׸� ǥ��. Ư�� ��ü�� ������ ����.
		//Ŭ������ ��ü �������� ��. int�� �⺻ �ڷ����̱� ������ ������ �ް� �ʹٸ� Integer��� �������.
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		ArrayList<String>alist=new ArrayList<String>();
		alist.add("�ڹ�");
		alist.add("Java");
		for(int i=0;i<alist.size();i++) {
			System.out.println(alist.get(i));
		}
		for(String s:alist) {
			System.out.print(s+"\t");
		}
		System.out.println();
		for(int i:list) { //�����Ϸ��� �˾Ƽ� wrapper���༭ int�� ����� �� �ִ�.
			System.out.print(i+"\t");
		}
	}
}