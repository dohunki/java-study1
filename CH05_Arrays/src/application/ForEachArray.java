package application;

public class ForEachArray {

	public static void main(String[] args) {
		// �迭�� ����� �� �ִ� �ݺ��� for each
		// ������ �迭�� �ݺ����� for each���� ����ϰ� �ε��� ��ȣ�� �ʿ��� ��� for���� ���
		String[] fruits= {"�ٳ���", "���", "����"};
		int[] n= {1, 2, 3};
		boolean[] b= {true, true, true};
		double[] d= {1.1, 2.2, 3.3, 4.4};
		
		for(String x: fruits) { // for each���� (���� : �迭)
			System.out.println(x+ " ");
		}
		
		for(int x: n) { 
			System.out.println(x+ " ");
		}
		
		for(boolean x: b) { 
			System.out.println(x+ " ");
		}
		
		for(double x: d) {
			System.out.println(x+ " ");
		}

	}

}
