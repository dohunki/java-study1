/*
 * �������̽��� ����
 * -�������̽��� �߻�Ŭ����ó�� �� ��ü�δ� �ν��Ͻ��� ������ �� ������, �߻�Ŭ������ ����� ����
 *  �߻�޼��带 �ϼ��ϴ� ��ó��, �������̽��� implements�� �̿��� �ڽſ� ���ǵ� �߻�޼����� 
 *  ������ ������ִ� Ŭ������ �ۼ��ؾ� �Ѵ�.(������ ���� �߻�޼��带 �ϼ�)
 *  
 *  class Ŭ�����̸� implements �������̽��̸� {
 *  	// �������̽��� ���ǵ� �߻�޼��带 ��� �����ؾ� �Ѵ�.
 *  }
 */

public class Practise8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y); // �߻�޼���� move�� �־�� �������� move���߰� �����.
	void stop() { /* ���� ��ġ�� ���� */ }
}

interface Fightable2 {
	void move(int x, int y);
	void attack(Unit2 u);
}

class Fighter1 implements Fightable2 {
	public void move(int x, int y) { /* ���� ���� */ }
	public void attack(Unit2 u) { /* ���� ���� */ }	
}

// ���� �����ϴ� �������̽� �޼��� �� �Ϻθ� �����Ѵٸ�, abstract�� �ٿ� �߻�Ŭ������ �����ؾ� �Ѵ�.
abstract class Fighter2 implements Fightable2 {
	public void move(int x, int y) { /* ���� ���� */ }  // 1���� ����
	// public abstract void attack(Unit u); �� ������ �ִ�.
}

// ������ ���� ��Ӱ� ������ ���ÿ� �� ���� �ִ�.
class Fighter3 extends Unit2 implements Fightable2 {
	public void move(int x, int y) { /* ���� ���� */ }
	public void attack(Unit2 u) { /* ���� ���� */ }	
}

// �������̽��� ���, static�޼���, ����Ʈ�޼��尡 JDK1.8���� �߰��Ǿ���.


/*
 * �������̽��� �̿��� ������
 * 
 */

