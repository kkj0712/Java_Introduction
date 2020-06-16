package ioTest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TokenFileTest {
	public static void main(String[] args) {
		try {
			//파일을 읽어들이는 객체 fis를 선언. 경로를 정확하게 써주기
			FileInputStream fis=new FileInputStream("src\\ioTest\\input.txt");
			//파일로 내보내는 객체 fos를 선언. 다음 경로에 txt파일이 만들어진다.
			FileOutputStream fos=new FileOutputStream("src\\iotest\\out.txt");
			while(true) {
				int i = fis.read();
				if(i==-1) break;
				//System.out.print((char)i);
				//읽어들인 파일을 내보낼때 write.
				fos.write(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}