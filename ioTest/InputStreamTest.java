package ioTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamTest {

	public static void main(String[] args) {
		try {
			//���Ϸ� �������� ��ü fs�� ����.
			FileOutputStream fs=new FileOutputStream("text.txt"); //refresh�ϸ� text.txt������ ����
			while(true) {
				int i = System.in.read(); //Ű����κ��� ���� �޴´�.
				if(i==-1) break;
				fs.write(i); //�ַܼ� �Է¹��� ���� �������� �Լ�
			} 
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}