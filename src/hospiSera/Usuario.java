package hospiSera;

public class Usuario {
	private String nome, login, senha, cpf;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Usuario(String string, String string2, String string3, String string4) {
		
	}
	@Override
	public String toString() {
		return("Usuario: #Nome: " + nome + " #CPF: " + cpf + " #Login: " + login + "#Senha: " + senha );
	}

}
