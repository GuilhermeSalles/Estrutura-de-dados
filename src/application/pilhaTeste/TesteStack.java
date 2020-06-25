package application.pilhaTeste;

import java.util.Stack;

public class TesteStack {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		
		System.out.println(stack.isEmpty());
		for(int i = 1; i<=10;i++) {
			stack.add(i);
		}
		
		System.out.println(stack);
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());
		System.out.println(stack);
		
		System.out.println();
		System.out.println("Desempilhando " + stack.pop());
		System.out.println(stack);
	}

}
