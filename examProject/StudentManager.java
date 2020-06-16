package com.exam01;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

//메뉴선택, 학생정보 입력, 입력한 학생 전체 목록 보기, 학생 이름으로 찾기, 파일로 저장하기 메소드
public class StudentManager {
	static Scanner sc=new Scanner(System.in);
	static ArrayList<Student>arr=new ArrayList<Student>();
	File dir,file;
	
	public StudentManager() throws IOException, ClassNotFoundException {
		dir=new File("src\\com\\exam01");
		file=new File(dir, "Student.txt");
		if(file.exists()) {
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
			arr=(ArrayList<Student>)ois.readObject();
		}else {
			file.createNewFile();
		}
	}
	
	public static void showMenu() {
		System.out.println("선택하세요");
		System.out.println("1.데이터입력");
		System.out.println("2.전체보기");
		System.out.println("3.학생찾기");
		System.out.println("4.종료");
		System.out.println("선택>>");
	}
	
	public void inputData() {
		while(true) {
			System.out.println("학생 이름,학과,학번,학점평균 입력하세요.(입력은 , 로 구분하고 종료는 x)");
			System.out.println(">>");
		try {
			String text=StudentManager.sc.nextLine();
			if(text.toLowerCase().equals("x")) {
				System.out.println("입력 종료");
				break;
			}
			StringTokenizer stk=new StringTokenizer(text,",");
			String name=stk.nextToken();
			String dept=stk.nextToken();
			int studentID=Integer.parseInt(stk.nextToken());
			double avg=Double.parseDouble(stk.nextToken());
			arr.add(new Student(name, dept, studentID, avg));
		}catch (NoSuchElementException n) {
			System.out.println("정확하게 입력하세요.");
			return;
			}
		}
	}
	
	public void viewData() {
		System.out.println("전체보기");
		for(Student student:arr) {
			System.out.println("이름: "+student.getName());
			System.out.println("학과: "+student.getDept());
			System.out.println("학번: "+student.getStudentID());
			System.out.println("학점평균: "+student.getAvg());
			System.out.println();
		}
	}
	
	public void searchData() {
		System.out.println("학생 찾기....");
		System.out.println("찾을 학생 이름>>");
		String searchName=StudentManager.sc.next();
		Student s=search(searchName);
		if(s==null) {
			System.out.println("찾는 학생 없음");
			return;
		}
		System.out.println("이름: "+s.getName());
		System.out.println("학과: "+s.getDept());
		System.out.println("학번: "+s.getStudentID());
		System.out.println("학점평균: "+s.getAvg());
	}
	
	private Student search(String searchName) {
		for(int i=0;i<arr.size();i++) {
			if(searchName.equals(arr.get(i).getName())) { //arraylist는 get으로 접근, 크기는 size
				return arr.get(i);
			}
		}
		return null;
	}
	
	public void saveData() throws FileNotFoundException, ClassNotFoundException, EOFException, IOException  {
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(arr);
	}
	
	public static void main(String[] args) throws InputMismatchException, FileNotFoundException, ClassNotFoundException, IOException{
		StudentManager sm=new StudentManager();
		while(true) {
			StudentManager.showMenu();
			int num=sc.nextInt();
			sc.nextLine();
			switch(num) {
			case 1 : sm.inputData(); break;
			case 2 : sm.viewData(); break;
			case 3 : sm.searchData(); break;
			case 4 : sm.saveData(); 
					 System.out.println("프로그램 종료");
					 System.exit(0);
			default : System.out.println("입력오류");
			}
		}
	}
}