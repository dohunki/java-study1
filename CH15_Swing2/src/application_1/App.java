package application_1;

//import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import gui_2.MainFrame;

public class App {

	public static void main(String[] args) {
		// �ڹ� ���� ���α׷�
		// JFrame �� ������ â
		
		SwingUtilities.invokeLater(() -> {
			
			new MainFrame("�׽�Ʈ ���� ��");
//			JFrame mainFrame= new JFrame(); // �� ������ â ����
//			mainFrame.setSize(600, 400); // ���� 600, ���� 400
//			mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â�� ����� ���α׷� ����
//			mainFrame.setVisible(true); // â�� ���̰� ��
		});
		
	}
}
