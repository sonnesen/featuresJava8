package stream;

public class Livro {

	private String nome;
	private int paginas;
	private double preco;

	public Livro(String nome, int paginas, double preco) {
		this.nome = nome;
		this.paginas = paginas;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public int getPaginas() {
		return paginas;
	}

	public double getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Livro [nome=");
		builder.append(nome);
		builder.append(", paginas=");
		builder.append(paginas);
		builder.append(", preco=");
		builder.append(preco);
		builder.append("]");
		return builder.toString();
	}

}
