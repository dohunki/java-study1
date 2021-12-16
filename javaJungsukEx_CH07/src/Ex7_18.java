
import java.awt.*; // AWT(JAVA의 윈도우 프로그래밍)
import java.awt.event.*;

public class Ex7_18 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new EventHandler()); // 2.객체생성
//1.2.를	b.addActionListener(new ActionListener() {}); 으로 간단히 할 수 있다.
		// 조상 또는 인터페이스 이름을 쓰고 {}에 클래스의 내용을 넣는다.
		
	}
}

//  1.클래스 정의
class EventHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!!!");
	}
}

// 줄여서 Ex7_19와 같이 나타낸다.