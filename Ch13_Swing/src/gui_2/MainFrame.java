package gui_2;

import java.awt.BorderLayout;
//import java.awt.Color;

import javax.swing.JFrame;

public class MainFrame extends JFrame{	
	private static final long serialVersionUID= 1L;
	
	public MainFrame(String title) { // ������
		super(title); // â�� �̸��� �־ ����
		
		// �г� �ֱ�
		// ���� ���̾ƿ� ����
		setLayout(new BorderLayout()); // â�� ������Ʈ�� ���̱� ���� ���̾ƿ� ����
		
//		JPanel panel= new JPanel(); // �г��� ����
//		panel.setBackground(Color.green); // �г��� ���� ��� ����
		
		add(new Toolbar(), BorderLayout.NORTH); // ���ʿ� ���� ���̱�
		add(new MainPanel(), BorderLayout.CENTER); // ������ ���� �г��� ���̾ƿ��� ��� ���̱�
		
		setSize(600, 400); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â�� ����� ���α׷� ����
		setVisible(true); 
		
	}
}
