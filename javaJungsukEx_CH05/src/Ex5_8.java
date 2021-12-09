
public class Ex5_8 {

	public static void main(String[] args) {
		int[][] scores= {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40}
		};
		int sum= 0;
		
		for(int i= 0; i < scores.length; i++) {
			for(int j= 0; j < scores[i].length; j++) {
				System.out.printf("score[%d][%d]=%d%n", i, j, scores[i][j]);
				
				sum+= scores[i][j];
			}
		}
		System.out.println("sum="+ sum);
	}
}
