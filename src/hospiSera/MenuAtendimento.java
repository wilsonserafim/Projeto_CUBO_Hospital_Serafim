package hospiSera;

import java.util.Scanner;

public class MenuAtendimento {
	Scanner sc = new Scanner(System.in);
	int escolha = 0, cpf;
	double valoritem, valortotal;
	String servicoItem, nome;

	public void MenuAtendime() {
		System.out.println("     BEM VINDO AO HOSPITAL SERAFIM     ");
		System.out.println("      ** MODULO DE ATENDIMENTO **     ");
		System.out.println("                                        ");
		System.out.println("   DIGITE UM NUMERO E PRESSIONE ENTER ");
		System.out.println(" 1 - PARA ATENDER O PACIENTE ");
		System.out.println(" 2 - PARA VER OS ATENDIMENTOS");
		System.out.println(" 3 - PARA VOLTAR AO MENU ANTERIOR");
		System.out.println(" 4 - PARA SAIR");
		escolha = sc.nextInt();

		if (escolha == 1) {
			System.out.println("Informe o CPF do paciente:");
			cpf = sc.nextInt();
			System.out.println("Informe o serviço ou item");
			servicoItem = sc.next();
			for() {
				
			}
			

		} else if (escolha == 2) {

		} else if (escolha == 3) {

		} else if (escolha == 4) {

		} else if (escolha == 5) {

		} else {

		}

	}
}
