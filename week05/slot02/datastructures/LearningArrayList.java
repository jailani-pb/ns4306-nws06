package week05.slot02.datastructures;

import java.util.ArrayList;

public class LearningArrayList {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Jailani");
		nameList.add("Rahman");
		nameList.add("Aji");
		nameList.add("Yusuf");
		nameList.add(0, "Mohammad");
		nameList.add(nameList.size(), "Abdul");
		
		System.out.println(nameList.get(0));
		System.out.println(nameList.get(nameList.size()-1));
		
		nameList.set(3, "Haji");
		
		nameList.remove(0);
		System.out.println(nameList.get(0));
		
		String tempName1 = nameList.get(1);
		String tempName2 = nameList.get(2);
		nameList.set(1, tempName2);
		nameList.set(2, tempName1);
		
		System.out.println(nameList);
		System.out.println(nameList.size());
	}
	
}
