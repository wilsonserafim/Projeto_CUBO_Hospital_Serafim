package hospiSera;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    Scanner sc = new Scanner(System.in);
    private int senha, senhaBD, senhaVL;
    private String login, loginBD, loginVL;

    Menu mn = new Menu();

    void entrar() {
        System.out.println("Informe seu login");
        login = sc.next();
        System.out.println("Informe sua senha");
        senha = sc.nextInt();
    }

    void validacao() {
        Usuario us = new Usuario();
        ArrayList<String> logins = us.getLogins();
        ArrayList<Integer> senhas = us.getSenhas();

        for (int i = 0; i < logins.size(); i++) {
            loginBD = logins.get(i);
            senhaBD = senhas.get(i);
            if (login.equals(loginBD) && senha == senhaBD) {
                loginVL = loginBD;
                senhaVL = senhaBD;
            }
        }

        if (login.equals(loginVL) && senha == senhaVL) {
            System.out.println("\nLogin realizado com sucesso...\n");
            mn.MenuPrincipal();
        } else {
            System.out.println("\nLogin ou senha incorretos\n");
            entrar();
            validacao();
        }
    }
}
