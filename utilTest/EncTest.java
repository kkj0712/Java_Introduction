package utilTest;

public class EncTest {
	public String encrypt(String msg) {
		String dap="";
		for(int i=0;i<msg.length();i++) {
			//�����̸�. �ѱ����̱� ������ char.''Ȭ����ǥ
			if(msg.charAt(i)==' ') { 
				dap+=msg.charAt(i);
			}else {
				dap+=(char)(msg.charAt(i)+2); //������Ű������ +=.	
			}
		}
		return dap;
	}
	
	public String decrypt(String str1) {
		String bok="";
		for(int i=0;i<str1.length();i++) {
			//�����̸�. �ѱ����̱� ������ char.''Ȭ����ǥ
			if(str1.charAt(i)==' ') { 
				bok+=str1.charAt(i);
			}else {
				bok+=(char)(str1.charAt(i)-2); //������Ű������ +=.	
			}
		}
		return bok;
	}
	
	public static void main(String[] args) {
		EncTest enc=new EncTest();
		String msg="Hi..Glad to meet you!!";
		System.out.println("��ȣȭ ��: "+msg); 
		//�� ���ڿ� 2�� ���ϱ�
		String str1=enc.encrypt(msg);
		System.out.println("��ȣȭ ��: "+str1);
		System.out.println("��ȣȭ ��: "+enc.decrypt(str1));
	}
}