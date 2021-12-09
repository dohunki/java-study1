
public class Ex5_9 {

	public static void main(String[] args) {
		int[][] scores2= {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
		};
		// °ú¸ñº° ÃÑÁ¡
		int korTotal= 0, engTotal= 0, mathTotal=0;
		System.out.println("¹øÈ£   ±¹¾î  ¿µ¾î  ¼öÇÐ   ÃÑÁ¡   Æò±Õ");
		System.out.println("==============================");
		
		for(int i= 0; i < scores2.length; i++) {
			int sum= 0; // °³ÀÎº° ÃÑÁ¡
			float avg= 0.0f; // °³ÀÎº° Æò±Õ
			
			korTotal+= scores2[i][0];
			engTotal+= scores2[i][1];
			mathTotal+= scores2[i][2];
			System.out.printf("%3d", i+1);
			
			for(int j= 0; j< scores2[i].length; j++) {
				sum+= scores2[i][j];
				System.out.printf("%5d", scores2[i][j]);				
			}
			
			avg= sum/(float)scores2[i].length; // Æò±Õ°è»ê
			System.out.printf("%5d %6.1f%n", sum, avg); // %n : ÁÙ¹Ù²Þ
			
		}

	System.out.println("==============================");
	System.out.printf("ÃÑÁ¡:%5d %4d %4d%n", korTotal, engTotal, mathTotal);
	}
}
