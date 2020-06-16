package day03;

public class Exam07 {
	public static void main(String[] args) {
		
		int[][] arr=new int[3][4];
		arr[0][0]=1;
		
		
		arr[0][1]=2;
			
		int[][] a= {{1,2,3,4},{11,22,33,44},{111,222,333,444}};
		System.out.println(a[1][2]); //33
		for(int i=0;i<a.length;i++) { //a.length는 중괄호가 "3개"=행의 길이
			for(int j=0;j<a[i].length;j++) {   //a[i].length는 {1,2,3,4}의 길이. 2차원 배열 열의 길이.
				System.out.print(a[i][j]+"\t"); //2차원 배열 출력
			}System.out.println();
		}
		
	}
}
