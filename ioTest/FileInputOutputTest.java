package ioTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
//파일을 읽어서 라인 앞에 번호를 붙여 출력하기 
import java.util.Scanner;
public class FileInputOutputTest {
	public static void main(String[] args) {
		Scanner sfis=null; 
		PrintStream ps=null;
		try {
			sfis = new Scanner(new File("src\\ioTest\\input.txt")); 
			ps = new PrintStream("src\\ioTest\\copy2.txt");
			int cnt=1;
			while(sfis.hasNext()) {
				String str = sfis.nextLine();
				ps.println(cnt+" "+str);		
				cnt++;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
