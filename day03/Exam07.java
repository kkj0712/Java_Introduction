package day03;

public class Exam07 {
	public static void main(String[] args) {
		
		int[][] arr=new int[3][4];
		arr[0][0]=1;
		
		
		arr[0][1]=2;
			
		int[][] a= {{1,2,3,4},{11,22,33,44},{111,222,333,444}};
		System.out.println(a[1][2]); //33
		for(int i=0;i<a.length;i++) { //a.length�� �߰�ȣ�� "3��"=���� ����
			for(int j=0;j<a[i].length;j++) {   //a[i].length�� {1,2,3,4}�� ����. 2���� �迭 ���� ����.
				System.out.print(a[i][j]+"\t"); //2���� �迭 ���
			}System.out.println();
		}
		
	}
}
