abstract class Player { // �߻� Ŭ����(�̿ϼ� Ŭ����, �̿ϼ� ���赵)
	abstract void play(int pos); // �߻� �޼���(�̿ϼ� �޼���)
	abstract void stop(); // �߻� �޼���(����θ� �ְ� ������{}�� ���� �޼���
}

// �߻� Ŭ������ ����� ���� �ϼ��ؾ� ��ü ��������
class AudioPlayer extends Player {
	void play(int pos) {System.out.println(pos+ "��ġ���� play�մϴ�.");}
	void stop() {System.out.println("����� ����ϴ�.");}

}

public class PlayerTest {
	
	public static void main(String[] args) {
//		player p= new Player(); // ����. �߻� Ŭ������ ����� ���� �ϼ��ؾ� ��ü ��������
//		AudioPlayer ap= new AudioPlayer(); // ���������� �Ʒ��� ����� ����� ����.
		Player ap= new AudioPlayer(); // ������, Player�� �޼��尡 �߻�޼��������� ���� ȣ��Ǿ� �����Ǵ� ���� AudioPlayer �̴�.
		ap.play(100);
		ap.stop();
	}

}
