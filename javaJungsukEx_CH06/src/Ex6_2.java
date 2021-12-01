

public class Ex6_2 {


	public static void main(String args[]) {
		Tv t1 = new Tv();  // Tv t1; t1 = new Tv();를 한 문장으로 가능
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

		t1.channel = 7;    // channel 값을 7으로 한다.
		System.out.println("t1의 channel값을"+ t1.channel+ "로 변경하였습니다.");
		t2.channel = 10;    // channel 값을 7으로 한다.
		System.out.println("t2의 channel값을"+ t2.channel+ "로 변경하였습니다.");
		
		t1.channelUp();
		t2.channelDown();
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
	}

}

//class Tv { // package 안에 이미 class가 정의되어 있어서 필요가 없다.
//	int channel;           	
//	void channelUp()   {  ++channel; }  // TV의 채널을 높이는 기능을 하는 메서드 
//	void channelDown() { --channel; }   // TV의 채널을 낮추는 기능을 하는 메서드  
//}


