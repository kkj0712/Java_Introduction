package guiTest;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JpannelTest extends JFrame implements ActionListener{
	JTextField jtf1;
	public JpannelTest() {
		JButton b1=new JButton("버튼1");
		JButton b2=new JButton("버튼2");
		jtf1=new JTextField(20);
		JTextArea ta=new JTextArea(5,20); //5행 20글자
		TextArea tta=new TextArea(5,10); //스크롤바 생성
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(jtf1);
		add(ta);
		add(tta);
		b1.addActionListener(this);
		b2.addActionListener(this);
		setSize(300,400);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) { //버튼이 눌러지는건 ActionEvent. 체크하는 건 ItemEvent
		String str=e.getActionCommand();
		Container con=getContentPane();
		if(str.equals("버튼1")) {
			System.out.println("버튼1 클릭");
			//색깔을 직접적으로 구현할 수는 없고 Container를 구해와서 getContentPane()메소드를 이용한다.
			con.setBackground(Color.yellow);
			System.out.println(jtf1.getText());
		}else {
			System.out.println("버튼2 클릭");
			con.setBackground(Color.blue);
			jtf1.setText("");
		}
	}
		
	public static void main(String[] args) {
		new JpannelTest(); //생성자 만들기
	}
}