package hospiSera;

import java.util.ArrayList;

public class ItensEServicos {
	private ArrayList<Integer> codigo = new ArrayList<>();
	private ArrayList<String> servicoItens = new ArrayList<>();
	private ArrayList<Double> valorItem = new ArrayList<>();
	
	void itensServicos() {
		codigo.add(1); servicoItens.add("Cirurgia de Emergência - Cardiologia"); valorItem.add(8000.0);
		codigo.add(2); servicoItens.add("Consulta Pediátrica"); valorItem.add(150.0);
		codigo.add(3); servicoItens.add("Tomografia Computadorizada"); valorItem.add(500.0);
		codigo.add(4); servicoItens.add("Exame de Sangue - Hemograma"); valorItem.add(80.0);
		codigo.add(5); servicoItens.add("Fisioterapia Respiratória"); valorItem.add(200.0);
		codigo.add(6); servicoItens.add("Quarto Privativo - Diária"); valorItem.add(400.0);
		codigo.add(7); servicoItens.add("Parto Normal com Obstetra"); valorItem.add(2500.0);
		codigo.add(8); servicoItens.add("Endoscopia Digestiva Alta"); valorItem.add(600.0);
		codigo.add(9); servicoItens.add("Ressonância Magnética"); valorItem.add(700.0);
		codigo.add(10); servicoItens.add("Consulta de Ortopedia"); valorItem.add(180.0);
	}

	public ArrayList<Integer> getCodigo() {
		return codigo;
	}

	public void setCodigo(ArrayList<Integer> codigo) {
		this.codigo = codigo;
	}

	public ArrayList<String> getServicoItens() {
		return servicoItens;
	}

	public void setServicoItens(ArrayList<String> servicoItens) {
		this.servicoItens = servicoItens;
	}

	public ArrayList<Double> getValorItem() {
		return valorItem;
	}

	public void setValorItem(ArrayList<Double> valorItem) {
		this.valorItem = valorItem;
	}
	
}
