package day03;

public class Exam02 {
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i+=10) {
			int sum=0; //sum을 초기화시켜야 다시 11부터 20까지, 21부터 30까지 각각 더할 수 있음.
			int j;
			for(j=i;j<i+10;j++) {
				sum+=j;
			}
			System.out.println(i+"부터"+(j-1)+"까지의 합: "+sum);
		}
		System.out.println();



	}
}
