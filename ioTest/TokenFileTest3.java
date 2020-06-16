package ioTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenFileTest3 {
	//input.txt파일을 읽어서
	//8진수로 변환하여 octal.txt파일로 출력하시오
	//단, StringTokenizer를 사용하기
	public static void main(String[] args) {
		Scanner sc=null;
		PrintStream pst=null;
		try {
			sc=new Scanner(new File("src\\ioTest\\input.txt"));
			pst=new PrintStream("src\\ioTest\\octal.txt");
			while(sc.hasNext()) {
				String str = sc.nextLine();
				StringTokenizer st=new StringTokenizer(str,":");
				while(st.hasMoreTokens()) { //Token이 있는 동안 
					String tok=st.nextToken(); //Token하나를 가져와서 문자열 tok에 선언
					int v=Integer.parseInt(tok);
					System.out.print(Integer.toOctalString(v)+"\t");
					pst.print(Integer.toOctalString(v)+"\t");
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			sc.close();
			pst.close();
		}
	}
}