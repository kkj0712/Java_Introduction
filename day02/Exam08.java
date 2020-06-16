package day02;

public class Exam08 {
	public static void main(String[] args) {
		//1부터 10까지 홀수의 합을 구하기
		
		int i=0;
		int sum=0;
		while (i<10) {
			i++;
			if(i%2==1) {
				sum+=i;
			}
		}
		System.out.println("결과: "+sum);
		System.out.println("======");
		
		int hap=0;
		for(int j=1;j<=10;j++) { 
			if(j%2!=1) continue;
			hap+=j;
		}
		System.out.println("continue 결과: "+hap);
		System.out.println("======");
		/*j가 1일때 j%2!=1이란 조건에 안걸림. continue 안걸리고 hap에 j값 더함
		 * j가 2일때 j%2!=1이란 조건에 걸림. 그러면 continue만나고 다시 올라감.
		 * 결국 홀수만 더하게 되는것.
		 */
		
		System.out.println("결과: "+sum);
		System.out.println("======");
		
		int h=0;
		for(int k=1;k<=10;k++) { 
			if(k%2!=1) break; 
			h+=k;
		}
		System.out.println("break 결과: "+h);
		System.out.println("======");
		/*break는 반복문을 벗어나라. 
		 * k가 1일때 h는 1. k가 2일때 나머지가 1이 아니므로 break를 만나서 반복문을 벗어남. 
		 * 그래서 h는 1밖에 안됨
		 */
	
	}
}
