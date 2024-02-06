package hospiSera;

import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	int escolha = 0 ;
	
	public void MenuPrincipal() {
		MenuUsuario mnus = new MenuUsuario();
		System.out.println("     BEM VINDO AO HOSPITAL SERAFIM     ");
		System.out.println("   AQUI VOCÊ É ATENDIDO PELOS ANJOS     ");
		System.out.println("                                        ");
		System.out.println("   DIGITE UM NUMERO E PRESSIONE ENTER ");
		System.out.println(" 1 - PARA ATENDIMENTO ");
		System.out.println(" 2 - PARA PACIENTE");
		System.out.println(" 3 - PARA FORNECEDOR ");
		System.out.println(" 4 - PARA USUARIO ");
		System.out.println(" 5 - PARA SAIR ");
		System.out.print(" OPÇÃO: ");
		escolha =  sc.nextInt();
		
		if(escolha == 1) {
			System.out.println("\nIndo para Tela de atendimento...\n");
			
			
		}else if(escolha == 2) {
			
		}else if(escolha == 3) {
			
		}else if(escolha == 4) {
			mnus.MenuUsuario();
			
		}else if(escolha == 5) {
			
		}else {
			System.out.println("Opção invalida! \n");
			MenuPrincipal();
		}
	}

}
