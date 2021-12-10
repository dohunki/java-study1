package example_11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Book_wordSet {
	public static void main(String[] args) {
		// å ��ü ������ �о �ܾ�� �и��� ����Ʈ�� �ֱ�
		// �̶� ����Ʈ�� �ܾ �ߺ� ���� �ʴ´�. ���ĺ� ������ ���� => TreeSet
		File dracula = new File("dracula.txt");
		File huck = new File("huck.txt");
		// C:\JAVA\java-study3\CH22_CollectionsAPI\dracula.txt
		System.out.println(dracula.exists()); // ������ �ִ��� Ȯ��
		System.out.println(huck.exists());
		
		TreeSet<String> draList = loadWords(dracula);
		TreeSet<String> huckList = loadWords(huck);

		System.out.println(draList.size());
		System.out.println(huckList.size()); //�ܾ��� ����

		displayWords(draList);
	}
	/**
	 * list �Է¹޾� �� �ȿ� �ܾ���� ����Ѵ�.
	 * @param list
	 */
	private static void displayWords(TreeSet<String> list) {
		int count = 0;
		for (String w : list) {
			System.out.printf("%-10s \t", w);
			count++;
			if (count == 6) {
				System.out.println();
				count = 0;
			}
		}
	}

	/**
	 * �Էµ� ������ �о �ܾ �����ؼ� �������� Ʈ���� ����Ʈ�� ����
	 * 
	 * @param file
	 * @return wordSet
	 */
	private static TreeSet<String> loadWords(File file) {
		TreeSet<String> wordSet = new TreeSet<>();
		// ���� �б�
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			// ���� �б�
			String line = null;
			// ���� �б�
			while ((line = reader.readLine()) != null) { // ������ ���� ���̻� ���ڰ� ������ null
				String[] words = line.split("[^a-zA-Z]+");
				// Ʈ���¿� �ܾ�� �и��ؼ� �Է��Ѵ�.(�ڵ� ���� �� �ߺ�����)
				for (String w : words) {
					if (w.length() < 6) {
						continue;
					}
					wordSet.add(w.toLowerCase()); // �ҹ��ڷ� �ܾ� �Է�
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� ������");
		} catch (IOException e) {
			System.out.println("������ ���� ����");
		}

		return wordSet;
	}

}