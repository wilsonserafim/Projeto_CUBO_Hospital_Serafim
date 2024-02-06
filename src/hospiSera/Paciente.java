package hospiSera;

import java.util.ArrayList;

public class Paciente {
	private String nome, endereco, datanascimento, plano, nnome, nendereco, ndatanascimento, nplano;
	private int cpf, ncpf;
	
	
	private ArrayList<String> nomes = new ArrayList<>();
    private ArrayList<Integer> cpfs = new ArrayList<>();
    private ArrayList<String> enderecos = new ArrayList<>();
    private ArrayList<String> datasNascimento = new ArrayList<>();
    private ArrayList<String> planos = new ArrayList<>();

    public Paciente() {
        nomes.add("Jose Wilson Serafim");
        cpfs.add(00000000000);
        enderecos.add("Rua a, numero 845, Recife antigo - Recife - PE - CEP:555-11554");
        datasNascimento.add("04/02/1988");
        planos.add("Bradesco Top");
        
        nomes.add("Novo Paciente 1"); 
        cpfs.add(000000000001);
        enderecos.add("Avenida c, numero 456, Bairro Velho - Cidade - Estado - CEP:54321-876");
        datasNascimento.add("15/08/1985");
        planos.add("SulAmérica Saúde");
        
        nomes.add("Novo Paciente 2"); 
        cpfs.add(00000000002);
        enderecos.add("Avenida A, numero 900, Bairro Velho - Cidade - Estado - CEP:54321-000");
        datasNascimento.add("15/05/1990");
        planos.add("Unimed");
        
        nomes.add("Novo Paciente 3"); 
        cpfs.add(00000000003);
        enderecos.add("Avenida A, numero 900, Bairro Velho - Cidade - Estado - CEP:54321-000");
        datasNascimento.add("10/08/2000");
        planos.add("Unimed");
        
        nomes.add("Novo Paciente 4"); 
        cpfs.add(00000000004);
        enderecos.add("Avenida Brasil, numero 4781, Bairro Novo - Cidade - Estado - CEP:54100-000");
        datasNascimento.add("10/08/2000");
        planos.add("Mais Saude");
    }

    public void adicionarPaciente(String novoLogin, int novaSenha) {
    	nomes.add(nnome); 
        cpfs.add(ncpf);
        enderecos.add(nendereco);
        datasNascimento.add(ndatanascimento);
        planos.add(nplano);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}

	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}

	public String getNnome() {
		return nnome;
	}

	public void setNnome(String nnome) {
		this.nnome = nnome;
	}

	public String getNendereco() {
		return nendereco;
	}

	public void setNendereco(String nendereco) {
		this.nendereco = nendereco;
	}

	public String getNdatanascimento() {
		return ndatanascimento;
	}

	public void setNdatanascimento(String ndatanascimento) {
		this.ndatanascimento = ndatanascimento;
	}

	public String getNplano() {
		return nplano;
	}

	public void setNplano(String nplano) {
		this.nplano = nplano;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getNcpf() {
		return ncpf;
	}

	public void setNcpf(int ncpf) {
		this.ncpf = ncpf;
	}

	public ArrayList<String> getNomes() {
		return nomes;
	}

	public void setNomes(ArrayList<String> nomes) {
		this.nomes = nomes;
	}

	public ArrayList<Integer> getCpfs() {
		return cpfs;
	}

	public void setCpfs(ArrayList<Integer> cpfs) {
		this.cpfs = cpfs;
	}

	public ArrayList<String> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(ArrayList<String> enderecos) {
		this.enderecos = enderecos;
	}

	public ArrayList<String> getDatasNascimento() {
		return datasNascimento;
	}

	public void setDatasNascimento(ArrayList<String> datasNascimento) {
		this.datasNascimento = datasNascimento;
	}

	public ArrayList<String> getPlanos() {
		return planos;
	}

	public void setPlanos(ArrayList<String> planos) {
		this.planos = planos;
	} 

    
    
}
