package exercicios.fila;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25PriorityQueue {

	public static void main(String[] args) {

		Queue<Pessoa> filaComPrioridade = new PriorityQueue<>(new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa p1, Pessoa p2) {
				return Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade());
			}
		});

		filaComPrioridade.add(new Pessoa("A", 2));
		filaComPrioridade.add(new Pessoa("B", 1));

		System.out.println(filaComPrioridade);

	}

}
