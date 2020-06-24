package exercicios;

import java.util.ArrayList;

import entities.vetor.Lista;

public class Exercicio02 {

	public static void main(String[] args) {
		
		ArrayList<String> Array = new ArrayList<String>(5);
		
		Array.add("A");
		Array.add("B");
		Array.add("A");
		
		System.out.println(Array.lastIndexOf("A"));
		
		
		
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("A");
		
		System.out.println(lista.ultimoIndice("A"));
		
	}

}
