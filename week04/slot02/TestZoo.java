package week04.slot02;

import week04.slot01.*;

public class TestZoo {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.adopt(new Lion("Steak", false));
		zoo.adopt(new Elephant("Onion", true));
		zoo.adopt(new Giraffe("Leaf", false));
		System.out.println(zoo);
		
		zoo.animals[0].eat();
		zoo.animals[1].eat();
		zoo.animals[2].eat();
		
		zoo.letsPlay(0);
		zoo.letsPlay(1);
		zoo.letsPlay(2);
	}
	
}





