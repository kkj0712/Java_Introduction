package ioTest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TokenFileTest {
	public static void main(String[] args) {
		try {
			//������ �о���̴� ��ü fis�� ����. ��θ� ��Ȯ�ϰ� ���ֱ�
			FileInputStream fis=new FileInputStream("src\\ioTest\\input.txt");
			//���Ϸ� �������� ��ü fos�� ����. ���� ��ο� txt������ ���������.
			FileOutputStream fos=new FileOutputStream("src\\iotest\\out.txt");
			while(true) {
				int i = fis.read();
				if(i==-1) break;
				//System.out.print((char)i);
				//�о���� ������ �������� write.
				fos.write(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}