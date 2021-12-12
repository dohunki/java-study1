
/*
 * ĸ��ȭ�� ���� ������
 * -���������ڴ� Ŭ���� ������ �����͸� ��ȣ�ϱ� ���� �ܺηκ����� ������ �����Ϸ��� ����Ѵ�.
 *  �̰��� ������ ���߱�(data hiding)��� �ϸ�, ��ü���ⰳ���� ĸ��ȭ�� �ش�ȴ�.
 *  ��, �ܺο��� ���ʿ��� Ŭ���� �������� ���Ǵ�(�����۾��� ���� �ӽ÷� ���Ǵ� ��������� �κ��۾��� ó���ϱ� ���� �޼��� ��)
 *  ������� Ŭ���� ���ο� ���߱� ���� ���ȴ�.  
 */

class Time {
	// ���� �����ڸ� private���� �Ͽ� �ܺο��� ���� �������� ���ϵ��� �Ѵ�.
	// �޼��带 ���� ���� ���� ���
	private int hour;
	private int minute;
	private int second;
	
	public int getHour() { return hour; }
	public void setHour(int hour) {
		if (hour< 0 || hour> 23) return;
		this.hour= hour;
	}
	
	public int getMinute() { return minute; }
	public void setMinute(int minute) {
		if (minute< 0 || minute> 59) return;
		this.minute= minute;
	}
	
	public int getSecond() { return second; }
	public void setSecond(int second) {
		if (second< 0 || second> 59) return;
		this.second= second;
	}
	
	/*
	 * -get���� �����ϴ� �޼���� �ܼ��� ��������� ���� ��ȯ�ϴ� ���� �ϰ�, set���� �����ϴ� �޼���� 
	 *  �Ű������� ������ ���� �˻��Ͽ� ���ǿ� �´� ���� ������ ��������� ���� �����ϵ��� �ۼ��Ǿ� �ִ�.
	 * -����� ���� Ȯ��� ���� ����Ǵ� Ŭ������� ����� ���� ������ �ֵ� �ڼ�Ŭ�������� �����ϴ� ����
	 *  �����ϵ��� �ϱ� ���� private ��� protected�� ����Ѵ�.
	 * -���� ��������� ���� �д� �޼����� �̸��� 'get��������̸�'���� �ϰ�, ��������� ���� �����ϴ�
	 *  �޼����� �̸��� 'set��������̸�'���� �Ѵ�. get���� �����ϴ� �޼��带 '����(getter)', 
	 *  set���� �����ϴ� �޼��带 '����(setter)'��� �θ���.
	 */
}


public class Practise3 {
	public static void main(String[] args) {
		Time t= new Time();
//		t.hour= 25; // ����. ��������
		t.setHour(25); // true, ������ �������� Data�� ��ȣ
		t.setHour(21); // false, 
		t.setMinute(36);
		t.setSecond(50);
		
		System.out.println(t.getHour()+"��" + t.getMinute()+"��" +t.getSecond()+ "��");
		System.out.printf("%d�� %d�� %d��", t.getHour(), t.getMinute(), t.getSecond() );
		
		// 
	}
}
