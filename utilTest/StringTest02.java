package utilTest;

public class StringTest02 {
	public static void main(String[] args) {
		String str="안녕하세요 Hello  지금은 자바 공부중!!!";
		System.out.println("str 길이: "+str.length()); //문자열의 길이
		System.out.println("H위치: "+str.indexOf('H'));
		System.out.println("H위치: "+str.indexOf("Hello")); //문자가 시작되는 위치
		System.out.println("4번째 문자의 위치: "+str.charAt(4));
		String tmp="열심히 합시다";
		System.out.println("str과 tmp 연결: "+str+tmp);
		System.out.println("str과 tmp 연결: "+str.concat(tmp));
		int value=7;
		System.out.println("str과 value 연결: "+str+value);
		//System.out.println("str과 value 연결: "+str.concat(value));
		//concat안에는 String형이 들어가야하는데 value는 int형.
		//String의 함수가 static으로 만들어졌기 때문에 클래스 이름으로 접근가능.
		//valueof를 통해 int형을 String형으로 변환.
		String s=String.valueOf(value);
		System.out.println("str과 value 연결: "+str.concat(s));
		System.out.println("tmp와 value 연결: "+tmp.concat(String.valueOf(value)));
		String msg="abcdefg";
		System.out.println(msg.toUpperCase());
		System.out.println(msg.toUpperCase().toLowerCase());
		String[]arr=str.split(" ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr.length);
	}
}