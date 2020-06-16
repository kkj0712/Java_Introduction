package day06_objectArray.arraylist;

//import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	Subject []subjectList; 
	int index;
	//ArrayList<Subject>subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID=studentID;
		this.studentName=studentName;
		subjectList=new Subject[10];
		//subjectList=new ArrayList<Subject>();
	}
	//�迭�� ����ؼ� ����� �� �ִ°� ArrayList.
	//�л��� ���� ������ ��µ� �װ� ���� ���� ���� Ŭ������ ���� �з�
	//�װ� �迭�� ����.
	//�迭�� ó���� ������ ���������. ��ſ� ArrayList�� �߰��Ѹ�ŭ ũ�Ⱑ ��ȭ��
	//ArrayList�� �Լ��� �̿��ؼ� ����.
	
	public void addSubject(String name, int score) {
		Subject subject=new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList[index++]=subject;
		//subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total=0;
		for(Subject s : subjectList) {
			if(s==null) break;
			total+=s.getScorePoint();
			System.out.println("�л� "+studentName+"�� "+s.getName()+"���� ������ "+s.getScorePoint()+"�Դϴ�.");
		}
		System.out.println("�л� "+studentName+"�� ������ "+total+" �Դϴ�.");
	}
}