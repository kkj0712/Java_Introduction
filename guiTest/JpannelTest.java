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
		JButton b1=new JButton("��ư1");
		JButton b2=new JButton("��ư2");
		jtf1=new JTextField(20);
		JTextArea ta=new JTextArea(5,20); //5�� 20����
		TextArea tta=new TextArea(5,10); //��ũ�ѹ� ����
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

	public void actionPerformed(ActionEvent e) { //��ư�� �������°� ActionEvent. üũ�ϴ� �� ItemEvent
		String str=e.getActionCommand();
		Container con=getContentPane();
		if(str.equals("��ư1")) {
			System.out.println("��ư1 Ŭ��");
			//������ ���������� ������ ���� ���� Container�� ���ؿͼ� getContentPane()�޼ҵ带 �̿��Ѵ�.
			con.setBackground(Color.yellow);
			System.out.println(jtf1.getText());
		}else {
			System.out.println("��ư2 Ŭ��");
			con.setBackground(Color.blue);
			jtf1.setText("");
		}
	}
		
	public static void main(String[] args) {
		new JpannelTest(); //������ �����
	}
}