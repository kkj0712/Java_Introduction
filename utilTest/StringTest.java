package utilTest;

public class StringTest {

	public static void main(String[] args) {
		//String�� Ŭ������. �⺻���������� �ƴ�. Ŭ������ �빮�ڷ� ����.
		//Ŭ�������� new �� ��ü�� �����. �׷��� ���ݱ��� String i=oo; �̷������� �����߾���.
		//��� �����ߴ� �ɱ�? 
		//Ŭ������ �ּҰ��� �����ϱ� str���� 100�̶� �ּҰ��� ������ �ְ� ����Ҷ� 100�� ����Ű�� �ȳ��̶�� ���� ����ϴ°�.
		//==�� �ּҰ� �´��� �����. �׷��� str�� str1�� �ּҰ� ���⿡ ���ٰ� ��µǰ�
		//equals�� ������ �´��� �����. �׷��� str�� tmp�� ������ ���⿡ ���ٰ� ��µȴ�.
		String str="�ȳ�";
		String str1="�ȳ�";
		String tmp=new String("�ȳ�");
		if(str==str1) {
			System.out.println("str==str1 �ּ� ����");
		}else {
			System.out.println("str==str1 �ּ� �ٸ���");			
		}
		if(str==tmp) {
			System.out.println("str==tmp �ּ� ����");
		}else {
			System.out.println("str==tmp �ּ� �ٸ���");			
		}
		if(str.equals(str1)) {
			System.out.println("str equals str1 ���� ����");
		}else {
			System.out.println("str equals str1 ���� �ٸ���");			
		}
		if(str.equals(tmp)) {
			System.out.println("str equals tmp ���� ����");
		}else {
			System.out.println("str equals tmp ���� �ٸ���");			
		}
		str=str+str1; 
		//�ȳ�ȳ��� str�� ����. �����ִ� str�� �ȳ��� �������, �ּҰ��� �޶�����.
		//String�� ���� Ŭ����. ���� ������ �Ұ��ϴ�. 
		//����Ŭ������ ����ϴ°� ����. String Builder Ȥ�� String Buffer.
		if(str==str1) {
			System.out.println("�ּ� ����");
		}else {
			System.out.println("�ּ� �ٸ���");
		}
	}
}