package game_2.objects_3;

public enum GameObject {
	
	����, ����, ��;
	
	private int[][] comparison= {
			//				���� ����  ��
			/* ����(0) */ {	 0,	-1,	 1	},
			/* ����(1) */ {	 1,	 0,	-1	},
			/* �� (2) */ {	-1,	 1,	 0	}
	};
	// ����� (����,����,��)�� ���ؼ� ��� ����
	public int compare(GameObject ob) { // 3���� enum ��ü�� ��
		return comparison[this.ordinal()][ob.ordinal()]; // enum ���� ���ؼ� �ε�����ȣ�� ��
	}
	
}
