package hospiSera;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuPaciente {
	Scanner sc = new Scanner(System.in);
	String nnome, nendereco, ndatanascimento, nplano;
	int escolha, ncpf  = 0;
	
	void MenuPac() {
		    
		System.out.println("\n     BEM VINDO AO HOSPITAL SERAFIM     ");
		System.out.println("     AQUI VOCÊ É ATENDIDO PELOS ANJOS     ");
		System.out.println("                                        ");
		System.out.println("   DIGITE UM NUMERO E PRESSIONE ENTER ");
		System.out.println(" 1 - PARA CADASTRAR PACIENTE ");
		System.out.println(" 2 - PARA LISTAR OS PACIENTES");
		System.out.println(" 3 - PARA VOLTAR AO MENU ANTERIOR ");
		System.out.println(" 4 - PARA SAIR ");
		System.out.print(" OPÇÃO: ");
		escolha = sc.nextInt();

		if (escolha == 1) {
			
			System.out.print("Digite o Nome do Paciente: ");
			nnome = sc.next();
			System.out.print("Digite o CPF do Paciente: ");
			ncpf = sc.nextInt();
			System.out.print("Digite o Endereço do Paciente: ");
			nendereco = sc.next();
			System.out.print("Digite o Data de Nascimento do Paciente: ");
			ndatanascimento = sc.next();
			System.out.print("Digite o Plano do Paciente: ");
			nplano = sc.next();
			
			Paciente pc = new Paciente();
			pc.adicionarPaciente(nnome, ncpf, nendereco, ndatanascimento, nplano);

			System.out.println("\nNovo Paciente adicionado com sucesso!\n\n");
			MenuPac();

		} else if (escolha == 2) {
			Paciente pc = new Paciente();
			pc.MocarPaciente();
			ArrayList<String> nomes = pc.getNomes();
		    ArrayList<Integer> cpfs = pc.getCpfs();
		    ArrayList<String> enderecos = pc.getEnderecos();
		    ArrayList<String> datasNascimento = pc.getDatasNascimento();
		    ArrayList<String> planos = pc.getPlanos();

	        for (int i = 0; i < cpfs.size(); i++ ) {
	        	System.out.println("\n#Nome: " + nomes.get(i));
	        	System.out.println("#CPF: " + cpfs.get(i));
	        	System.out.println("#Endereço: " + enderecos.get(i));
	        	System.out.println("#Data Nascimento: " + datasNascimento.get(i));
	        	System.out.println("#Plano: " + planos.get(i));
	        }
			MenuPac();
		} else if (escolha == 3) {
			Menu mn = new Menu();
			mn.MenuPrincipal();
		} else if (escolha == 4) {
			System.out.println("Saindo do Sistema...");
		} else {
			System.out.println("Código invalido, tente novamente");
			MenuPac();
		}

	}
}
