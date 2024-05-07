package practice3.model.vo;

import java.util.Random;

// true¸é Åä³¢
// false¸é ¸»ÀÌ µé¾î°¨
public class AnimalWorld {
	public static void main(String[] args) {
		// 5°³ Â¥¸® Animal Å¸ÀÔÀÇ °´Ã¼ ¹è¿­ »ý¼º
		Animal[] animals = new Animal[5];
		
		Random random = new Random();
		
		for(int i = 0; i < animals.length; i++) {
			if(random.nextBoolean()) {
				animals[i] = new Rabbit("Åä²¤ÀÌ" + (i+1), "Åä³¢", random.nextInt(20) + 1, "Èò»ö");
			} else {
				animals[i] = new Horse("ÈþÈþÀÌ" + (i+1), "¾ó·è¸»", "¿ì¸®Áý", "°¥»ö & °ËÁ¤»ö");
			}
		}
		// for - eacf ¹®À» »ç¿ëÇØ¼­
		for(Animal a : animals) {
			a.speak();
		}
	}
}
