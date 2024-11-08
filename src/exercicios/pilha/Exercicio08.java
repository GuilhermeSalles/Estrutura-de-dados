package exercicios.pilha;

import java.util.Stack;

public class Exercicio08 {
	private static long numMov;
	public static void main(String[] args) {

		Stack<String> original = new Stack<>();
		Stack<String> dest = new Stack<>();
		Stack<String> aux = new Stack<>();
		
		original.push("|||");
		original.push("||");
		original.push("|");

		torreDeHanoi(original.size(), original, dest, aux);
		System.out.println("Movimentos: " + numMov);
	}

	public static void torreDeHanoi(int n, Stack<String> original, Stack<String> dest, Stack<String> aux) {

		if (n > 0) {
			numMov++;
			torreDeHanoi(n - 1, original, aux, dest);
			dest.push(original.pop());
			System.out.println("------");
			System.out.println("Original: " + original);
			System.out.println("Destino: " + dest);
			System.out.println("Aux: " + aux);
			torreDeHanoi(n - 1, aux, dest, original);
		}

	}

}
