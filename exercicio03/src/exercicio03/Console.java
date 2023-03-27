package exercicio03;

import java.time.LocalDate;

public class Console extends Produto {
	private String console;

	public Console(int id, String nome, int versao, String produtora, LocalDate dataLancamento, float preco,
			String console) {
		super(id, nome, versao, produtora, dataLancamento, preco);
		this.console = console;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Console: " + this.console);
	}
}
