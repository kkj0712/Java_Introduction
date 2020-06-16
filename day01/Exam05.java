package day01;

public class Exam05 {
	public static void main(String[] args) {
		int a=49;
		//a는 50보다 크다
		if(a>50) { //true
			System.out.println("a는 50보다 크다"); //true일때 실행할 문장
		} else { //false
			System.out.println("a는 50보다 작다"); //false일때 실행할 문장
		}
		
		if(a%2==0) { //true라면 2로 나눴을때 나머지 0
			System.out.println(a+" : 짝수");
		} else { //false라면 2로 나눴을때 나머지가 1
			System.out.println(a+" : 홀수");
		}
		
		//다중 if
		int b=252;
		if(b<0) {
			System.out.println("0미만");
		}else if(b<100) { //b가 0보다 작지 않다는 조건을 충족하지 않은 다음에 대조하는 조건. 자동으로 b가 0과 100사이에 들어간다는 뜻임.
			System.out.println("0에서 99사이 수");
		}else if(b<200) {
			System.out.println("100에서 199사이 수");
		}else if(b<300) {
			System.out.println("200에서 299사이 수");
		}else {
			System.out.println("300 이상 수");
		}
		
		int c=-100;
		if(c<0) {
			System.out.println("0미만");
		}
		if(c>=0 && c<100){
			System.out.println("0에서 99사이 수");
		}
		if(c>=100 && c<200) {
			System.out.println("100에서 200사이 수");
		}
		if(c>=300) {
			System.out.println("300이상 수");
		}
		
		int su=51;
		if(su>0 && su%2==0){
			System.out.println("su는 0보다 크고 짝수다");
		}
		else if(su==0){
			System.out.println("su는 0이다");
		}	
		else{
			System.out.println("su는 0보다 크고 홀수다");
		}

	}
}
