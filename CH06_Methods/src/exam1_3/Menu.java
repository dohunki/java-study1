package exam1_3;

public class Menu {
	String[] options = { "������ ����", "������ �߰�", "������ ����", "����" };

	void display() { // �ɼ� �޴����� ����Ѵ�.
		for (int i = 0; i < options.length; i++) {
			System.out.printf("%d. %s \n", i, options[i]);
		}
	}
}
