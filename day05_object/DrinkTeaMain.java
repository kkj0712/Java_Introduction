package day05_object;

public class DrinkTeaMain {
	
	
	public static void main(String[] args) {
		Drink[]arr=new Drink[100];
		//커피	 	500 3 1500
		//녹차 		800 5 4000
		//카페라떼 	1500 5 7500
	
		arr[0]=new Drink("커피", 500, 3); //배열안에 객체 만들기
		arr[1]=new Drink("녹차", 800, 5);
		arr[2]=new Drink("카페라떼", 1500, 5);
		
		//총판매액 출력
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==null) break;
			arr[i].getData();
			sum+=arr[i].getTotal();
		}System.out.println("총판매액: "+sum);
		
		
	}
}
