class Tv {
	boolean power;  // 전원상태(on/off)
	int channel;  // 채널
	
	void power() { power= !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class SmartTv extends Tv { // SmartTv는 Tv에 캡션(자막)을 보여주는 기능을 추가
	boolean caption;  // 캡션상태(on/off)
	void displayCaption(String text) { 
		if(caption) { // 캡션상태가 on(true)일 때만 text를 보여준다.
			System.out.println(text);
		}		
	}	
}
/* 
 * 자손클래스의 인스턴스를 생성하면 조상클래스의 멤버도 함께 생성되기 때문에 따로 조상 클래스의 
 * 인스턴스를 생성하지 않고도 조상클래스의 멤버들을 사용할 수 있다.
*/ 
public class Ex7_1 {
	public static void main(String[] args) {
		SmartTv stv= new SmartTv(); // 기본생성자 호출
		stv.channel= 10;			// 조상클래스로부터 상속받은 멤버
		stv.channelUp();			// 조상클래스로부터 상속받은 멤버
		System.out.println(stv.channel);
		stv.displayCaption("Hello, world");
		stv.caption= true;			// 캡션(자막) 기능을 켠다.
		stv.displayCaption("Hello, world");
	}
}
