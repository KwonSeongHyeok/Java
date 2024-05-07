package com.kh.setEx;

import java.util.HashSet;

public class SetPre {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		// set.add »õ¿ì±ø °í·¡¹ä ²É°Ô¶û ¸Àµ¿»ê ¿ÀÂ¡¾î¶¥Äá ¾Ë»õ¿ìÄ¨ ²É°Ô¶û ²É°Ô¶û ²É°Ô¶û
		set.add("»õ¿ì±ø");
		set.add("°í·¡¹ä");
		set.add("²É°Ô¶û");
		set.add("¸Àµ¿»ê");
		set.add("¿ÀÂ¡¾î¶¥Äá");
		set.add("¾Ë»õ¿ìÄ¨");
		set.add("²É°Ô¶û");
		set.add("²É°Ô¶û");
		set.add("²É°Ô¶û");
		 
		System.out.println(set);
		
		System.out.println(set.size()); // Å©±â È®ÀÎ
		
		System.out.println(set.contains("¸Àµ¿»ê")); // contains »ç¿ëÇØ¼­ ¸Àµ¿»êÀÌ Á¸ÀçÇÏ´ÂÁö È®ÀÎ
		
		set.remove("°í·¡¹ä"); // Á¦°Å
		System.out.println(set.contains("°í·¡¹ä"));
		
		System.out.println(set);
		set.isEmpty(); //µ¥ÀÌÅÍ°¡ ¸ðµÎ Á¦°ÅµÇ¾ú´ÂÁö È®ÀÎ

		
		
		
		
	}
}
