package hospiSera;

import java.util.Scanner;

public class MenuFornecedor {
	Scanner sc = new Scanner(System.in);
	int escolha = 0;

	public void MenuForn() {
		System.out.println("     BEM VINDO AO HOSPITAL SERAFIM     ");
		System.out.println("   AQUI VOC� � ATENDIDO PELOS ANJOS     ");
		System.out.println("                                        ");
		System.out.println("   DIGITE UM NUMERO E PRESSIONE ENTER ");
		System.out.println(" 1 - PARA ATENDIMENTO ");
		System.out.println(" 2 - PARA PACIENTE");
		System.out.println(" 3 - PARA FORNECEDOR ");
		System.out.println(" 4 - PARA USUARIO ");
		System.out.println(" 5 - PARA SAIR ");
		System.out.print(" OP��O: ");
		escolha = sc.nextInt();

		if (escolha == 1) {
			System.out.println("\nIndo para Tela de atendimento...\n");

		} else if (escolha == 2) {

		} else if (escolha == 3) {

		} else if (escolha == 4) {

		} else if (escolha == 5) {

		} else {

		}

	}
}
