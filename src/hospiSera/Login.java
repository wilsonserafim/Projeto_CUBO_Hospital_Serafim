package hospiSera;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {
	Scanner sc = new Scanner(System.in);
	String login, senha;
	int escolha = 0;
	Usuario usuario = new Usuario(null, null, null, null);
	Menu mn = new Menu();
	
	private List<Usuario> listaUsuario = new ArrayList<>();
	
	public void AddLogins() {
		listaUsuario.add(new Usuario("00000000000", "usuario", "usuario", "123"));
	}
	
	
	public void Login() {
		System.out.println("Para entrar no sistema informe os dados:");
		System.out.print("Login: ");
		login = sc.next();
		System.out.print("\nSenha: ");
		senha = sc.next();
		for()
	}

}
