package triAtleta;

public class TriAtletas  extends Pessoa implements Ciclista, Nadador, Corredor{

	public TriAtletas(String nome) {
		super(nome);
	}

	@Override
	public void aquecer() {
		System.out.println("Aquecendo...");
	}

	@Override
	public void correr() {
		System.out.println("Correndo...");
	}

	@Override
	public void nadar() {
		System.out.println("Nadando...");
	}

	@Override
	public void pedalar() {
		System.out.println("Pedalando...");
	}

	@Override
	public void cansar() {
		// TODO Auto-generated method stub
		System.out.println("Cansou...");
	}
	

}
