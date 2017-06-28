package lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class LambdasSample {

	// Palavra-chave: Interface funcional
	// Palavra-chave: Classe anonima vs lambda
	
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Java Como Programar");
		lista.add("Curso basico de Java");
		lista.add("Use a cabeca Java");
		
		// classe anonima
		lista.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});
		
		// lambda
		lista.forEach(s -> System.out.println(s));
		
		// classe anonima
		lista.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
		});
		
		// lambda
		lista.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));
		
		// classe anonima
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());				
			}
		});
		
		new Thread(() -> System.out.println(Thread.currentThread().getName()));

	}

}
