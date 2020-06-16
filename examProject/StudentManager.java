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

//�޴�����, �л����� �Է�, �Է��� �л� ��ü ��� ����, �л� �̸����� ã��, ���Ϸ� �����ϱ� �޼ҵ�
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
		System.out.println("�����ϼ���");
		System.out.println("1.�������Է�");
		System.out.println("2.��ü����");
		System.out.println("3.�л�ã��");
		System.out.println("4.����");
		System.out.println("����>>");
	}
	
	public void inputData() {
		while(true) {
			System.out.println("�л� �̸�,�а�,�й�,������� �Է��ϼ���.(�Է��� , �� �����ϰ� ����� x)");
			System.out.println(">>");
		try {
			String text=StudentManager.sc.nextLine();
			if(text.toLowerCase().equals("x")) {
				System.out.println("�Է� ����");
				break;
			}
			StringTokenizer stk=new StringTokenizer(text,",");
			String name=stk.nextToken();
			String dept=stk.nextToken();
			int studentID=Integer.parseInt(stk.nextToken());
			double avg=Double.parseDouble(stk.nextToken());
			arr.add(new Student(name, dept, studentID, avg));
		}catch (NoSuchElementException n) {
			System.out.println("��Ȯ�ϰ� �Է��ϼ���.");
			return;
			}
		}
	}
	
	public void viewData() {
		System.out.println("��ü����");
		for(Student student:arr) {
			System.out.println("�̸�: "+student.getName());
			System.out.println("�а�: "+student.getDept());
			System.out.println("�й�: "+student.getStudentID());
			System.out.println("�������: "+student.getAvg());
			System.out.println();
		}
	}
	
	public void searchData() {
		System.out.println("�л� ã��....");
		System.out.println("ã�� �л� �̸�>>");
		String searchName=StudentManager.sc.next();
		Student s=search(searchName);
		if(s==null) {
			System.out.println("ã�� �л� ����");
			return;
		}
		System.out.println("�̸�: "+s.getName());
		System.out.println("�а�: "+s.getDept());
		System.out.println("�й�: "+s.getStudentID());
		System.out.println("�������: "+s.getAvg());
	}
	
	private Student search(String searchName) {
		for(int i=0;i<arr.size();i++) {
			if(searchName.equals(arr.get(i).getName())) { //arraylist�� get���� ����, ũ��� size
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
					 System.out.println("���α׷� ����");
					 System.exit(0);
			default : System.out.println("�Է¿���");
			}
		}
	}
}