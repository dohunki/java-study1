
import java.awt.*; // AWT(JAVA�� ������ ���α׷���)
import java.awt.event.*;

public class Ex7_18 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new EventHandler()); // 2.��ü����
//1.2.��	b.addActionListener(new ActionListener() {}); ���� ������ �� �� �ִ�.
		// ���� �Ǵ� �������̽� �̸��� ���� {}�� Ŭ������ ������ �ִ´�.
		
	}
}

//  1.Ŭ���� ����
class EventHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!!!");
	}
}

// �ٿ��� Ex7_19�� ���� ��Ÿ����.