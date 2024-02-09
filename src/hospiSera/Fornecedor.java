package hospiSera;

import java.util.ArrayList;

public class Fornecedor {

	private ArrayList<Integer> cnpj = new ArrayList<>();
	private ArrayList<Integer> codigo = new ArrayList<>();
	private ArrayList<String> razao = new ArrayList<>();
    private ArrayList<String> endereco = new ArrayList<>();

    public Fornecedor() {
    	cnpj.add(123456789);
    	codigo.add(1);
    	razao.add("Roval");
    	endereco.add("Rua A, n678, bairro:Centro - Recife - PE CEP:4511-225");
    	
        cnpj.add(987654321);
        codigo.add(2);
        razao.add("Suprimentos Express");
        endereco.add("Avenida B, n123, bairro:Vila Nova - São Paulo - SP CEP:7890-543");

        cnpj.add(456789012);
        codigo.add(3);
        razao.add("TechPartners");
        endereco.add("Rua C, n45, bairro:Tecnopark - Brasília - DF CEP:6789-012");

        cnpj.add(654321789);
        codigo.add(4);
        razao.add("GreenFood");
        endereco.add("Avenida D, n876, bairro:VerdeVale - Belo Horizonte - MG CEP:3456-789");

        cnpj.add(789012345);
        codigo.add(5);
        razao.add("FashionStyle");
        endereco.add("Rua E, n234, bairro:ModaCenter - Rio de Janeiro - RJ CEP:5678-901");

        cnpj.add(210987654);
        codigo.add(6);
        razao.add("ConstruMateriais");
        endereco.add("Avenida F, n567, bairro:ConstruVille - Salvador - BA CEP:1234-567");

        cnpj.add(543210987);
        codigo.add(7);
        razao.add("SportsGear");
        endereco.add("Rua G, n890, bairro:EsporteTop - Fortaleza - CE CEP:8901-234");

        cnpj.add(876543210);
        codigo.add(8);
        razao.add("HealthCareSupplies");
        endereco.add("Avenida H, n123, bairro:SaúdeTotal - Porto Alegre - RS CEP:5678-901");

        cnpj.add(135792468);
        codigo.add(9);
        razao.add("HomeDecor");
        endereco.add("Rua I, n456, bairro:DecoraCasa - Curitiba - PR CEP:1234-567");

        cnpj.add(246813579);
        codigo.add(10);
        razao.add("AutoPartsCenter");
        endereco.add("Avenida J, n789, bairro:AutoVille - Florianópolis - SC CEP:5678-901");
    }

    public void adicionarFornecedor(int ncnpj, int ncodigo, String nrazao, String nendereco){
    	cnpj.add(ncnpj);
    	codigo.add(ncodigo);
    	razao.add(nrazao);
    	endereco.add(nendereco);
    }

	public ArrayList<Integer> getCnpj() {
		return cnpj;
	}

	public void setCnpj(ArrayList<Integer> cnpj) {
		this.cnpj = cnpj;
	}

	public ArrayList<Integer> getCodigo() {
		return codigo;
	}

	public void setCodigo(ArrayList<Integer> codigo) {
		this.codigo = codigo;
	}

	public ArrayList<String> getRazao() {
		return razao;
	}

	public void setRazao(ArrayList<String> razao) {
		this.razao = razao;
	}

	public ArrayList<String> getEndereco() {
		return endereco;
	}

	public void setEndereco(ArrayList<String> endereco) {
		this.endereco = endereco;
	}
    
    
}
