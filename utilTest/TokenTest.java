package utilTest;

import java.util.StringTokenizer;

public class TokenTest {

	public static void main(String[] args) {
		String str="aaa@bbb@ccc@ddd.eee";
		StringTokenizer stk=new StringTokenizer(str, "@."); //"@."=@로도, 점(.)으로도 쪼갠다.
		while(stk.hasMoreTokens()) { //hasMoreElements랑 같은 뜻
			System.out.println("토큰 수: "+stk.countTokens());
			System.out.println(stk.nextToken());
		}
		System.out.println("=======");
		
		StringTokenizer stk1=new StringTokenizer("1 0 14 15 3 3 19"); 
		while(stk1.hasMoreTokens()) {
			System.out.println("토큰 수: "+stk1.countTokens());
			System.out.println(stk1.nextToken());
		}
	}
}
