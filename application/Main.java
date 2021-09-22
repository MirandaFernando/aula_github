package application;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Menu mainMenu =  new Menu("Menu Principal", Arrays.asList("Cadastrar Cliente", 
				"Abrir Conta", "Consultar Saldo", "Realizar Deposito", "Realizar Saque", 
				"Realizar Transferencia", "Fechar Conta", "Gerar Relatorio de Transacoes"));
		System.out.println(mainMenu.getSelection() + "foi selecionada");
		System.out.println("Fim");
	}

}
