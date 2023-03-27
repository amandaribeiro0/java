package exercicio02;

import java.time.LocalDate;

public class Funcionario {
	private int id;
	private String nome;
	private float salario;
	private String cargo;
	private String cpf;
	private LocalDate dataAdmissao;
	public Funcionario(int id, String nome, float salario, String cargo, String cpf, LocalDate dataAdmissao) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
		this.cpf = cpf;
		this.dataAdmissao = dataAdmissao;
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
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	public void visualizar() {
		System.out.println("Dados do Funcionario\n");
		System.out.println("*****************************");
		System.out.println("Id:" + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("Salario: " + this.salario);
		System.out.println("Cargo: " + this.cargo);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Data de Admissão: " + this.dataAdmissao);

	}
}
