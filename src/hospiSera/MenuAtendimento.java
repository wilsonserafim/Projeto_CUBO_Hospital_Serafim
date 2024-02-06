package hospiSera;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuAtendimento {
	Scanner sc = new Scanner(System.in);
	int escolha = 0, cpf;
	double valoritem, valortotal;
	String servicoItem, nome;

	public void MenuAtendime() {
		Atendimento at = new Atendimento();
		Menu mn = new Menu();
		ArrayList<String> atendimentos = at.getAtendimentos();
		
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
			at.atendime();
		} else if (escolha == 2) {
			for(int i = 0; i < atendimentos.size(); i++) {
				System.out.println(atendimentos.get(i));
			}
			MenuAtendime();
		} else if (escolha == 3) {
			mn.MenuPrincipal();
		} else if (escolha == 4) {
			System.out.println("Saindo do sistema...");
		} else {
			System.out.println("Código incorreto tente novamente\n");
			MenuAtendime();
		}

	}
}
