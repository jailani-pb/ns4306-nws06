package week05.slot01;

import week02.slot01.Cat;

public class TestAnimal {

	public static void main(String[] args) {
		Animal animal = new Lion("Steak", false);
		animal.eat();
		animal.makeNoise();
		animal = new Giraffe("Leaf", false);
		animal.eat();
		animal.makeNoise();
		animal = new Elephant("Banana", true);
		animal.eat();
		animal.makeNoise();
		
//		Playful playfulLion = new Lion("Lamb", false);
//		letsPlay(playfulLion);
		Playful playfulGiraffe = new Giraffe("Grass", true);
		letsPlay(playfulGiraffe);
		Playful playfulElephant = new Elephant("Bamboo", false);
		letsPlay(playfulElephant);
		Playful playfulCat = new Cat("ABC", 50, 50);
		letsPlay(playfulCat);
	}
	
	public static void letsPlay(Playful animal) {
		if(animal != null) {
			animal.play();
		}
	}
	
}
