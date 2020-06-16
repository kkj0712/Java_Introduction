package exception;
//오류: 컴파일 오류, 실행 오류
//예외: 프로그램이 감지할 수 있는 오류
public class ExceptionTest01 {

	public static void main(String[] args) {
		int[]arr=new int[5];
		String str="";
		//오류가 날 법한 코드를 try안에 넣고
		//catch안에 어떤 오류인지 구분해서 변수와 함께 기재
		//보통 넓은 범위를 밑에 쓴다.
		try {
			System.out.println(str.length());
			for(int i=0;i<5;i++) {
				arr[i]=i;
				System.out.println(arr[i]);
			}

		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외발생");
		}catch (NullPointerException n) {
			System.out.println("null 값");
		}finally {
			//try가 수행되든 catch가 수행되든 반드시 수행되어야 하는 문장은 finally안에.
			System.out.println("반드시 수행되는 문장");
		}
		
	}
}
