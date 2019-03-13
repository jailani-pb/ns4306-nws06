package week05.slot01;

public class Lion extends Animal implements Angry {

	public Lion(String fav_food, boolean hunger) {
		super(fav_food, hunger);
	}

	public void eat() {
		if(hunger == false) {
			System.out.println("ROAR! I am full.");
		} else {
			System.out.println("ROAR! I am eating.");
		}
	}

	@Override
	public String toString() {
		return "Lion [fav_food=" + fav_food + ", hunger=" + hunger + "]";
	}

	@Override
	public void makeNoise() {
		System.out.println("ROAR!!");
	}	

}
