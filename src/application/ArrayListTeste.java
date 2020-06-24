package application;

import java.util.ArrayList;

public class ArrayListTeste {

	public static void main(String[] args) {
		ArrayList<String> Array = new ArrayList<String>(); 
		
		Array.add("A");
		Array.add("C");
		
		System.out.println(Array);
		
		Array.add(1, "B");
		
		System.out.println(Array);
		
		
		boolean existe = Array.contains("A");
		if(existe) {
			System.out.println("Elemento existe no Array!");
		} else {
			System.out.println("Elemento não existe no Array!");
		}
		
		int pos = Array.indexOf("B");
		if(pos > -1) {
			System.out.println("Elemento existe no Array, posição: " + pos);
		} else {
			System.out.println("Elemento não existe no Array, posição: " + pos);
		}
		
		
		System.out.println(Array.get(2));
		
		
		Array.remove(0);
		Array.remove("B");
		System.out.println(Array);
		
		System.out.println(Array.size());
	}

}
