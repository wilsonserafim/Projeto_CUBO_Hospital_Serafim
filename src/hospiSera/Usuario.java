package hospiSera;

import java.util.ArrayList;

public class Usuario {
    private ArrayList<String> logins = new ArrayList<>();
    private ArrayList<Integer> senhas = new ArrayList<>();

    public Usuario() {
        logins.add("serafim");
        senhas.add(111);
        logins.add("debora");
        senhas.add(222);
        logins.add("gabi");
        senhas.add(333);
        logins.add("manoel");
        senhas.add(444);
        logins.add("dani");
        senhas.add(555);
        logins.add("admin");
        senhas.add(777);
    }

    public void adicionarUsuario(String novoLogin, int novaSenha) {
        logins.add(novoLogin);
        senhas.add(novaSenha);
    }

    public boolean autenticarUsuario(String inputLogin, int inputSenha) {
        int index = logins.indexOf(inputLogin);
        if (index != -1 && senhas.get(index) == inputSenha) {
            return true;
        }
        return false; 
    }

	public ArrayList<String> getLogins() {
		return logins;
	}

	public void setLogins(ArrayList<String> logins) {
		this.logins = logins;
	}

	public ArrayList<Integer> getSenhas() {
		return senhas;
	}

	public void setSenhas(ArrayList<Integer> senhas) {
		this.senhas = senhas;
	}
    
    
}