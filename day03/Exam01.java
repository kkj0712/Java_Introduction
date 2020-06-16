package day03;

public class Exam01 {
	public static void main(String[] args) {
		
		for(int i=9;i>0;i-=2) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			} //j
			System.out.println("("+i+")");
		}//i
		System.out.println("======");
		
		for(char i='I';i>='A';i-=2) {
			for(char j='A';j<=i;j++) {
				System.out.print((char)(j+1)); //char형으로 표시해서 출력해 달라고 하는 캐스팅 (형변환)
			} 
			System.out.println("("+i+")");
		}
		System.out.println("======");
		
		for(char i='z';i>='a';i--) {
			for(char j='a';j<='z';j++) {
				if(j>=i) {
					System.out.print((char)j);	
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
	}
}
