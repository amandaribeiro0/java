package contaBancaria.controller;

import java.util.ArrayList;

import contaBancaria.model.Conta;
import contaBancaria.repository.ContaRepository;

public class ContaControler implements ContaRepository {

	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		// TODO Auto-generated method stub
		var conta = buscarNaCollection(numero);
		
		if(conta != null) {
			conta.visualizar();
		}else {
			System.out.println("Conta não foi encontrada!");
		}
	}

	@Override
	public void listarTodas() {
		// TODO Auto-generated method stub
		for (var conta : listaContas) {
			conta.visualizar();
		}
	}

	@Override
	public void cadastrar(Conta conta) {
		// TODO Auto-generated method stub
		listaContas.add(conta);
		System.out.println("A conta numero: " + conta.getNumero() + " foi criada com sucesso!");
	}

	@Override
	public void atualizar(Conta conta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub

	}

	// Metodos Auxiliares

	public int gerarNumero() {
		// TODO Auto-generated method stub
		return ++numero;
	}

	public Conta buscarNaCollection(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero) {
				return conta;
			}
		}return null;
	}
}