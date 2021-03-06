package ioTest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


import utilTest.CapitalApp;

public class CapitalApp2 {
	private HashMap<String, String>map=new HashMap<String, String>();
	File dir,file;
	public CapitalApp2(){
		dir=new File("src\\ioTest");
		file=new File(dir,"myCapital.txt");
		map.clear();
		try {
		if(!file.exists()) { //파일 없음
			file.createNewFile(); //파일생성
			return;
		 }
   		 //파일로부터 읽어오기 위해 만드는 스캐너
		 Scanner scanner=new Scanner(file);
		 while(scanner.hasNext()) {
			 String country=scanner.next(); //나라
			 String capital=scanner.next(); //수도
			 map.put(country, capital);
		 }
		 scanner.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void input() {
		System.out.println("현재"+map.size()+" 개 나라와 수도 입력");
		while(true) {
			System.out.println("나라와 수도 입력(종료는 x)>>");
			String cont=CapitalApp.sc.next(); //나라
			if(cont.toUpperCase().equals("X")) break;
			if(map.containsKey(cont)==true) {
				System.out.println("이미 입력한 나라입니다.");
				continue;
			}
			String cap=CapitalApp.sc.next();
			map.put(cont,cap);
		}
	}
	
	private void quiz() {
		//Set: 중복을 허용하지 않는 자료구조
		Set<String> set=map.keySet();
		Object[]arr=set.toArray(); //toArray()를 이용하여 set을 배열형태로 변환
		while(true) {
			int n=(int)(Math.random()*map.size());
			//if(map.size()==0) return;
			//if(map.isEmpty()) return;
			//아무런 값도 입력하지 않은 상태에서 퀴즈풀기를 시도하면 오류가 뜬다.
			//try-catch문에 예외처리를 적어준다.
			String city="";
			try {
				city=(String)arr[n];
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("map 이 비어 있습니다.");
				return;
			}
			String dosi=map.get(city);
			
			System.out.println(city+" 의 수도는? 종료는 x>>");
			String dap=CapitalApp.sc.next();
			if(dap.toLowerCase().equals("x")) {
				System.out.println("종료합니다.");
				break;
			}
			if(dap.equals(dosi)) {
				System.out.println("정답입니다.");
			}
			else {
				System.out.println("틀렸습니다.");
			}
		}
	}
	//해쉬맵을 파일에 저장하고 종료하는 메소드
	private void save() {
		FileWriter fw=null;
		try {
			fw=new FileWriter(file);
			Set<String> set=map.keySet(); //나라만 가져옴
			Iterator<String> it=set.iterator(); //나라를 방문하기 위해
			while(it.hasNext()) {
				String key=it.next(); //나라 가져옴
				String value=map.get(key); //수도를 가져옴
				fw.write(key+" "); //나라 출력
				fw.write(value+"\n"); //수도 출력
			}
			fw.close();
			System.out.println("종료");
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일저장 오류");
		}
	}
	
	public static void main(String[] args) {
		CapitalApp2 ca2=new CapitalApp2();
		while(true) {
			CapitalApp.showMenu();
			int choice=CapitalApp.sc.nextInt();
			switch(choice) {
			case 1 : ca2.input(); break;
			case 2 : ca2.quiz(); break;
			case 3 : ca2.save(); break;
			default: System.out.println("입력오류");
			}
		}
	}
}