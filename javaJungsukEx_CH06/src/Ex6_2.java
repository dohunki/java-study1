

public class Ex6_2 {


	public static void main(String args[]) {
		Tv t1 = new Tv();  // Tv t1; t1 = new Tv();�� �� �������� ����
		Tv t2 = new Tv();
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");

		t1.channel = 7;    // channel ���� 7���� �Ѵ�.
		System.out.println("t1�� channel����"+ t1.channel+ "�� �����Ͽ����ϴ�.");
		t2.channel = 10;    // channel ���� 7���� �Ѵ�.
		System.out.println("t2�� channel����"+ t2.channel+ "�� �����Ͽ����ϴ�.");
		
		t1.channelUp();
		t2.channelDown();
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
	}

}

//class Tv { // package �ȿ� �̹� class�� ���ǵǾ� �־ �ʿ䰡 ����.
//	int channel;           	
//	void channelUp()   {  ++channel; }  // TV�� ä���� ���̴� ����� �ϴ� �޼��� 
//	void channelDown() { --channel; }   // TV�� ä���� ���ߴ� ����� �ϴ� �޼���  
//}


