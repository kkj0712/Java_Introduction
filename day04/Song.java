package day04;

public class Song {
	int year;
	String country, artist, title;
	
	//������
	public Song(int year, String country, String artist, String title) {
		this.year=year;
		this.country=country;
		this.artist=artist;
		this.title=title;
	}
	
	public void show() {
		System.out.println(year+"�� "+country+" ������ "+artist+"(��)�� �θ� "+title);
	}
	
	
	
}
