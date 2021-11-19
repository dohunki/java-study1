package application;

public class MultiArray {

	public static void main(String[] args) {
		// 이중 배열 [][]
		String[][] texts= {
				{"하나", "둘", "셋"},
				{"넷", "다섯", "여섯"},
				{"일곱", "여덟", "아홉", "열"}
		};
		
		for (int i= 0; i< texts.length; i++) {
			String[] inArray= texts[i];
			System.out.printf("%d번째 배열 : %s\n", i, inArray);
			System.out.println(texts[i]);
			for(int j= 0; j< inArray.length; j++) {
				System.out.printf("%s\t", inArray[j]);
			}
			System.out.println();
		}

	}

}
