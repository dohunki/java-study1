import java.util.Arrays;

public class Practise2 {
	public static void main(String[] args) {
		// 2차원 배열의 선언과 입력
		int[][] score= new int[4][3];
		score[0][0]= 100; // 배열 score의 1행 1열에 100을 저장
		System.out.println(score[0][0]); // 배열 score의 1행 1열의 값을 출력
		
		// 2차원 배열의 초기화
		int[][] score2= new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
//		int[][] score2= {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}}; // new int[][]가 생략됨
		
		System.out.println(score2[3][2]);
		System.out.println(score2);
		System.out.println(score2[0]);
		System.out.println(score2[1]);
		System.out.println(score2[2]);
		System.out.println(score2[3]);
		System.out.println(Arrays.deepToString(score2));
		
		System.out.println();
		
		// Arrays클래스로 배열 다루기
		
		// 배열의 비교와 출력- equals(), toString()
		// 다차원 배열에는 deepToString()을 사용(배열의 모든 요소를 재귀적으로 접근)
		int[] arr= {0, 1, 2, 3, 4};
		int[][] arr2D= {{11, 12}, {21, 22}};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		System.out.println();
		
		// equals()는 두 배열에 저장된 모든 요소를 배교해서 같으면 true, 다르면 false를 반환
		// 다차원 배열에는 deepEquals()를 사용
		String[][] str2D= new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		String[][] str2D2= new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		System.out.println();
		
		// copyOf()는 배열 전체를 copyOfRange()는 배열의 일부를 복사해서 새로운 배열을 만들어서 반환
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
		
		// sort()는 배열을 정렬할 때 사용한다.
		int[] arr7= {3, 2, 0, 1, 4};
		Arrays.sort(arr7);
		System.out.println(Arrays.toString(arr7));
		
		
		
	}
}
