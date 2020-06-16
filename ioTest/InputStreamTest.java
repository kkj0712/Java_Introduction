package ioTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamTest {

	public static void main(String[] args) {
		try {
			//파일로 내보내는 객체 fs를 만듦.
			FileOutputStream fs=new FileOutputStream("text.txt"); //refresh하면 text.txt파일이 생김
			while(true) {
				int i = System.in.read(); //키보드로부터 값을 받는다.
				if(i==-1) break;
				fs.write(i); //콘솔로 입력받은 값을 내보내는 함수
			} 
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}