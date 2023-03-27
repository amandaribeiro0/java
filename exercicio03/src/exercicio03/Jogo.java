package exercicio03;

import java.time.LocalDate;

public class Jogo extends Produto {
	private int jodadores;

	public Jogo(int id, String nome, int versao, String produtora, LocalDate dataLancamento, float preco,
			int jodadores) {
		super(id, nome, versao, produtora, dataLancamento, preco);
		this.jodadores = jodadores;
	}

	public int getJodadores() {
		return jodadores;
	}

	public void setJodadores(int jodadores) {
		this.jodadores = jodadores;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.print("Quantidade de jogadores: " + this.jodadores);
	}
}
