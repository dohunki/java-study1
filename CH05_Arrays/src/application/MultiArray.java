package application;

public class MultiArray {

	public static void main(String[] args) {
		// ���� �迭 [][]
		String[][] texts= {
				{"�ϳ�", "��", "��"},
				{"��", "�ټ�", "����"},
				{"�ϰ�", "����", "��ȩ", "��"}
		};
		
		for (int i= 0; i< texts.length; i++) {
			String[] inArray= texts[i];
			System.out.printf("%d��° �迭 : %s\n", i, inArray);
			System.out.println(texts[i]);
			for(int j= 0; j< inArray.length; j++) {
				System.out.printf("%s\t", inArray[j]);
			}
			System.out.println();
		}

	}

}
