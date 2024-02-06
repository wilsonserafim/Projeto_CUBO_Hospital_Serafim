package hospiSera;

import java.util.ArrayList;
import java.util.Scanner;

public class Atendimento {
	Scanner sc = new Scanner(System.in);
	double valoritem, valortotal;
	String servicoItem, nome;
	int cpfatendime, cpfdb, escolhacpf;
	
	private ArrayList<String> nomes = new ArrayList<>();
    private ArrayList<Integer> cpfs = new ArrayList<>();
    private ArrayList<String> enderecos = new ArrayList<>();
    private ArrayList<String> datasNascimento = new ArrayList<>();
    private ArrayList<String> planos = new ArrayList<>();
	
	void atendime(){
		System.out.println("Informe o CPF do paciente");
		cpfatendime = sc.nextInt();
		Paciente pc = new Paciente();
		for (int i = 0; i < cpfs.size(); i++) {
			cpfdb = cpfs.get(i);
            if (cpfdb == cpfs.get(i)) {
                System.out.println("Informe o serviço ou item");
                servicoItem = sc.next();
            }else {
            	System.out.println("CPF invalido, Digite 1 para tentar novamente ou 2 para cadastrar o Paciente");
            	escolhacpf = sc.nextInt();
            	if(escolhacpf == 1) {
            		atendime();
            	}else if(escolhacpf == 2){
            		//ir para o cadastro do paciente
            	}else {
            		System.out.println("Código invalido");
            	}
            }
		
	    
	}
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
