
public class Ex5_9 {

	public static void main(String[] args) {
		int[][] scores2= {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
		};
		// ���� ����
		int korTotal= 0, engTotal= 0, mathTotal=0;
		System.out.println("��ȣ   ����  ����  ����   ����   ���");
		System.out.println("==============================");
		
		for(int i= 0; i < scores2.length; i++) {
			int sum= 0; // ���κ� ����
			float avg= 0.0f; // ���κ� ���
			
			korTotal+= scores2[i][0];
			engTotal+= scores2[i][1];
			mathTotal+= scores2[i][2];
			System.out.printf("%3d", i+1);
			
			for(int j= 0; j< scores2[i].length; j++) {
				sum+= scores2[i][j];
				System.out.printf("%5d", scores2[i][j]);				
			}
			
			avg= sum/(float)scores2[i].length; // ��հ��
			System.out.printf("%5d %6.1f%n", sum, avg); // %n : �ٹٲ�
			
		}

	System.out.println("==============================");
	System.out.printf("����:%5d %4d %4d%n", korTotal, engTotal, mathTotal);
	}
}
