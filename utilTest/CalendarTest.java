package utilTest;

import java.util.Calendar;

public class CalendarTest {
	//static으로 된 함수는 static으로만 부를 수 있다.
	public static void printCalendar(String msg, Calendar cal) {//now는 Calendar형
		//년,월,일 출력
		int year=cal.get(Calendar.YEAR); //년
		int month=cal.get(Calendar.MONTH)+1; //0부터 되어있기 때문에 현재의 월을 출력하려면 +1.
		int day=cal.get(Calendar.DAY_OF_MONTH); //일
	  	System.out.println(year+"/"+month+"/"+day);
	  	//요일
	  	System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //일요일부터 센다.
	  	int d=cal.get(Calendar.DAY_OF_WEEK);
	  	String yul="";
	  	switch(d) {
	  	case Calendar.SUNDAY : yul="일"; break;
	  	case Calendar.MONDAY : yul="월"; break;
	  	case Calendar.TUESDAY : yul="화"; break;
	  	case Calendar.WEDNESDAY : yul="수"; break;
	  	case Calendar.THURSDAY : yul="목"; break;
	  	case Calendar.FRIDAY : yul="금"; break;
	  	case Calendar.SATURDAY : yul="토"; break;
	  	}
	  	
		//배열을 사용해서 요일 표시
		String[]arr= {"일","월","화","수","목","금","토"};
		System.out.println("배열요일: "+arr[cal.get(Calendar.DAY_OF_WEEK)-1]);
		
	  	System.out.println("switch요일: "+yul);
	  	System.out.println(Calendar.SUNDAY); //1
	  	int ampm=cal.get(Calendar.AM_PM);
	  	String ampmStr="";
	  	/*
	  	if(ampm==Calendar.AM) {
	  		ampmStr="오전";
	  	}else {
	  		ampmStr="오후";
	  	}
	  	*/
	  	ampmStr=(ampm==Calendar.AM)? "오전":"오후";
	  	int hourofDay=cal.get(Calendar.HOUR_OF_DAY);
	  	int h=cal.get(Calendar.HOUR);
	  	int m=cal.get(Calendar.MINUTE);
	  	int s=cal.get(Calendar.SECOND);
	  	System.out.println("현재시각: "+ampmStr+" "+h+":"+m+":"+s);
	  	System.out.println("현재시각: "+hourofDay+":"+m+":"+s);
	}
	public static void main(String[] args) {
		Calendar now=Calendar.getInstance();
		CalendarTest.printCalendar("현재", now);
		now.set(1991,6,12);
		CalendarTest.printCalendar("당신은 ", now);
	}	
}