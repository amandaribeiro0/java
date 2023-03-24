package exercicio03;

import java.time.LocalDate;

public class Produto {
	private int id;
	private String nome;
	private int versao;
	private float preco;
	private String produtora;
	private LocalDate dataLancamento;
	
	public Produto(int id, String nome, int versao, String produtora, LocalDate dataLancamento, float preco) {
		this.id = id;
		this.nome = nome;
		this.versao = versao;
		this.preco = preco;
		this.produtora = produtora;
		this.dataLancamento = dataLancamento;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVersao() {
		return versao;
	}
	public void setVersao(int versao) {
		this.versao = versao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getProdutora() {
		return produtora;
	}
	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}
	public LocalDate getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(LocalDate dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
	public void visualizar() {
		System.out.println("\n*****************************");
		System.out.println("\tDados do Produto\n");
		System.out.println("*****************************");
		System.out.println("\nId:" + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("Versão: " + this.versao);
		System.out.println("Produtora: " + this.produtora);
		System.out.println("Data de Lançamento: " + this.dataLancamento);
		System.out.println("Preço: " + this.preco);
		
	}
	
}
