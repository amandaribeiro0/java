package aula_05;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Amanda");
		fila.add("Nicolle");
		
		for(var elemento: fila) {
			System.out.println(elemento);	
		}
		System.out.println("Retirar elemento: ");
		fila.poll();
		System.out.println(fila);
		
		fila.add("Katarina");
		System.out.println(fila);
		
		System.out.println(fila.size());
	}

}
