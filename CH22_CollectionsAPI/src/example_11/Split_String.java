package example_11;

public class Split_String {
	public static void main(String[] args) {
		// split() ���ڿ� �ɰ��� �迭�� ����
		String text1= "(CNN)&Four years after the death of Hugh Hefner,"
				+"some insiders are coming forward to share what they say was// the reality of life inside the Playboy empire."
				+"#includes interviews with colleagues, %executives, Playmates and $employees from all levels of the brand who share the full story ";
		String text2= "�ܼ� ������ ���ڿ��� �ִ� �״�� ������Ű���� �� �� ���˴ϴ�. "
				+"���� ���, abc��� ������ ���ڿ����� ��Ȯ�� 'abc' ��� ���ڵ��� ��� �Բ� ������� ��Ÿ���� �����˴ϴ�."
				+"���� ������ Hi, do you know your abc's? �� The latest airplane designs evolved from slabcraft."
				+"�ΰ��� ������ �κ� ���ڿ� 'abc'�� ������ ���Դϴ�.  'Grab crab' �̶�� ���ڿ����� 'ab c' ��� �κ� ���ڿ��� �����ϰ� ������, 'abc'�� ��Ȯ�ϰ� �����ϰ� ���� �ʱ� ������ �������� �ʽ��ϴ�";
		String[] words= text1.split("[^a-zA-Z]+ "); // [ ] : ����ǥ����, ����ö�ڰ� �ƴ� Ư������(�����̽�, ., \) ���� �͵��� �����ϰ� ���
		String[] words2= text2.split("[^��-�R]+ ");
		
		for(String w : words) {
			if(w.length()< 3) { // ö�ڰ� 2�� ���ϴ� ����
				continue;
			}
			System.out.println(w.toLowerCase()); // �ҹ��ڷ� ��ȯ�ؼ� ���
		}
		
		for(String w2 : words2) {
			if(w2.length()< 3) { // ö�ڰ� 2�� ���ϴ� ����
				continue;
			}
			System.out.println(w2);
		}
	}

}
