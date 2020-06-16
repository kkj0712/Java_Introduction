package ioTest;

import java.io.File;

public class FileExam {

	public static void main(String[] args) {
		File f1=new File("c:\\windows\\system.ini");
		//getPath()는 경로, getParent()는 부모 경로, getName()은 파일의 이름
		System.out.println(f1.getPath()+"="+f1.getParent()+"="+f1.getName());
		String res="";
		if(f1.isFile()) res="파일";
		else if(f1.isDirectory()) res="디렉토리";
		System.out.println(f1.getPath()+"은 "+res+" 입니다.");
		
		File f2=new File("folder");
		if(f2.isFile()) res="파일";
		else if(f2.isDirectory()) res="디렉토리";
		System.out.println(f2.getPath()+"은 "+res+" 입니다.");
		
		if(!f2.exists()) {
			System.out.println("파일없음");
		}
		System.out.println("----서브 리스트----");
		File[]subFiles=f2.listFiles(); //파일을 배열형태로 알려준다.
		for(int i=0;i<subFiles.length;i++) {
			File f=subFiles[i];
			long t=f.lastModified(); //마지막에 수정한 날짜를 long형태로 알려준다.
			//long형태가 아닌 알아보기 쉬운 날짜 형태로 바꾸기 위해 printf로 출력하는 형태를 지정
			System.out.println(f.getName());
			System.out.println("파일 크기: "+f.length());
			System.out.printf("수정한 시간: %ty년  %tb %td %ta %tT\n", t,t,t,t,t);
			//20년 6월 09 화 15:00:50 
		}
	}
}