package hospiSera;

import java.util.Scanner;

public class Login {
	Scanner sc = new Scanner(System.in);
	private int senha, senhaBD, senhaVL;
	private String login, loginBD, loginVL;
	Usuario us = new Usuario();
	Menu mn = new Menu();

	void entrar() {
		System.out.println("Informe seu login");
		login = sc.next();
		System.out.println("Informe sua senha");
		senha = sc.nextInt();

	}

	void validacao() {
		for (int i = 0; i < us.login.length; i++) {
			loginBD = us.login[i];
			senhaBD = us.senha[i];
			if (login.equals(loginBD) && senha == senhaBD) {
				loginVL = loginBD;
				senhaVL = senhaBD;
			} else {
			}
		}
		if (login.equals(loginVL) && senha == senhaVL) {
			System.out.println("Login realizado com sucesso...");
			mn.Menu();

		} else {
			System.out.println("Login ou senha incorretos");
			entrar();
			validacao();
		}
	}
}
