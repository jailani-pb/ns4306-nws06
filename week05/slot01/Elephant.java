package week05.slot01;

public class Elephant extends Animal implements Playful, Angry {

	public Elephant(String fav_food, boolean hunger) {
		super(fav_food, hunger);
	}
	
	public void eat() {
		if(fav_food.equalsIgnoreCase("Banana")) {
			System.out.println("PAWOO! I am eating");
		} else {
			System.out.println("PAWOO! I don't like " + fav_food);
		}
	}

	@Override
	public void makeNoise() {
		System.out.println("PAWOO!");
	}

	@Override
	public void play() {
		System.out.println("PAWOO! I am playing.");
	}

}
