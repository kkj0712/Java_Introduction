package ioTest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TokenFileTest2 {
	public static void main(String[] args) {
			/*10:20을 10 20으로 출력하기
			 *한줄을 읽어들일 수 있는 Scanner를 이용하기
			 *문자열 split 함수를 이용하여 ':'을 제거
			 */
		    //지역변수는 초기값이 없으면 안된다.
			Scanner sfis=null; 
			//문자를 내보낼때는 PrintStream을 많이 쓴다.
			PrintStream ps=null;
			try {
				//new File을 안쓰면 파일이 아니라 문자열로 인식한다.
				sfis = new Scanner(new File("src\\ioTest\\input.txt")); 
				ps = new PrintStream("src\\ioTest\\hex.txt");
				while(sfis.hasNext()) { //이 객체가 있는 동안 돌린다는 뜻. hasNext()
					String str = sfis.nextLine();
					String[]tmp=str.split(":");
					for(int i=0;i<tmp.length;i++) {
						System.out.print(tmp[i]+"\t"); 
						/*16진수로 출력
						 *String 배열은 바로 16진수로 바꿀 수 없다.
						 *parseInt로 먼저 변환한 뒤 정수형 변수에 선언하고
						 *그 정수형 변수를 16진수로 출력하기 
						 */
						int v=Integer.parseInt(tmp[i]);
						System.out.print(Integer.toHexString(v).toUpperCase()+"\t");
						//write에는 int나 byte의 배열만 할당할 수 있다. 문자를 내보낼 수 없다.
						ps.print(Integer.toHexString(v).toUpperCase()+"\t");
					}
					//if(i==-1) break; hasNext()에서는 없으면 false로 넘어가니까 지워도 상관없음
					//System.out.print(str+"\t");
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} finally {
				sfis.close();
				ps.close();
			}
		} 
}