package day03;

public class Exam06 {
	public static void main(String[] args) {
		
		//난수 발생. double 형을 돌려줌. 부동 소수점. 0.0에서 1.0사이. 정수가 필요하다면 곱한 뒤에 int형으로 바꿔주기
		/*System.out.println((int)(Math.random()*50)); 
		 * 크기가 10인 배열을 만들고
		 * 0에서 50사이 난수를 발생시켜
		 * 0이 아닌 값을 배열에 넣으세요 -> 난수가 0일때는 다시 난수 발생
		 * 중복허용
		 */
		
		int[] arr=new int[10]; //길이 10인 배열 선언
		int n=0;
		while(n<arr.length){ //배열크기 10번 반복
			int r=(int)(Math.random()*50); //난수발생을 변수 r에 할당
			if(r==0) { //난수가 0인지 판단
				continue; //난수가 0이라면 다시 올라감. 다시 반복=>while의 continue라는 걸 기억하기
			} //난수가 0이 아님
				arr[n]=r;
				n++;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println("======");
		
		for(int i:arr) { //for-each. 배열 안에 들어있던 값을 가지고 옴. 처음부터 끝까지. 몇번째인지 접근할 수는 없음.
			System.out.print(i+"\t");
		}
		System.out.println("======");
		
		String[]str= {"one","two","three","four"};
		//for-each
		for(String s:str) {
			System.out.println(s);
		}
	
		
		
	}
}
