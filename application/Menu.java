package application;

import java.util.List;
import java.util.Scanner;

import service.BankService;

public class Menu {
	private String title;
	private List<String> options;
	private BankService bankService;

	public Menu(List<String> options) {
		this.title = "Menu";
		this.options = options;
	}

	public Menu(String title, List<String> options) {
		this.title = title;
		this.options = options;
	}

	public int getSelection() {
		int op = 0;
		while (op==0){
			System.out.println(title+"\n");
			int i=1;
			for (String option : options) {
				System.out.println(i++ + " - " + option);
			}

			System.out.println("Informe a opcao desejada. ");
			Scanner s = new Scanner(System.in);
			String str = s.nextLine();
			try {
				op = Integer.parseInt(str);
			}
			catch (NumberFormatException e) {
				op =0;
			}
			if (op>=i){
				System.out.println("Opcao errada!");
				op=0;
			}
			switch (op) {
				case 1: {
					bankService.createClient();
					break;
				}
				case 2: {
					System.out.println("Qual o nome do cliente?");
					String nome = s.nextLine();
					bankService.createAccount(nome);
					break;
				}
				case 3: {
					bankService.checkBalance();
					break;
				}
				case 4: {
					System.out.println("Deseja depositar em que conta?: ");
					int account = s.nextInt());
					bankService.deposit(account);
					break;
				}
				case 5: {
					System.out.println("Qual o numero da conta?");
					int conta = s.nextInt();
					s.nextLine();
					System.out.print("Quanto deseja sacar: ");
                    Double valor = s.nextDouble();
					s.nextLine();
					bankService.withdraw(valor, conta);
					break;
				}
				case 6: {
					bankService.transfer();
					break;
				}
				case 7: {
					bankService.closeAccount();
					break;
				}
				case 8: {
					bankService.generateTransactionReport();
					break;
				}
			}
				
			
			s.close();
		}
		return op;
	}
}
