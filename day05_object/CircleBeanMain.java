package day05_object;

public class CircleBeanMain {

	public static void main(String[] args) {
		//반지름이 1,2,3,4,5 인 5개의 CircleBean객체를 만들고
		//각 CircleBean의 넓이를 출력하고
		//총 면적을 출력하시오
		//배열로 구하시오
		
		//배열은 선언, 생성, 초기화가 되어야함. 그 안에 값이 들어있어야 함.
		CircleBean[]arr=new CircleBean[5]; //선언&생성
		for(int i=0;i<arr.length;i++) {
			arr[i]=new CircleBean(i+1); //초기화. new해서 CircleBean이 각 방마다 만들어졌단 얘기. 1,2,3,4,5값을 가짐
		}
		double hap=0;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].getArea());
			hap+=arr[i].getArea();
		}
		System.out.println("총 면적: "+hap);
	}

}
