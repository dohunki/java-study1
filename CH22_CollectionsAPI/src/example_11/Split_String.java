package example_11;

public class Split_String {
	public static void main(String[] args) {
		// split() 문자열 쪼개서 배열로 리턴
		String text1= "(CNN)&Four years after the death of Hugh Hefner,"
				+"some insiders are coming forward to share what they say was// the reality of life inside the Playboy empire."
				+"#includes interviews with colleagues, %executives, Playmates and $employees from all levels of the brand who share the full story ";
		String text2= "단순 패턴은 문자열을 있는 그대로 대응시키고자 할 때 사용됩니다. "
				+"예를 들어, abc라는 패턴은 문자열에서 정확히 'abc' 라는 문자들이 모두 함께 순서대로 나타나야 대응됩니다."
				+"위의 패턴은 Hi, do you know your abc's? 와 The latest airplane designs evolved from slabcraft."
				+"두가지 예에서 부분 문자열 'abc'에 대응될 것입니다.  'Grab crab' 이라는 문자열에서 'ab c' 라는 부분 문자열을 포함하고 있지만, 'abc'를 정확하게 포함하고 있지 않기 때문에 대응되지 않습니다";
		String[] words= text1.split("[^a-zA-Z]+ "); // [ ] : 정규표현식, 영문철자가 아닌 특수문자(스페이스, ., \) 같은 것들을 제외하고 출력
		String[] words2= text2.split("[^가-힣]+ ");
		
		for(String w : words) {
			if(w.length()< 3) { // 철자가 2개 이하는 제외
				continue;
			}
			System.out.println(w.toLowerCase()); // 소문자로 변환해서 출력
		}
		
		for(String w2 : words2) {
			if(w2.length()< 3) { // 철자가 2개 이하는 제외
				continue;
			}
			System.out.println(w2);
		}
	}

}
