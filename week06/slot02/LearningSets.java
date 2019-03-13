package week06.slot02;

import java.util.*;

public class LearningSets {

	public static void main(String[] args) {
		//[01-987654, 00-123456, 00-000789] HashSet
		//[00-123456, 00-000789, 01-987654] LinkedHashSet
		//[00-000789, 00-123456, 01-987654] TreeSet
//		HashSet<String> icNumbers = new HashSet<String>();
//		LinkedHashSet<String> icNumbers = new LinkedHashSet<String>();
		TreeSet<String> icNumbers = new TreeSet<String>();
		icNumbers.add("00-123456");
		icNumbers.add("00-000789");
		icNumbers.add("01-987654");
		
		System.out.println(icNumbers);
		
		icNumbers.add("00-123456");
		System.out.println(icNumbers);
		
		System.out.println(icNumbers.contains("00-000789"));
		System.out.println(icNumbers.contains("51-123456"));
		
		icNumbers.remove("00-123456");
		System.out.println(icNumbers);
		
		for(String ic : icNumbers) {
			System.out.println(ic);
		}
	}
	
}
