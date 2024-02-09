package hospiSera;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuUsuario {
	Scanner sc = new Scanner(System.in);
	String login;
	int escolha = 0, senha;

	Usuario us = new Usuario();
	Menu mn = new Menu();

	void MenuUsuarioLog() {
		System.out.println("\n     BEM VINDO AO HOSPITAL SERAFIM     ");
		System.out.println("            MENU DE USUARIO            ");
		System.out.println("                                        ");
		System.out.println("   DIGITE UM NUMERO E PRESSIONE ENTER ");
		System.out.println(" 1 - PARA CADASTRAR UM NOVO USUARIO ");
		System.out.println(" 2 - PARA LISTAR OS USUARIOS ");
		System.out.println(" 3 - PARA VOLTAR AO MENU ANTERIOR ");
		System.out.println(" 4 - PARA SAIR");
		System.out.print(" OPÇÃO: ");
		escolha = sc.nextInt();

		if (escolha == 1) {
			System.out.print("Digite o novo login: ");
			String novoLogin = sc.next();

			System.out.print("Digite a nova senha (como um número): ");
			int novaSenha = sc.nextInt();

			us.adicionarUsuario(novoLogin, novaSenha);

			System.out.println("Novo usuário adicionado com sucesso!\n\n");
			MenuUsuarioLog();
		} else if (escolha == 2) {
			ArrayList<String> logins = us.getLogins();
	        ArrayList<Integer> senhas = us.getSenhas();

	        for (int i = 0; i < logins.size(); i++) {
	        	System.out.println("#Login: " + logins.get(i));
	        	System.out.println("#Senha: " + senhas.get(i));
	        }
	        MenuUsuarioLog();
		}else if (escolha == 3) {
			mn.MenuPrincipal();

		}else if (escolha == 4) {
			System.out.println("Até logo");
		}else {
			System.out.println("Opção invalida! \n");
			MenuUsuarioLog();
		}

	}
}
