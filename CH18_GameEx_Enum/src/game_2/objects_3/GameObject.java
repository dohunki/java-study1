package game_2.objects_3;

public enum GameObject {
	
	가위, 바위, 보;
	
	private int[][] comparison= {
			//				가위 바위  보
			/* 가위(0) */ {	 0,	-1,	 1	},
			/* 바위(1) */ {	 1,	 0,	-1	},
			/* 보 (2) */ {	-1,	 1,	 0	}
	};
	// 상대의 (가위,바위,보)와 비교해서 결과 리턴
	public int compare(GameObject ob) { // 3개의 enum 객체를 비교
		return comparison[this.ordinal()][ob.ordinal()]; // enum 끼리 비교해서 인덱스번호를 비교
	}
	
}
