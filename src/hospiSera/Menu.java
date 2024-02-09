package hospiSera;

import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	int escolha = 0 ;
	
	public void MenuPrincipal() {
		MenuUsuario mnus = new MenuUsuario();
		MenuAtendimento mnat = new MenuAtendimento();
		MenuPaciente mnpc = new MenuPaciente();
		MenuFornecedor mnfr = new MenuFornecedor();
		Paciente pc = new Paciente();
		
		System.out.println("     BEM VINDO AO HOSPITAL SERAFIM     ");
		System.out.println("   AQUI VOCÊ É ATENDIDO PELOS ANJOS     ");
		System.out.println("                                        ");
		System.out.println("   DIGITE UM NUMERO E PRESSIONE ENTER ");
		System.out.println(" 1 - PARA ATENDIMENTO ");
		System.out.println(" 2 - PARA PACIENTE");
		System.out.println(" 3 - PARA FORNECEDOR ");
		System.out.println(" 4 - PARA USUARIO ");
		System.out.println(" 5 - PARA SAIR ");
		System.out.println(" 6 - PARA MOCAR DADOS ");
		System.out.print(" OPÇÃO: ");
		escolha =  sc.nextInt();	
		if(escolha == 1) {
			System.out.println("\nIndo para Tela de atendimento...\n");
			mnat.MenuAtendime();			
		}else if(escolha == 2) {
			mnpc.MenuPac();
		}else if(escolha == 3) {
			mnfr.MenuForn();			
		}else if(escolha == 4) {
			mnus.MenuUsuarioLog();
		}else if(escolha == 5) {
			System.out.println("Saindo do Sistema, Até logo");
		}else if(escolha == 6) {
			pc.MocarPaciente();
			System.out.println("\n Paciente mocados\n");
			MenuPrincipal();
		}
		else {
			System.out.println("Opção invalida! \n");
			MenuPrincipal();
		}
	}
}
