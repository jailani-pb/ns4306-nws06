package week06.slot02;

import java.util.Stack;

public class LearningStack {

	public static void main(String[] args) {
		Stack<String> actions = new Stack<String>();
		actions.push("Typed ABC");
		actions.push("Bold ABC");
		actions.push("Font Size: 18");
		
		System.out.println(actions);
		
		System.out.println(actions.peek());
		System.out.println(actions.peek());
		System.out.println(actions.peek());
		
		System.out.println(actions);
		
		while(!actions.isEmpty()) {
			System.out.println(actions.pop());
			System.out.println(actions);
		}
	}
	
}

