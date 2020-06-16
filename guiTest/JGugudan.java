package guiTest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JGugudan extends JFrame implements ActionListener{
	JTextField tf1;
	JTextArea ta1;
	int gugudan;
	int dan;

	public JGugudan() {
		setTitle("������");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		tf1=new JTextField(10);
		JButton b1=new JButton("������");
		ta1=new JTextArea(10,20);
		setLayout(new FlowLayout());
		add(tf1);
		add(b1);
		add(ta1);
		b1.addActionListener(this);
		tf1.addActionListener(this); //���͸� ������ ��ư�� ����
		setSize(400,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JGugudan();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ta1.setText(""); //�� ���� ��� ���ڸ� ����� ����.
		//TextField�� �ִ� ���ڸ� �޾ƿͼ� ���������� ��ȯ
		//���� �����ͼ� for�� �̿�
		try {
			//���ڰ� �ƴ� �� parseInt�ϸ� �����߻�. �׶� ���� �޽��� ���ֱ�
			int dan = Integer.parseInt(tf1.getText()); 
			for(int i=1;i<10;i++) {
				ta1.append(dan+"*"+i+"="+dan*i+"\n");
			}
		} catch (NumberFormatException n) {
			tf1.setText("���ڸ� �Է��ϼ���.");
		}
	}
}