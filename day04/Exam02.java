package day04;

public class Exam02 {
	public static void main(String[] args) {
		//난수를 배열에 입력하되
		//들어갈 위치를 랜덤하게 정하고
		//1부터 100이하의 수를 넣으시오
		//단, 값이 이미 들어가 있으면 넣지 않는다.
		
		int []arr=new int[5]; //0 0 0 0 0
		int n=0;
		while(n<arr.length){ //배열의 길이 만큼 반복한다. 
			int col=(int)(Math.random()*5); //배열위치를 랜덤하게 정한다.
			if(arr[col]!=0) { //이 위치에는 이미 값이 들어갔음. 그럼 다시 while문을 돌아서 "배열의 위치"를 정한다. 
				continue; 
			}else { //배열에 들어간 값이 0이라면 (=값이 없다면) 1에서 100이하의 난수를 발생. 
				arr[col]=(int)(Math.random()*100)+1; //1에서 100이하이므로 0이 나왔을때 1을 더해주는 것.
				n++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		
		
	}
}
