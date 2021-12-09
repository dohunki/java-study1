package example_11;

public class Split_String {
	public static void main(String[] args) {
		// split() ¹®ÀÚ¿­ ÂÉ°³¼­ ¹è¿­·Î ¸®ÅÏ
		String text1= "(CNN)&Four years after the death of Hugh Hefner,"
				+"some insiders are coming forward to share what they say was// the reality of life inside the Playboy empire."
				+"#includes interviews with colleagues, %executives, Playmates and $employees from all levels of the brand who share the full story ";
		String text2= "´Ü¼ø ÆĞÅÏÀº ¹®ÀÚ¿­À» ÀÖ´Â ±×´ë·Î ´ëÀÀ½ÃÅ°°íÀÚ ÇÒ ¶§ »ç¿ëµË´Ï´Ù. "
				+"¿¹¸¦ µé¾î, abc¶ó´Â ÆĞÅÏÀº ¹®ÀÚ¿­¿¡¼­ Á¤È®È÷ 'abc' ¶ó´Â ¹®ÀÚµéÀÌ ¸ğµÎ ÇÔ²² ¼ø¼­´ë·Î ³ªÅ¸³ª¾ß ´ëÀÀµË´Ï´Ù."
				+"À§ÀÇ ÆĞÅÏÀº Hi, do you know your abc's? ¿Í The latest airplane designs evolved from slabcraft."
				+"µÎ°¡Áö ¿¹¿¡¼­ ºÎºĞ ¹®ÀÚ¿­ 'abc'¿¡ ´ëÀÀµÉ °ÍÀÔ´Ï´Ù.  'Grab crab' ÀÌ¶ó´Â ¹®ÀÚ¿­¿¡¼­ 'ab c' ¶ó´Â ºÎºĞ ¹®ÀÚ¿­À» Æ÷ÇÔÇÏ°í ÀÖÁö¸¸, 'abc'¸¦ Á¤È®ÇÏ°Ô Æ÷ÇÔÇÏ°í ÀÖÁö ¾Ê±â ¶§¹®¿¡ ´ëÀÀµÇÁö ¾Ê½À´Ï´Ù";
		String[] words= text1.split("[^a-zA-Z]+ "); // [ ] : Á¤±ÔÇ¥Çö½Ä, ¿µ¹®Ã¶ÀÚ°¡ ¾Æ´Ñ Æ¯¼ö¹®ÀÚ(½ºÆäÀÌ½º, ., \) °°Àº °ÍµéÀ» Á¦¿ÜÇÏ°í Ãâ·Â
		String[] words2= text2.split("[^°¡-ÆR]+ ");
		
		for(String w : words) {
			if(w.length()< 3) { // Ã¶ÀÚ°¡ 2°³ ÀÌÇÏ´Â Á¦¿Ü
				continue;
			}
			System.out.println(w.toLowerCase()); // ¼Ò¹®ÀÚ·Î º¯È¯ÇØ¼­ Ãâ·Â
		}
		
		for(String w2 : words2) {
			if(w2.length()< 3) { // Ã¶ÀÚ°¡ 2°³ ÀÌÇÏ´Â Á¦¿Ü
				continue;
			}
			System.out.println(w2);
		}
	}

}
