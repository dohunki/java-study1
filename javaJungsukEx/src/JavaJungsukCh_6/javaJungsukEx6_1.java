
public class javaJungsukEx6_1 {

	public static void main(String args[]) { 
		Tv tv;                 // Tv�ν��Ͻ��� �����ϱ� ���� ���� t�� ����       
		tv = new Tv();         // Tv�ν��Ͻ��� �����Ѵ�. 
		tv.channel = 7;        // Tv�ν��Ͻ��� ������� channel�� ���� 7�� �Ѵ�. 
		tv.channelDown();      // Tv�ν��Ͻ��� �޼��� channelDown()�� ȣ���Ѵ�. 
		tv.power= true;
		tv.powerOnOff();
		
		System.out.println("���� ä���� " + tv.channel + " �Դϴ�."); 
		System.out.println("���� ������ " + tv.power + " �Դϴ�."); 
		// ������ on,off�� ǥ���ϴ� �����?

	} 
}

class Tv { 
	// Tv�� �Ӽ�(�������)   
	String color;           // ���� 
	boolean power;         	// ��������(on/off) 
	int channel;           	// ä�� 
	
	// Tv�� ���(�޼���) 
	void powerOnOff()   { power= !power; }  // TV�� �Ѱų� ���� ����� �ϴ� �޼���  
	void channelUp()   {  ++channel; }  // TV�� ä���� ���̴� ����� �ϴ� �޼��� 
	void channelDown() { --channel; }   // TV�� ä���� ���ߴ� ����� �ϴ� �޼���  
	// ��ȯ�� ���� ���������� ��ȯŸ���� void��� ���´�.
}