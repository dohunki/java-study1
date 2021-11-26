
public class javaJungsukEx6_1 {

	public static void main(String args[]) { 
		Tv tv;                 // Tv인스턴스를 참조하기 위한 변수 t를 선언       
		tv = new Tv();         // Tv인스턴스를 생성한다. 
		tv.channel = 7;        // Tv인스턴스의 멤버변수 channel의 값을 7로 한다. 
		tv.channelDown();      // Tv인스턴스의 메서드 channelDown()을 호출한다. 
		tv.power= true;
		tv.powerOnOff();
		
		System.out.println("현재 채널은 " + tv.channel + " 입니다."); 
		System.out.println("현재 전원은 " + tv.power + " 입니다."); 
		// 전원을 on,off로 표현하는 방법은?

	} 
}

class Tv { 
	// Tv의 속성(멤버변수)   
	String color;           // 색상 
	boolean power;         	// 전원상태(on/off) 
	int channel;           	// 채널 
	
	// Tv의 기능(메서드) 
	void powerOnOff()   { power= !power; }  // TV를 켜거나 끄는 기능을 하는 메서드  
	void channelUp()   {  ++channel; }  // TV의 채널을 높이는 기능을 하는 메서드 
	void channelDown() { --channel; }   // TV의 채널을 낮추는 기능을 하는 메서드  
	// 반환할 값이 없을때에는 반환타입을 void라고 적는다.
}