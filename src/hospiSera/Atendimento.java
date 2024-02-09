package hospiSera;

import java.util.ArrayList;
import java.util.Scanner;

public class Atendimento {
	Paciente pc = new Paciente();
	MenuAtendimento mnat = new MenuAtendimento();


	Scanner sc = new Scanner(System.in);
	double valorAtendime, valortotal;
	String nomeAtendime, servicoItemAtendime, planoAtendime, novoAtendime; //Variaveis de uso local classe
	int cpfAtendime, cpfdb, codigoServicoItem, codigoAtendime, codigoServicoItemDB, qtdItem, escolhaMenuEmAtendime;

	ArrayList<String> atendimentos = new ArrayList<String>();//lista de atendimentos

	void atendime() {
		pc.MocarPaciente();
		
		ArrayList<String> nomes = pc.getNomes();
		ArrayList<Integer> cpfs = pc.getCpfs();
		ArrayList<String> planos = pc.getPlanos();
		
		System.out.println("Favor informar o CPF do paciente");
		cpfAtendime = sc.nextInt();
		boolean cpfEncontrado = false;

		for (int i = 0; i < cpfs.size(); i++) {
			if (cpfAtendime == cpfs.get(i)) {
				planoAtendime = planos.get(i);
				nomeAtendime = nomes.get(i);
				codigoItem();
				cpfEncontrado = true;
				break;
			}
		}

		if (!cpfEncontrado) {
			System.out.println("\nCPF inválido ou cliente não cadastrado\n");
			atendime();
		}
	}

	void codigoItem() {
		ItensEServicos itsv = new ItensEServicos();
		itsv.itensServicos();
		ArrayList<Integer> codigo = itsv.getCodigo();
		ArrayList<String> servicoItens = itsv.getServicoItens();
		ArrayList<Double> valorItem = itsv.getValorItem();
		
		System.out.println("Informe o codigo do serviço ou item");
		codigoServicoItem = sc.nextInt();

		for (int j = 0; j < codigo.size(); j++) {
			if (codigoServicoItem == codigo.get(j)) {
				System.out.println("Infome a quantidade: ");
				qtdItem = sc.nextInt();

				valorAtendime = valorItem.get(j);
				valortotal = qtdItem * valorItem.get(j);
				servicoItemAtendime = servicoItens.get(j);
				codigoAtendime = codigoAtendime + 1;

				System.out.println("Serviço adicionado com sucesso\n");
				registraAtendime();
			} else {
				System.out.println("Código do item errado ou não cadastrado");
				codigoItem();
			}
		}
	}

	void registraAtendime() {
		
		novoAtendime = "#CPF:" + cpfAtendime + " #Nome do Paciente:" + nomeAtendime + " #Código do Serviço ou item:"
				+ codigoServicoItem + " #Serviço ou Item:" + servicoItemAtendime + " #Valor unitário:R$" + valorAtendime
				+ " #Valor Total:R$" + valortotal ;
		atendimentos.add(novoAtendime);
		for(String atend : atendimentos) {
			System.out.println(atend);
			}
		mnat.MenuAtendime();
	}

	void listarAtendime() {

		System.out.println(atendimentos);
		for(int i = 0; i < atendimentos.size(); i++ ) {
			System.out.println(atendimentos.get(i));
		}		
		mnat.MenuAtendime();
	}

	public ArrayList<String> getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(ArrayList<String> atendimentos) {
		this.atendimentos = atendimentos;
	}

}
