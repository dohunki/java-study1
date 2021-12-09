import java.util.Arrays;

public class Practise2 {
	public static void main(String[] args) {
		// 2���� �迭�� ����� �Է�
		int[][] score= new int[4][3];
		score[0][0]= 100; // �迭 score�� 1�� 1���� 100�� ����
		System.out.println(score[0][0]); // �迭 score�� 1�� 1���� ���� ���
		
		// 2���� �迭�� �ʱ�ȭ
		int[][] score2= new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
//		int[][] score2= {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}}; // new int[][]�� ������
		
		System.out.println(score2[3][2]);
		System.out.println(score2);
		System.out.println(score2[0]);
		System.out.println(score2[1]);
		System.out.println(score2[2]);
		System.out.println(score2[3]);
		System.out.println(Arrays.deepToString(score2));
		
		System.out.println();
		
		// ArraysŬ������ �迭 �ٷ��
		
		// �迭�� �񱳿� ���- equals(), toString()
		// ������ �迭���� deepToString()�� ���(�迭�� ��� ��Ҹ� ��������� ����)
		int[] arr= {0, 1, 2, 3, 4};
		int[][] arr2D= {{11, 12}, {21, 22}};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		System.out.println();
		
		// equals()�� �� �迭�� ����� ��� ��Ҹ� �豳�ؼ� ������ true, �ٸ��� false�� ��ȯ
		// ������ �迭���� deepEquals()�� ���
		String[][] str2D= new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		String[][] str2D2= new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		System.out.println();
		
		// copyOf()�� �迭 ��ü�� copyOfRange()�� �迭�� �Ϻθ� �����ؼ� ���ο� �迭�� ���� ��ȯ
		int[] arr1= {0, 1, 2, 3, 4};
		int[] arr2= Arrays.copyOf(arr1, arr1.length);
		int[] arr3= Arrays.copyOf(arr1, 3);
		int[] arr4= Arrays.copyOf(arr1, 7);
		int[] arr5= Arrays.copyOfRange(arr1, 2, 4);
		int[] arr6= Arrays.copyOfRange(arr1, 0, 7);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		System.out.println(Arrays.toString(arr6));
		
		System.out.println();
		
		// sort()�� �迭�� ������ �� ����Ѵ�.
		int[] arr7= {3, 2, 0, 1, 4};
		Arrays.sort(arr7);
		System.out.println(Arrays.toString(arr7));
		
		
		
	}
}
