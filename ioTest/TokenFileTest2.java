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
			/*10:20�� 10 20���� ����ϱ�
			 *������ �о���� �� �ִ� Scanner�� �̿��ϱ�
			 *���ڿ� split �Լ��� �̿��Ͽ� ':'�� ����
			 */
		    //���������� �ʱⰪ�� ������ �ȵȴ�.
			Scanner sfis=null; 
			//���ڸ� ���������� PrintStream�� ���� ����.
			PrintStream ps=null;
			try {
				//new File�� �Ⱦ��� ������ �ƴ϶� ���ڿ��� �ν��Ѵ�.
				sfis = new Scanner(new File("src\\ioTest\\input.txt")); 
				ps = new PrintStream("src\\ioTest\\hex.txt");
				while(sfis.hasNext()) { //�� ��ü�� �ִ� ���� �����ٴ� ��. hasNext()
					String str = sfis.nextLine();
					String[]tmp=str.split(":");
					for(int i=0;i<tmp.length;i++) {
						System.out.print(tmp[i]+"\t"); 
						/*16������ ���
						 *String �迭�� �ٷ� 16������ �ٲ� �� ����.
						 *parseInt�� ���� ��ȯ�� �� ������ ������ �����ϰ�
						 *�� ������ ������ 16������ ����ϱ� 
						 */
						int v=Integer.parseInt(tmp[i]);
						System.out.print(Integer.toHexString(v).toUpperCase()+"\t");
						//write���� int�� byte�� �迭�� �Ҵ��� �� �ִ�. ���ڸ� ������ �� ����.
						ps.print(Integer.toHexString(v).toUpperCase()+"\t");
					}
					//if(i==-1) break; hasNext()������ ������ false�� �Ѿ�ϱ� ������ �������
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