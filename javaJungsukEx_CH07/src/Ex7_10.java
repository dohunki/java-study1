/*
 * �߻�Ŭ������ �ۼ�
 * -���� Ŭ������ ���������� ���� �� �ִ� Ŭ������ �ٷ� �ۼ��ϱ⵵ �ϰ�, ������ Ŭ������ �������� 
 *  �κ��� �̾Ƽ� �߻�Ŭ������ ����� ����ϱ⵵ �Ѵ�.
 * -����� �ڼ�Ŭ������ ����µ� ���� Ŭ������ ����ϴ� ���̶��, �߻�ȭ�� ������ Ŭ������ ����κ��� 
 *  �̾Ƴ��� ����Ŭ������ ����� ���̶� �� �� �ִ�.
 * -��Ӱ������� ���� ���������� Ŭ������ ���� ����� �߰��Ǿ� ��üȭ�� ������ ��������, ��Ӱ�������
 *  ���� �ö󰥼��� Ŭ������ �߻�ȭ�� ������ �������ٰ� �� �� �ִ�.
 */

/*
 * class Marine { // ����
 * 		int x, y;	// ���� ��ġ
 * 		void move(int x, int y) { // ������ ��ġ�� �̵� }
 * 		void stop() { // ���� ��ġ�� ���� }
 * 		void stimPack()	{ // �������� ����Ѵ�. }
 * }
 * 
 * class Tank { // ��ũ
 * 		int x, y;	// ���� ��ġ
 * 		void move(int x, int y) { // ������ ��ġ�� �̵� }
 * 		void stop() { // ���� ��ġ�� ���� }
 * 		void changeMode()	{ // ���ݸ�带 ��ȯ�Ѵ�. }
 * }
 * 
 * class Dropship { // ���ۼ�
 * 		int x, y;	// ���� ��ġ
 * 		void move(int x, int y) { // ������ ��ġ�� �̵� }
 * 		void stop() { // ���� ��ġ�� ���� }
 * 		void load()	{ // ���õ� ����� �¿��. }
 * 		void unload() { // ���õ� ����� ������. }
 * }	
 * 
 * �߻�޼��带 �̿��Ͽ� �Ʒ��� ���� �����ϰ� �ٲ۴�.
 */

public class Ex7_10 {
	public static void main(String[] args) {
		// Unit [] group= new Unit[3]; // ��ü�迭 : �������� ���� ��
		// group[0]= new Marine();
		// group[1]= new Tank();
		// group[2]= new Dropship();
		Unit[] group = { new Marine(), new Tank(), new Dropship() }; // ����+�ʱ�ȭ

		for (int i = 0; i < group.length; i++)
			group[i].move(100, 200);
		/* -UnitŬ������ �߻�޼����� move�� ȣ���ϴ� �� ���� �������� �����δ� �� �߻�޼��尡 ������
		 *  Marine, Tank, Dropship�ν��Ͻ��� �޼��尡 ȣ��Ǵ� ���̴�.
		 * -Unit ��� ObjectŬ���� Ÿ���� �迭�ε� ���� �ٸ� ������ �ν��Ͻ��� �ϳ��� ����
		 *   Object[] group = { new Marine(), new Tank(), new Dropship() } 
		 *  ���� �ٷ� �� ������, ObjectŬ�������� move�޼��尡 ���ǵǾ� ���� �ʱ� ������ move�޼��带 
		 *  ȣ���ϴ� �κ� group[i].move(100, 200); ���� ������ ����.
		 */ 
	}
}

abstract class Unit {
	int x, y;
	abstract void move(int x, int y); // �߻�޼���� move�� �־�� �������� move���߰� �����.
	void stop() { /* ���� ��ġ�� ���� */ }
}

class Marine extends Unit { // ����
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ",y=" + y + "]");
	}
	void stimPack() { /* �������� ����Ѵ�. */ }
}

class Tank extends Unit { // ��ũ
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ",y=" + y + "]");
	}
	void changeMode() { /* ���ݸ�带 ��ȯ�Ѵ�. */ }
}

class Dropship extends Unit { // ���ۼ�
	void move(int x, int y) {
		System.out.println("Dropship[x=" + x + ",y=" + y + "]");
	}
	void load()   { /* ���õ� ����� �¿��. */ }
	void unload() { /* ���õ� ����� ������. */ }
}
