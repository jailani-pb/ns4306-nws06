package week02.slot01;

public class TestCat {

	public static void main(String[] args) {
		Cat cat1 = new Cat("ABC", 4000, 50);
		Cat cat2 = new Cat("DEF", 20, 30);
		Cat cat3 = new Cat("GHI", 10, 20);
		
		System.out.println(cat1.moodLevel);
		System.out.println(cat1.hungerLevel);
		System.out.println(cat1.name);
		
		System.out.println(cat1.play(-100));

		System.out.println(cat1.moodLevel);
		System.out.println(cat1.hungerLevel);
		System.out.println(cat1.name);
		
//		System.out.println(cat2.moodLevel);
//		System.out.println(cat2.hungerLevel);
//		System.out.println(cat2.name);
//		
//		System.out.println(cat3.moodLevel);
//		System.out.println(cat3.hungerLevel);
//		System.out.println(cat3.name);
	}
	
}
