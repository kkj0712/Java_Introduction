package utilTest;

public class StringTest03 {

	public static void main(String[] args) {
		String tmp="1 0 15 23 6 21 17 10 11 12 13 14";
		//tmp�� ���̸� ���. ���ڿ��� ����.
		System.out.println("tmp�� ����: "+tmp.length());
		
		//tmp�� �������� �����Ͽ� �迭�� ���� ���
		String []arr=tmp.split(" ");
		System.out.println("arr�� ����: "+arr.length);

		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"\t");
		}System.out.println("====");
		
		//16����
		//Integer��� Ŭ������ toHexString�� ���� 16������ �ٲ��ش�.
		System.out.println(Integer.toHexString(15));
		
		/*
		arr�迭�ȿ� �ִ� ���ڸ� 16������ ����
		���ڸ� ���ڷ� �ٲٴ� �޼ҵ� parseInt�� ����ؾ�
		������ �μ��� �޴� toHexString�� ���� 16������ ��ȯ��ų �� �ִ�.
		*/
		String oct="";
		String hex="";
		for(int i=0;i<arr.length;i++) {
			int v=Integer.parseInt(arr[i]);
			oct+=Integer.toOctalString(v)+"\t";
			hex+=Integer.toHexString(v).toUpperCase()+"\t";
		}
		System.out.println("8����: "+oct);
		System.out.println("16����: "+hex);
		
	}
}