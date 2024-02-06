package hospiSera;

import java.util.ArrayList;
import java.util.Scanner;

public class Atendimento {
	Scanner sc = new Scanner(System.in);
	double valorAtendime, valortotal;
	String nomeAtendime, servicoItemAtendime, planoAtendime ;
	int cpfAtendime, cpfdb, codigoServicoItem, codigoAtendime, codigoServicoItemDB, qtdItem, escolhaMenuEmAtendime;
	
	Paciente pc = new Paciente();
	private ArrayList<String> nomes = pc.getNomes();
	private ArrayList<Integer> cpfs = pc.getCpfs();
	private ArrayList<String> enderecos = pc.getEnderecos();
	private ArrayList<String> datasNascimento = pc.getDatasNascimento();
	private ArrayList<String> planos = pc.getPlanos();
	
	ItensEServicos itsv = new ItensEServicos();
	private ArrayList<Integer> codigos = itsv.getCodigo();
	private ArrayList<String> servicoItensList = itsv.getServicoItens();
	private ArrayList<Double> valorItens = itsv.getValorItem();
	
	ArrayList<String> atendimentos = new ArrayList();
	
	void atendime() {
		MenuAtendimento mnat = new MenuAtendimento();
		System.out.println("Informe o CPF do paciente");
		cpfAtendime = sc.nextInt();
		
		for (int i = 0; i < cpfs.size(); i++) {
			cpfdb = cpfs.get(i);
			if (cpfAtendime == cpfdb) {
				codigoItem();				
			} else if (cpfAtendime == 1) {
				mnat.MenuAtendime();
			}else {
				System.out.println("          CPF invalido ou cliente não cadastrado");
				System.out.println("Digite o CPF correto ou 1 para voltar ao MENU de Atendimento\n");
				atendime();
			}
		}
	}
	void codigoItem() {
		MenuAtendimento mnat = new MenuAtendimento();
		System.out.println("Informe o codigo do serviço ou item");
		codigoServicoItem = sc.nextInt();
		for (int j = 0; j < codigos.size(); j++) {
			codigoServicoItemDB = codigos.get(j);
			if(codigoServicoItem == codigoServicoItemDB) {
				System.out.println("Infome a quantidade: ");
				qtdItem = sc.nextInt();

				valorAtendime = valorItens.get(j);
				valortotal = qtdItem * valorItens.get(j);
				nomeAtendime = nomes.get(j);
				servicoItemAtendime = servicoItensList.get(j);
				planoAtendime = planos.get(j);
				codigoAtendime = codigoAtendime + 1;
			
				System.out.println("Serviço adicionado com sucesso");
				registraAtendime();				
			}else {
				System.out.println("Código do item errado ou não cadastrado");
				codigoItem();
			}
		}
	}
	void registraAtendime() {
		atendimentos.add("CPF: " + cpfAtendime + "Nome do Paciente: " + nomeAtendime + "Código do Serviço ou item: " + codigoServicoItem + "Serviço ou Item: " + servicoItensList + "Valor unitário: " + valorItens + "Valor Total: " + valortotal );
		menuEmAtendime();
	}
	void menuEmAtendime() {
		MenuAtendimento mnat = new MenuAtendimento();
		System.out.println("Deseja inserir mais um item no atendimento?\n");
		System.out.println("Digite 1 e enter para inserir novo item");
		System.out.println("Digite 2 e enter para voltar ao menu anterior");
		System.out.println("Digite 3 para encerrar o Sistema");
		System.out.print("Escolha: ");
		escolhaMenuEmAtendime = sc.nextInt();
		if (escolhaMenuEmAtendime == 1) {
			codigoItem();
		}else if(escolhaMenuEmAtendime == 2) {
			mnat.MenuAtendime();
		}else if(escolhaMenuEmAtendime == 3) {
			System.out.println("ENCERRANDO O SISTEMA...");
		}else {
			System.out.println("Codigo incorreto digite novamente.");
			menuEmAtendime();
		}
	}
	public ArrayList<String> getAtendimentos() {
		return atendimentos;
	}
	public void setAtendimentos(ArrayList<String> atendimentos) {
		this.atendimentos = atendimentos;
	}
	
}
