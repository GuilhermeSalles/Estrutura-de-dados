package exercicios;

import entities.vetor.Lista;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");
		lista.adiciona("F");
		
		System.out.println(lista);
		
		lista.remove("A");
		System.out.println(lista);
		
		lista.remove("B");
		System.out.println(lista);
		
		lista.remove("F");
		System.out.println(lista);
	}

}
