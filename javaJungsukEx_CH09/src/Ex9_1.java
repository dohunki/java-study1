public class Ex9_1 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);	

		if (v1.equals(v2))
			System.out.println("v1�� v2�� �����ϴ�.");
		else
			System.out.println("v1�� v2�� �ٸ��ϴ�.");
	} // main
} 

class Value {
	int value;

	Value(int value) {
		this.value = value;
	}
	
	/*
	 * -ObjectŬ������ ���ǵǾ� �ִ� equals�޼����� ��������-
	 * 	public boolean equals(Object obj) {
	 * 		return (this==obj);
	 * 	}
	 */
	
	// �ּҸ� ������ ����ȯ
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