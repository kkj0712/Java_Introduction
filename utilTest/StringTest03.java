package utilTest;

public class StringTest03 {

	public static void main(String[] args) {
		String tmp="1 0 15 23 6 21 17 10 11 12 13 14";
		//tmp의 길이를 출력. 문자열의 길이.
		System.out.println("tmp의 길이: "+tmp.length());
		
		//tmp를 공백으로 구분하여 배열의 길이 출력
		String []arr=tmp.split(" ");
		System.out.println("arr의 길이: "+arr.length);

		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"\t");
		}System.out.println("====");
		
		//16진수
		//Integer라는 클래스에 toHexString을 쓰면 16진수로 바꿔준다.
		System.out.println(Integer.toHexString(15));
		
		/*
		arr배열안에 있는 숫자를 16진수로 변경
		문자를 숫자로 바꾸는 메소드 parseInt를 사용해야
		정수만 인수로 받는 toHexString을 통해 16진수로 변환시킬 수 있다.
		*/
		String oct="";
		String hex="";
		for(int i=0;i<arr.length;i++) {
			int v=Integer.parseInt(arr[i]);
			oct+=Integer.toOctalString(v)+"\t";
			hex+=Integer.toHexString(v).toUpperCase()+"\t";
		}
		System.out.println("8진수: "+oct);
		System.out.println("16진수: "+hex);
		
	}
}