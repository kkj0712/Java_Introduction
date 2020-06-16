package day02;

public class Exam04 {
	public static void main(String[] args) {
		
		/* 1에서 100까지의 합을 출력할때 10단위씩 나눠서 출력하기
		int hap=0;
		for(int i=1;i<=100;i++) {
			hap+=i; //1부터 100까지의 합을 hap변수로 구함
			if(i%10==0) { //i가 10으로 나누어 떨어질때: 10,20,30,...100까지. 그때만 hap을 출력하겠다는 의미.
				System.out.println("1부터"+i+"까지의 합 "+hap);
			}
		}
		*/
		
		/* 1+2+3+4+5+6+7+8+9+10=55 형식으로 표현하기
		int s=0;
		for(int i=1;i<=10;i++) {
			s+=i;
			if(i!=10) {
				System.out.print(i+"+");
			}else {
				System.out.print(i+"="+s);
			}
		}
		*/
		
		System.out.println("=======");
		
		int h=0;
		for(int i=1;i<=10;i++) {
			h+=i;
			if(i==1) {
				System.out.print(i);
			}else {
				System.out.print("+"+i);
			}
		}System.out.print("="+h);
		
	}
}