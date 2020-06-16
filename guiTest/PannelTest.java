package guiTest;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PannelTest extends Frame implements ActionListener{
	TextField tf1;
	public PannelTest() {
		//super("GUI Test"); //frame의 제목
		setTitle("GUI Test"); //제목 붙이는 명령어
		Button b1=new Button("버튼1");
		Button b2=new Button("버튼2");
		Button b3=new Button("버튼3");
		tf1=new TextField(20); //이름 적는 칸 만들기. 생성자의 인자값으로 크기지정
		setLayout(new FlowLayout()); //FlowLayout:차례로 놓여지게함
		add(b1); //frame에 b1을 얹는다.
		add(b2); //버튼 1은 안나오고 버튼 2만 나옴
		add(b3);
		add(tf1);
		setSize(300,400); //frame의 크기를 300x400
		setVisible(true); //frame을 보여달라
		b1.addActionListener(this); //actionPerformed가 있는 위치를 가리킴. 같은 클래스 이므로 자기자신=this.
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		String str=e.getActionCommand(); //버튼의 글자를 String형으로 알려줌
		if(str.equals("버튼1")) {
			System.out.println("버튼 1 이벤트 발생"); //이 이벤트를 누가 부를까? 버튼 1이 부른다고 할때 어떻게 연결할까?
			setBackground(Color.yellow);
			System.out.println(tf1.getText());
		}else if(str.equals("버튼2")) {
			System.out.println("버튼 2 이벤트 발생");
			setBackground(Color.BLUE);
		}else {
			System.out.println("버튼 3 이벤트 발생");
			setBackground(Color.pink);
		}
	}
	
	public static void main(String[] args) {
		new PannelTest();
		
	}
	
}
