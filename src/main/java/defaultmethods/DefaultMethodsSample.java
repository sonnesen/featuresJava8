package defaultmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsSample {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Java Como Programar");
		lista.add("Curso basico de Java");
		lista.add("Use a cabeca Java");
		
		// AJ8
		Collections.sort(lista);
		System.out.println(lista);
		
//		for (String string : lista) {
//			System.out.println(string);
//		}
		
		Collections.sort(lista, new MeuComparadorDeStrings());
		System.out.println(lista);
		
		// DJ8
		lista.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});
		
		lista.sort(new MeuComparadorDeStrings());
		
		System.out.println(lista);
	}

}
