package day02;

public class Exam10 {

	public static void main(String[] args) {
	
		for(int k=2;k<=4;k++) { //이중 for문. 바깥 for가 한번 돌때 안에 for가 다 돌고 나서 바깥 for문 두번째 돔.
			for(int i=1;i<=3;i++) {
				System.out.println(k+"*"+i+"="+k*i);	
			}
			System.out.println("===");
		}
	
		
		for(int i=1;i<=9;i++) {
			for(int d=4;d<=6;d++){
				System.out.print(d+"*"+i+"="+d*i+"\t");				
			}
			System.out.println();  
		}
		System.out.println("===");
		
		/*if문에 조건 걸고 6이면 한칸 띄우기=>이런식으로 안해도 6되면 자동으로 한칸 띄어짐.
		 * 6찍고 나면 한칸 띄우면 되니까 안쪽 for문과 바깥 for문 사이에 쓰기.
		 */
		/* 123456789
		 * 1234567
		 * 12345
		 * 123
		 * 1
		 */
		for(int i=9;i>0;i-=2) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("=====");
		
		for(int i=1;i<10;i+=2) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("=====");
		
		
		for(int i=3;i<=7;i+=2) {
			System.out.println(i+"단");
			for(int j=1;j<10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
		
	}	
}

