package week01.slot01;

public class TestPBStudent {

	public static void main(String[] args) {
		PBStudent student1 = new PBStudent();
		PBStudent student2 = new PBStudent();
		PBGroup group1 = new PBGroup();
		group1.id = "ABC01";
		group1.name = "Group 1 of ABC";
		group1.programme = "Diploma Level 5 in ABC";
		
		student1.id = "A01";
		student1.name = "Jailani";
		student1.group = group1;
		
		student2.id = "A02";
		student2.name = "Rahman";
		student2.group = group1;
		
		student1.goToSchool();
		student2.goToSchool();
	}
	
}
