package ioTest;

import java.util.Scanner;

public class InputTest01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		while(sc.hasNext()) {//있는 동안
			String str=sc.next();
			System.out.println(str);
		}
	}
}