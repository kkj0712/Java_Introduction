package day01;

public class Exam11 {
	public static void main(String[] args) {
		int n1 = 5;
		int n2 = ++n1; //n1에서 1 증가한 값을 n2에 넣기.
		System.out.println("n1: "+n1); //6
		System.out.println("n2: "+n2); //6
		System.out.println("======");
		
		int n3 = n1++; //6을 n3에 넣고, 빠져나오면서 n1이 7이 됨.
		System.out.println("n1: "+n1); //7
		System.out.println("n3: "+n3); //6
		System.out.println("======");
		
		int num1=7;
		int num2=--num1; //num1=6, num2=6
		int num3=num1--; //num1=5, num3=6
		System.out.println("num1: "+num1); //5
		System.out.println("num2: "+num2); //6
		System.out.println("num3: "+num3); //6
		
		int a=50, b=3;
		int c;
		a++; //빠져 나오면서 a=51
		++b; //b=4
		c=a++ + ++b; //c=51+5=56 값을 계산하고 난 뒤에 빠져나오면서 a=52
		System.out.println("a: "+a); //52 
		System.out.println("b: "+b); //5
		System.out.println("c: "+c); //56
		System.out.println("======");
		
		int aa=10, bb=3;
		int cc;
		--aa; //a=9
		bb++; //빠져나오면서 bb=4
		cc=aa-- + ++bb; //cc=9+5=14, bb=5, aa=8 
		System.out.println("aa: "+aa); //8
		System.out.println("bb: "+bb); //5
		System.out.println("cc: "+cc); //14
		
	}
}
