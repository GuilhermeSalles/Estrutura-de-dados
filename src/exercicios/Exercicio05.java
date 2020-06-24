package exercicios;

import java.util.ArrayList;

import entities.vetor.Lista;

public class Exercicio05 {

	public static void main(String[] args) {

		System.out.println("with ArrayList");
		ArrayList<String> Array = new ArrayList<String>(5);
		
		Array.add("A");
		Array.add("B");
		Array.add("C");
		Array.add("D");
		Array.add("E");
		Array.add("F");
		
		System.out.println(Array);
		
		Array.clear();
		
		System.out.println(Array);
		
		System.out.println("with class lista");
		Lista<String> lista = new Lista<String>(5);

		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");
		lista.adiciona("F");

		System.out.println(lista);
		
		lista.limpar();
		
		System.out.println(lista);
		
	}

}
