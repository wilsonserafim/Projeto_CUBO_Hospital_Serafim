package hospiSera;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuFornecedor {
	Scanner sc = new Scanner(System.in);
	int escolha = 0;

	public void MenuForn() {
		Fornecedor fn = new Fornecedor();
		
		System.out.println(" \n    BEM VINDO AO HOSPITAL SERAFIM     ");
		System.out.println("     AQUI VOC� � ATENDIDO PELOS ANJOS     ");
		System.out.println("                                        ");
		System.out.println("   DIGITE UM NUMERO E PRESSIONE ENTER ");
		System.out.println(" 1 - PARA CADASTRAR UM FORNECEDOR ");
		System.out.println(" 2 - PARA LISTAR OS FORNECEDORES");
		System.out.println(" 3 - PARA VOLTAR AO MENU ANTERIOR");
		System.out.println(" 5 - PARA SAIR ");
		System.out.print(" OP��O: ");
		escolha = sc.nextInt();

		if (escolha == 1) {
			System.out.print("Digite o CNPJ: ");
			int ncnpj = sc.nextInt();
 
			System.out.print("Digite o C�digo: ");
			int ncodigo = sc.nextInt();

			System.out.print("Digite Raz�o Social: ");
			String nrazao = sc.next();
			
			System.out.print("Digite O endere�o completo: ");
			String nendereco = sc.next();

			fn.adicionarFornecedor(ncnpj, ncodigo, nrazao, nendereco);

			System.out.println("Novo usu�rio adicionado com sucesso!\n\n");
			MenuForn();			

		} else if (escolha == 2) {
			ArrayList<Integer> cnpj = fn.getCnpj();
			ArrayList<Integer> codigo = fn.getCodigo();
			ArrayList<String> razao = fn.getRazao();
		    ArrayList<String> endereco = fn.getEndereco();

		    for (int i = 0; i < cnpj.size(); i++) {
	        	System.out.println("\n#CNPJ: " + cnpj.get(i));
	        	System.out.println("#Codigo: " + codigo.get(i));
	        	System.out.println("#Raz�o: " + razao.get(i));
	        	System.out.println("#Endere�o: " + endereco.get(i) + "\n");
	        }
		    MenuForn();

		} else if (escolha == 3) {
			Menu mn = new Menu();
			mn.MenuPrincipal();
		} else if (escolha == 4) {
			System.out.println("SAINDO DO SISTEMA - AT� LOGO!!!");

		} else if (escolha == 5) {

		} else {

		}

	}
}
