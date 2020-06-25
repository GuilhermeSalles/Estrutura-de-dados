package application.pilhaTeste;

import entities.vetor.Pilha;

public class TestePilha {

	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		
		System.out.println(pilha.estaVazia());
		for(int i = 1; i<=10;i++) {
			pilha.empilha(i);
		}
		
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
		System.out.println(pilha.estaVazia());
		System.out.println(pilha.topo());
		System.out.println(pilha);
		
		System.out.println();
		System.out.println("Desempilhando " + pilha.desempilha());
		System.out.println(pilha);

	}

}
