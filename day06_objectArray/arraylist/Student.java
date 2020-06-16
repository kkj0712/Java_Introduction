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
	//배열을 대신해서 사용할 수 있는게 ArrayList.
	//학생이 여러 과목을 듣는데 그걸 따로 과목에 대한 클래스로 따로 분류
	//그걸 배열에 담음.
	//배열은 처음에 공간을 정해줘야함. 대신에 ArrayList는 추가한만큼 크기가 변화함
	//ArrayList는 함수를 이용해서 접근.
	
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
			System.out.println("학생 "+studentName+"의 "+s.getName()+"과목 성적은 "+s.getScorePoint()+"입니다.");
		}
		System.out.println("학생 "+studentName+"의 총점은 "+total+" 입니다.");
	}
}