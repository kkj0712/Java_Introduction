package day06_objectArray;

public class BookBean {
	private String title;
	private String writer;
	
	public BookBean(String title, String writer) {
		this.title=title;
		this.writer=writer;
	}
	//getter. title�� writer�� private�̱� ������
	//BookMain���� �������� ����.
	//���� public���� �޼ҵ带 ���� ���� �����ֱ�.
	public String getTitle() {
		return title;
	}
	
	public String getWriter() {
		return writer;
	}
	
}