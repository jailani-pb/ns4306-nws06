package week03.slot03;

import java.util.Arrays;

import week02.slot01.Cat;

public class Person {

	Cat[] cats;
	String name;
	
	public Person(String name) {
		this(name, 5);
	}
	
	public Person(int maxCats) {
		this("Anonymous", maxCats);
	}
	
	public Person(String name, int maxCats) {
		this.name = name;
		if(maxCats <= 0) {
			maxCats = 1;
		}
		cats = new Cat[maxCats];
	}
	
	public boolean adopt(String catName, int catMood, int catHunger) {
		return this.adopt(new Cat(catName, catMood, catHunger));
	}
	
	public boolean adopt(Cat cat) {
		for(int i = 0; i < cats.length; i++) {
			if(cats[i] != null) {
				if(cats[i].name.equals(cat.name)) {
					return false;
				}
			}
		}		
		for(int i = 0; i < cats.length; i++) {
			if(cats[i] == null) {
				cats[i] = cat;
				return true;
			}
		}
		return false;
	}
	
	public boolean disown(String catName) {
		for(int i = 0; i < cats.length; i++) {
			if(cats[i] != null) {
				if(cats[i].name.equals(catName)) {
					cats[i] = null;
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Person [cats=" + Arrays.toString(cats) + ", name=" + name + "]";
	}
	
}






