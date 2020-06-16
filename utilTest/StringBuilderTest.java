package utilTest;

public class StringBuilderTest {

	public static void main(String[] args) {
		String str="string";
		//StringBuilder는 문자를 동적으로 받기때문에 출력, 삭제 등이 간편
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb);
		sb.append("자바"); //맨 뒤에 문자 삽입
		System.out.println(sb);
		sb.insert(2, "oracle"); //위치를 지정하여 문자 삽입
		System.out.println(sb); //storaclering자바
		System.out.println(sb.toString()); //toString은 문자로 바꾼다.
		sb.delete(2, 5);
		System.out.println(sb); //인덱스 2앞에 커서가 있다고 생각. o,r,a가 없어짐. stclering자바
		sb.reverse();
		System.out.println(sb); //문자열 거꾸로 출력
		System.out.println(sb.charAt(3)); //3번째 있는 문자 출력
		System.out.println(sb.substring(3)); //문자 추출: 인덱스 3번째부터 끝까지 출력
		System.out.println(sb.substring(3,5)); //3에서 부터 5전까지 출력. 
	}
}
