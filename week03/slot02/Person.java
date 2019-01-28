package week03.slot02;

import java.util.Arrays;

import week02.slot01.Cat;

public class Person {

	Cat[] cats;
	String name;
	
	public Person(String personName, int maxCats) {
		name = personName;
		cats = new Cat[maxCats];
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






