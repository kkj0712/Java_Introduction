package ioTest;

import java.io.IOException;

public class InputTest {

	public static void main(String[] args) {
		while(true) {
			try {
				int i=System.in.read(); //System.in=input Stream.
				if(i==-1) break;
				System.out.print((char)i);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
