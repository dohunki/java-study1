/*
 * ��ü �ڽ��� ����Ű�� �������� : this
 * -�������� �Ű������� �ν��Ͻ��������� �ʱⰪ�� �����޴� ��찡 ���� ������ �Ű������� �ν��Ͻ������� �̸��� 
 * ��ġ�ϴ� ��찡 ���� �ִ�. �̶� �Ű����� �̸��� �ٸ��� �ϴ� �ͺ��� 'this'�� ����ؼ� �����ϵ��� �ϴ� ����
 * �ǹ̰� �� ��Ȯ�ϰ� �����ϱ� ����.
 * -'this'�� ���������� �ν��Ͻ� �ڽ��� ����Ų��. ���������� ���� �ν��Ͻ��� ����� ������ �� �ִ� ��ó��,
 * 'this'�� �ν��Ͻ������� ������ �� �ִ�. 
 * -������ 'this'�� ����� �� �ִ� ���� �ν��Ͻ�������̴�. static�޼��忡���� �ν��Ͻ������ ����� �� 
 * ���� ��ó�� 'this' ���� ����� �� ����.
 * -�����ڸ� ������ ��� �ν��Ͻ��޼��忡�� �ڽ��� ���õ� �ν��Ͻ��� ����Ű�� �������� 'this'�� ����������
 * ������ ä�� �����Ѵ�.
 *  this : �ν��Ͻ� �ڽ��� ����Ű�� ��������, �ν��Ͻ��� �ּҰ� ����Ǿ� �ִ�.
 *  	   ��� �ν��Ͻ��� ���������� ������ ä�� �����Ѵ�.
 *  this(), this(�Ű�����) : ������, ���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ����Ѵ�.
 */
public class Practise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	}
}

class Car3 {
	String color;
	String gearType;
	int door;
	
	Car3(){}
	
	Car3(String c, String g, int d) {
		color= c; // color�� iv, c�� lv
		// this.color= c; ���� this�� �����Ǿ� �ִ� ���̴�.
		gearType= g;
		door= d;
	}	
}

class Car4 {
	String color;
	String gearType;
	int door;
	
	Car4(){}
	
	Car4(String color, String gearType, int door) {
		this.color= color;
		this.gearType= gearType;
		this.door= door;
	}	
}