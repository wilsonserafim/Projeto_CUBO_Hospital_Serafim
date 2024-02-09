package hospiSera;

import java.util.ArrayList;

public class Paciente {

	ArrayList<String> nomes = new ArrayList<>();
    ArrayList<Integer> cpfs = new ArrayList<>();
    ArrayList<String> enderecos = new ArrayList<>();
    ArrayList<String> datasNascimento = new ArrayList<>();
    ArrayList<String> planos = new ArrayList<>();

    void MocarPaciente() {
        nomes.add("Jose Wilson Serafim");
        cpfs.add(0);
        enderecos.add("Rua a, numero 845, Recife antigo - Recife - PE - CEP:555-11554");
        datasNascimento.add("04/02/1988");
        planos.add("Bradesco Top");
        
        nomes.add("Novo Paciente 1"); 
        cpfs.add(1);
        enderecos.add("Avenida c, numero 456, Bairro Velho - Cidade - Estado - CEP:54321-876");
        datasNascimento.add("15/08/1985");
        planos.add("SulAmérica Saúde");
        
        nomes.add("Novo Paciente 2"); 
        cpfs.add(2);
        enderecos.add("Avenida A, numero 900, Bairro Velho - Cidade - Estado - CEP:54321-000");
        datasNascimento.add("15/05/1990");
        planos.add("Unimed");
        
        nomes.add("Novo Paciente 3"); 
        cpfs.add(3);
        enderecos.add("Avenida A, numero 900, Bairro Velho - Cidade - Estado - CEP:54321-000");
        datasNascimento.add("10/08/2000");
        planos.add("Unimed");
        
        nomes.add("Novo Paciente 4"); 
        cpfs.add(5);
        enderecos.add("Avenida Brasil, numero 4781, Bairro Novo - Cidade - Estado - CEP:54100-000");
        datasNascimento.add("10/08/2000");
        planos.add("Mais Saude");
    }

    public void adicionarPaciente(String nnome, int ncpf, String nendereco, String ndatanascimento, String nplano ) {
    	nomes.add(nnome); 
        cpfs.add(ncpf);
        enderecos.add(nendereco);
        datasNascimento.add(ndatanascimento);
        planos.add(nplano);
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
