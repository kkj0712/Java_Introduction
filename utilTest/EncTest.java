package utilTest;

public class EncTest {
	public String encrypt(String msg) {
		String dap="";
		for(int i=0;i<msg.length();i++) {
			//공백이면. 한글자이기 때문에 char.''홑따옴표
			if(msg.charAt(i)==' ') { 
				dap+=msg.charAt(i);
			}else {
				dap+=(char)(msg.charAt(i)+2); //누적시키기위해 +=.	
			}
		}
		return dap;
	}
	
	public String decrypt(String str1) {
		String bok="";
		for(int i=0;i<str1.length();i++) {
			//공백이면. 한글자이기 때문에 char.''홑따옴표
			if(str1.charAt(i)==' ') { 
				bok+=str1.charAt(i);
			}else {
				bok+=(char)(str1.charAt(i)-2); //누적시키기위해 +=.	
			}
		}
		return bok;
	}
	
	public static void main(String[] args) {
		EncTest enc=new EncTest();
		String msg="Hi..Glad to meet you!!";
		System.out.println("암호화 전: "+msg); 
		//한 문자에 2씩 더하기
		String str1=enc.encrypt(msg);
		System.out.println("암호화 후: "+str1);
		System.out.println("복호화 후: "+enc.decrypt(str1));
	}
}