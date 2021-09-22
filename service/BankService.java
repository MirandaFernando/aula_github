package service;

import model.Account;
import model.Client;

import java.util.ArrayList;
import java.util.List;

public class BankService {

	private List<Client> clients = new ArrayList<>();
    
	private List<Account> accounts = new ArrayList<>();
	
	Scanner read = new Scanner(System.in);
	private double saldo;

	public void createClient() {
		System.out.println("Cliente criado!");
	}

	public void createAccount() {
		System.out.println("Conta criada!");
	}

	public void checkBalance() {
		System.out.println("Seu saldo �: R$0,00");		
	}

	public void deposit(int id) {
		Acccount conta = this.buscarConta(id);
		Double Balance = conta.getBalance();
		Double value = 0.0;
		System.out.println("Valor do depósito: ");
		value = read.nextDouble();
		System.out.println("Realizando Depósito... " + value);
		conta.setBalance(value)
		System.out.println("Deposito efetuado!");
	}
	private Account buscarConta(int id){
		for (Account account : accounts) {
            if (account.getId() == id) {
                return account;
            }
        }
		return null;
	}

	public void withdraw() {
		System.out.println("Saque efetuado!");		
	}

	public void transfer() {
		System.out.println("Transferencia efetuada!");		
	}

	public void closeAccount() {
		System.out.println("Conta fechada!");		
	}

	public void generateTransactionReport() {
		System.out.println("Relat�rio de transa��es gerado!");		
	}

}
