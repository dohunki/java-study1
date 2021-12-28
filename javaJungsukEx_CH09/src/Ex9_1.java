public class Ex9_1 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);	

		if (v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
	} // main
} 

class Value {
	int value;

	Value(int value) {
		this.value = value;
	}
	
	/*
	 * -Object클래스에 정의되어 있는 equals메서드의 실제내용-
	 * 	public boolean equals(Object obj) {
	 * 		return (this==obj);
	 * 	}
	 */
	
	// 주소를 값으로 형변환
	public boolean equals(Object obj) {
		if(!(obj instanceof Value))
			return false;
		else{
			Value v= (Value)obj;
			return this.value== v.value;
//			return this.value== ((Value)obj).value;	
		}
	}
	
}