package utilTest;

public class StringBuilderTest {

	public static void main(String[] args) {
		String str="string";
		//StringBuilder�� ���ڸ� �������� �ޱ⶧���� ���, ���� ���� ����
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb);
		sb.append("�ڹ�"); //�� �ڿ� ���� ����
		System.out.println(sb);
		sb.insert(2, "oracle"); //��ġ�� �����Ͽ� ���� ����
		System.out.println(sb); //storaclering�ڹ�
		System.out.println(sb.toString()); //toString�� ���ڷ� �ٲ۴�.
		sb.delete(2, 5);
		System.out.println(sb); //�ε��� 2�տ� Ŀ���� �ִٰ� ����. o,r,a�� ������. stclering�ڹ�
		sb.reverse();
		System.out.println(sb); //���ڿ� �Ųٷ� ���
		System.out.println(sb.charAt(3)); //3��° �ִ� ���� ���
		System.out.println(sb.substring(3)); //���� ����: �ε��� 3��°���� ������ ���
		System.out.println(sb.substring(3,5)); //3���� ���� 5������ ���. 
	}
}
