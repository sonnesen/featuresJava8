package methodreference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class MethodReferenceSample {

	// Palavra-chave: Lambdas mais enxutos
	
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Java Como Programar");
		lista.add("Curso basico de Java");
		lista.add("Use a cabeca Java");
		
//		lista.forEach(s -> System.out.println(s));
		lista.forEach(System.out::println);
		
//		Lista.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));
//		lista.sort(Comparator.comparing(new Function<String, Integer>() {
//			@Override
//			public Integer apply(String s) {
//				return s.length();
//			}
//		}));
//		lista.sort(Comparator.comparing(s -> s.length()));
		lista.sort(Comparator.comparing(String::length));
		
//		lista.forEach(s -> System.out.println(s));
		lista.forEach(System.out::println);
		
//		Nao e possivel usar method reference pois temos um metodo chamando outro metodo
		new Thread(() -> System.out.println(Thread.currentThread().getName()));
		
		Function<Usuario, String> minhaFuncao = u -> u.getNome();
		Function<Usuario, String> minhaOutraFuncao = Usuario::getNome;
	}
}
