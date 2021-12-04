package gui_2;

import java.awt.BorderLayout;
//import java.awt.Color;
import java.awt.Color;

import javax.swing.JFrame;

public class MainFrame extends JFrame{	
	private static final long serialVersionUID= 1L;
	
	public MainFrame(String title) { // ������
		super(title); // â�� �̸��� �־ ����
		
		// ���� ���̾ƿ� ����
		setLayout(new BorderLayout()); // â�� ������Ʈ�� ���̱� ���� ���̾ƿ� ����

		final MainPanel mainPanel= new MainPanel();
//		mainPanel.setBackground(Color.CYAN);
		
		add(new Toolbar(mainPanel), BorderLayout.NORTH); // ���ʿ� ���� ���̱�
		add(mainPanel, BorderLayout.CENTER); // ������ ���� �г��� ���̾ƿ��� ��� ���̱�
		
		setSize(600, 400); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â�� ����� ���α׷� ����
		setVisible(true); 
		
	}
}
