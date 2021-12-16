/*
 * �������̽��� ����
 * -�������̽��� �߻�Ŭ����ó�� �� ��ü�δ� �ν��Ͻ��� ������ �� ������, �߻�Ŭ������ ����� ����
 *  �߻�޼��带 �ϼ��ϴ� ��ó��, �������̽��� implements�� �̿��� �ڽžȿ� ���ǵ� �߻�޼����� 
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
 * -�������̽��� �̸� ������ Ŭ������ �����̶� �� �� �����Ƿ� �ش� ������ Ÿ���� ���������� �̸� 
 *  ������ Ŭ������ �ν��Ͻ��� ������ �� �ֹǸ�, �������̽� Ÿ�������� ����ȯ�� �����ϴ�.
 * -�������̽� Fightable2�� Ŭ���� Fighter�� �������� ��, �Ʒ��� ���� Fighter �ν��Ͻ���
 *  Fightable2 Ÿ���� ���������� �����ϴ� ���� �����ϴ�.
 *  	Fightable2 f= (Fightable2)new Fighter();
 *    		�Ǵ�
 *  	Fightable2 f= new Fighter();
 *  ���� �������̽��� ������ ���� �޼����� �Ű������� Ÿ�����ε� ���� �� �ִ�.
 *  	void attack(Fightable2 f) {
 *  		// ...
 *  	}
 *  
 * -�������̽� Ÿ���� �Ű������� ���� �ǹ̴� �޼��� ȣ�� �� �ش� �������̽��� ������ Ŭ������ �ν��Ͻ���
 *  �Ű������� �����ؾ� �Ѵٴ� ���̴�.
 *   ����ü			�ڼհ�ü
 *	Unit u= 	  new Fighter();
 *	Fightable2 f= new Fighter();
 *	f.move(100, 200);
 *	f.attack(new Fighter());
 * �� �Ʒ��� ǥ���� ���� �����̴�.
 * 
 * class Fighter extends Unit implement Fightable2 { 
 * 		public void move(int x, int y)  { ���� ���� }
 * 		public void attack(Fightable2 f) { ���� ���� }
 *      // attack �޼���� �Ű������� Fightable2 �������̽��� ������ Ŭ������ �ν��Ͻ��� ����
 * }
 * 
 * ���� ���� Fightbale2 �������̽��� ������ FighterŬ������ ���� ��, attack�޼����� �Ű�������
 * Fighter �ν��Ͻ��� �Ѱ� �� �� �ִ�. ��, attack(new Fighter())�� ���� �� �� �ִ�.
 * �׸���, �Ʒ�ó�� �޼����� ����Ÿ������ �������̽��� �����ϴ� �͵� �����ϴ�.
 * 
 * Fightable2 method() { // Fightable2 �������̽��� ������ Ŭ������ �ν��Ͻ��� ��ȯ
 * 		...
 * 		Fighter f= new Fighter();
 * 		return f;		// Fightable2�� f�� ����ȯ ��ġ, �������̸� ������ ��ü�� ��ȯ
 * 		// ���� �� ������ return new Fighter(); �� �ٲܼ� �ִ�.
 * 		// Fighter ��ü��ȯ, Fightable2 ���� : ������
 * }
 * 
 * ���� �ڵ�� Fightable2 f= method(); �� ��ġ�Ѵ�.
 * 
 * ����Ÿ���� �������̽���� ���� �޼��尡 �ش� �������̽��� ������ Ŭ������ �ν��Ͻ��� ��ȯ�Ѵٴ� ���� �ǹ��Ѵ�.
 * 
 * ���� �ڵ忡���� method()�� ����Ÿ���� Fightable2 �������̽��̱� ������ �޼����� return������
 * Fightable2 �������̽��� ������ Fighter Ŭ������ �ν��Ͻ� �ּҸ� ��ȯ�Ѵ�.
 */



 
