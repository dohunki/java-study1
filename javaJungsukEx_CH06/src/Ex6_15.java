class Ex6_15 {
	/*
	 * ����� �ʱ�ȭ�� ���� �迭 arr�� �����ϰ�, Ŭ���� �ʱ�ȭ ���� �̿��ؼ� �迭��
	 * �� ��ҵ��� random()�� ����ؼ� ������ ���� ä�쵵�� �Ѵ�.
	 */
	static int[] arr = new int[10]; // ����� �ʱ�ȭ

	static { // Ŭ���� �ʱ�ȭ ��
		for(int i=0;i<arr.length;i++) {
			// 1�� 10������ ������ ���� �迭 arr�� �����Ѵ�.
			arr[i] = (int)(Math.random()*10) + 1;
		}
	}

	public static void main(String args[]) {
		for(int i=0; i<arr.length;i++)
			System.out.println("arr["+i+"] :" + arr[i]);
	}
}