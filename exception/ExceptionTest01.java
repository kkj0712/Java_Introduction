package exception;
//����: ������ ����, ���� ����
//����: ���α׷��� ������ �� �ִ� ����
public class ExceptionTest01 {

	public static void main(String[] args) {
		int[]arr=new int[5];
		String str="";
		//������ �� ���� �ڵ带 try�ȿ� �ְ�
		//catch�ȿ� � �������� �����ؼ� ������ �Բ� ����
		//���� ���� ������ �ؿ� ����.
		try {
			System.out.println(str.length());
			for(int i=0;i<5;i++) {
				arr[i]=i;
				System.out.println(arr[i]);
			}

		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���ܹ߻�");
		}catch (NullPointerException n) {
			System.out.println("null ��");
		}finally {
			//try�� ����ǵ� catch�� ����ǵ� �ݵ�� ����Ǿ�� �ϴ� ������ finally�ȿ�.
			System.out.println("�ݵ�� ����Ǵ� ����");
		}
		
	}
}
