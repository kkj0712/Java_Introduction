package day04;

public class Song {
	int year;
	String country, artist, title;
	
	//생성자
	public Song(int year, String country, String artist, String title) {
		this.year=year;
		this.country=country;
		this.artist=artist;
		this.title=title;
	}
	
	public void show() {
		System.out.println(year+"년 "+country+" 국적의 "+artist+"(이)가 부른 "+title);
	}
	
	
	
}
