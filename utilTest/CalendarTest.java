package utilTest;

import java.util.Calendar;

public class CalendarTest {
	//static���� �� �Լ��� static���θ� �θ� �� �ִ�.
	public static void printCalendar(String msg, Calendar cal) {//now�� Calendar��
		//��,��,�� ���
		int year=cal.get(Calendar.YEAR); //��
		int month=cal.get(Calendar.MONTH)+1; //0���� �Ǿ��ֱ� ������ ������ ���� ����Ϸ��� +1.
		int day=cal.get(Calendar.DAY_OF_MONTH); //��
	  	System.out.println(year+"/"+month+"/"+day);
	  	//����
	  	System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //�Ͽ��Ϻ��� ����.
	  	int d=cal.get(Calendar.DAY_OF_WEEK);
	  	String yul="";
	  	switch(d) {
	  	case Calendar.SUNDAY : yul="��"; break;
	  	case Calendar.MONDAY : yul="��"; break;
	  	case Calendar.TUESDAY : yul="ȭ"; break;
	  	case Calendar.WEDNESDAY : yul="��"; break;
	  	case Calendar.THURSDAY : yul="��"; break;
	  	case Calendar.FRIDAY : yul="��"; break;
	  	case Calendar.SATURDAY : yul="��"; break;
	  	}
	  	
		//�迭�� ����ؼ� ���� ǥ��
		String[]arr= {"��","��","ȭ","��","��","��","��"};
		System.out.println("�迭����: "+arr[cal.get(Calendar.DAY_OF_WEEK)-1]);
		
	  	System.out.println("switch����: "+yul);
	  	System.out.println(Calendar.SUNDAY); //1
	  	int ampm=cal.get(Calendar.AM_PM);
	  	String ampmStr="";
	  	/*
	  	if(ampm==Calendar.AM) {
	  		ampmStr="����";
	  	}else {
	  		ampmStr="����";
	  	}
	  	*/
	  	ampmStr=(ampm==Calendar.AM)? "����":"����";
	  	int hourofDay=cal.get(Calendar.HOUR_OF_DAY);
	  	int h=cal.get(Calendar.HOUR);
	  	int m=cal.get(Calendar.MINUTE);
	  	int s=cal.get(Calendar.SECOND);
	  	System.out.println("����ð�: "+ampmStr+" "+h+":"+m+":"+s);
	  	System.out.println("����ð�: "+hourofDay+":"+m+":"+s);
	}
	public static void main(String[] args) {
		Calendar now=Calendar.getInstance();
		CalendarTest.printCalendar("����", now);
		now.set(1991,6,12);
		CalendarTest.printCalendar("����� ", now);
	}	
}