package contaBancaria;

import java.util.Scanner;

import contaBancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		String titular;
		float saldo, limite, valor;

		while (true) {
			System.out.println(Cores.ANSI_BLACK_BACKGROUND+Cores.TEXT_PURPLE+"*********************************************************************");
			System.out.println("                          Banco da Amandinha                         ");
			System.out.println("*********************************************************************");
			System.out.println("            1 - Criar Conta                                          ");
			System.out.println("            2 - Listar todas as Contas                               ");
			System.out.println("            3 - Buscar Conta por Numero                              ");
			System.out.println("            4 - Atualizar Dados da Conta                             ");
			System.out.println("            5 - Apagar Conta                                         ");
			System.out.println("            6 - Sacar                                                ");
			System.out.println("            7 - Depositar                                            ");
			System.out.println("            8 - Transferir valores entre Contas                      ");
			System.out.println("            9 - Sair                                                 ");
			System.out.println("*********************************************************************");
			System.out.println(" Entre com a opção desejada:                                         ");
			System.out.println("                                                                     "+ Cores.TEXT_RESET);
			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nBanco da Amandinha - O seu dinheiro você perde aqui");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Criar Conta Corrente\n\n");
				System.out.println("Digite o Numero da Agência: ");
                agencia = leia.nextInt();
                System.out.println("Digite o Nome do Titular: ");
                leia.skip("\\R?");
                titular = leia.nextLine();

                do {
                    System.out.println("Digite o Tipo da Conta (1-CC ou 2-CP): ");
                    tipo = leia.nextInt();
                } while (tipo < 1 && tipo > 2);

                System.out.println("Digite o Saldo da Conta (R$): ");
                saldo = leia.nextFloat();

                switch (tipo) {
                case 1 -> {
                    System.out.println("Digite o Limite de Crédito (R$): ");
                    limite = leia.nextFloat();

                    // criar o objeto conta corrente
                }
                case 2 -> {
                    System.out.println("Digite o dia do Aniversario da Conta: ");
                    aniversario = leia.nextInt();

                    // criar o objeto conta poupanca
                }
                }
				break;
			case 2:
				System.out.println("Listar todas as Contas\n\n");
				break;
			case 3:
				System.out.println("Consultar dados da Conta - por número\n\n");
				break;
			case 4:
				System.out.println("Atualizar dados da Conta\n\n");
				break;
			case 5:
				System.out.println("Apagar a Conta\n\n");
				break;
			case 6:
				System.out.println("Saque\n\n");
				break;
			case 7:
				System.out.println("Depósito\n\n");
				break;
			case 8:
				System.out.println("Transferência entre Contas\n\n");
				break;
			default:
				System.out.println("\nOpção Inválida!");
				break;
			}
		}

	}

}
