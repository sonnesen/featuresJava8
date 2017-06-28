package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamSample {

//	Palavra-chave: interface fluente
	
	public static void main(String[] args) {
		List<Livro> livros = new ArrayList<>();
		livros.add(new Livro("Java Como Programar", 1000, 300.0));
		livros.add(new Livro("Curso basico de Java", 400, 250.0));
		livros.add(new Livro("Use a cabeca Java", 600, 120.0));

		livros.sort(Comparator.comparingInt(Livro::getPaginas));
		livros.forEach(System.out::println);
		
		System.out.println();
		
		livros.sort(Comparator.comparingDouble(Livro::getPreco));
		livros.forEach(System.out::println);
		
		System.out.println();

//		livros.forEach(livro -> System.out.println(livro.getNome() + " " + livro.getPaginas()));

		// filtrando livros com mais de 500 paginas
		livros.stream()
			.filter(livro -> livro.getPaginas() >= 500)
			.forEach(livro -> System.out.println(livro.getNome() + " " + livro.getPaginas()));

		// filtrando livros com menos de 500 paginas
		livros.stream()
			.filter(livro -> livro.getPaginas() <= 500)
			.map(Livro::getPaginas)
			.forEach(System.out::println);

		// somando o valor dos livros com mais de 500 paginas
		double total = livros.stream()
				.filter(livro -> livro.getPaginas() >= 500)
				.mapToDouble(Livro::getPreco)
				.sum();
		
		System.out.println(total);
		
		Optional<Livro> optionalLivro = livros.stream()
				.filter(livro -> livro.getPaginas() >= 500)
				.findFirst();
		
		Livro umLivro = optionalLivro.orElse(null);
		System.out.println(umLivro);
		
		livros.parallelStream()
			.filter(livro -> livro.getPaginas() >= 500)
			.findAny()
			.ifPresent(System.out::println);
	
		List<Livro> livrosComMaisDe500Paginas = livros.stream()
			.filter(livro -> livro.getPaginas() >= 500)
			.collect(Collectors.toList());
		
		System.out.println();
		System.out.println(livrosComMaisDe500Paginas);
		
//		Mais sobre a API de Stream
//		http://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html

	}

}
