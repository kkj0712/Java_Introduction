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
		//super("GUI Test"); //frame�� ����
		setTitle("GUI Test"); //���� ���̴� ��ɾ�
		Button b1=new Button("��ư1");
		Button b2=new Button("��ư2");
		Button b3=new Button("��ư3");
		tf1=new TextField(20); //�̸� ���� ĭ �����. �������� ���ڰ����� ũ������
		setLayout(new FlowLayout()); //FlowLayout:���ʷ� ����������
		add(b1); //frame�� b1�� ��´�.
		add(b2); //��ư 1�� �ȳ����� ��ư 2�� ����
		add(b3);
		add(tf1);
		setSize(300,400); //frame�� ũ�⸦ 300x400
		setVisible(true); //frame�� �����޶�
		b1.addActionListener(this); //actionPerformed�� �ִ� ��ġ�� ����Ŵ. ���� Ŭ���� �̹Ƿ� �ڱ��ڽ�=this.
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		String str=e.getActionCommand(); //��ư�� ���ڸ� String������ �˷���
		if(str.equals("��ư1")) {
			System.out.println("��ư 1 �̺�Ʈ �߻�"); //�� �̺�Ʈ�� ���� �θ���? ��ư 1�� �θ��ٰ� �Ҷ� ��� �����ұ�?
			setBackground(Color.yellow);
			System.out.println(tf1.getText());
		}else if(str.equals("��ư2")) {
			System.out.println("��ư 2 �̺�Ʈ �߻�");
			setBackground(Color.BLUE);
		}else {
			System.out.println("��ư 3 �̺�Ʈ �߻�");
			setBackground(Color.pink);
		}
	}
	
	public static void main(String[] args) {
		new PannelTest();
		
	}
	
}
