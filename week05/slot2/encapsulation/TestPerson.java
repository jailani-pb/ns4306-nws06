package week05.slot2.encapsulation;

public class TestPerson {

	public static void main(String[] args) {
		Person person1 = new Person("Jailani", 80);
		System.out.println(person1.getName());
		System.out.println(person1.getAge());
//		person1.name = "Rahman";
//		person1.setName("Rahman");
//		person1.age = 80;
		person1.setAge(80);
		System.out.println(person1.getName());
		System.out.println(person1.getAge());
	}
	
}
