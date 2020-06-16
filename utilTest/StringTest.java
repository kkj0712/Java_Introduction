package utilTest;

public class StringTest {

	public static void main(String[] args) {
		//String은 클래스형. 기본데이터형이 아님. 클래스는 대문자로 시작.
		//클래스형은 new 로 객체를 만든다. 그런데 지금까지 String i=oo; 이런식으로 선언했었다.
		//어떻게 가능했던 걸까? 
		//클래스는 주소값을 가지니까 str에는 100이란 주소값을 가지고 있고 출력할때 100이 가리키는 안녕이라는 값을 출력하는것.
		//==는 주소가 맞는지 물어본다. 그래서 str과 str1은 주소가 같기에 같다고 출력되고
		//equals는 내용이 맞는지 물어본다. 그래서 str과 tmp는 내용이 같기에 같다고 출력된다.
		String str="안녕";
		String str1="안녕";
		String tmp=new String("안녕");
		if(str==str1) {
			System.out.println("str==str1 주소 같다");
		}else {
			System.out.println("str==str1 주소 다르다");			
		}
		if(str==tmp) {
			System.out.println("str==tmp 주소 같다");
		}else {
			System.out.println("str==tmp 주소 다르다");			
		}
		if(str.equals(str1)) {
			System.out.println("str equals str1 내용 같다");
		}else {
			System.out.println("str equals str1 내용 다르다");			
		}
		if(str.equals(tmp)) {
			System.out.println("str equals tmp 내용 같다");
		}else {
			System.out.println("str equals tmp 내용 다르다");			
		}
		str=str+str1; 
		//안녕안녕이 str에 담긴다. 원래있던 str의 안녕은 사라지고, 주소값도 달라진다.
		//String은 정적 클래스. 내용 수정이 불가하다. 
		//동적클래스를 사용하는게 낫다. String Builder 혹은 String Buffer.
		if(str==str1) {
			System.out.println("주소 같다");
		}else {
			System.out.println("주소 다르다");
		}
	}
}