package day06_objectArray;

public class BookBean {
	private String title;
	private String writer;
	
	public BookBean(String title, String writer) {
		this.title=title;
		this.writer=writer;
	}
	//getter. title과 writer가 private이기 때문에
	//BookMain에서 접근하지 못함.
	//따라서 public으로 메소드를 만들어서 값을 돌려주기.
	public String getTitle() {
		return title;
	}
	
	public String getWriter() {
		return writer;
	}
	
}