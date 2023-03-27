package contaBancaria.model;

public class ContaPoupanca extends Conta {
	private int aniversairo;

	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int aniversairo) {
		super(numero, agencia, tipo, titular, saldo);
		this.aniversairo = aniversairo;
	}

	public int getAniversairo() {
		return aniversairo;
	}

	public void setAniversairo(int aniversairo) {
		this.aniversairo = aniversairo;
	}
	
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Aniversario da conta: " + this.aniversairo);
	}
}
