package service;

import java.util.ArrayList;
import java.util.List;

import model.Account;
import model.Client;

public class BankService {

	private List<Client> clients = new ArrayList<>();
    private List<Account> accounts = new ArrayList<>();

	public void createClient() {
		System.out.println("Cliente criado!");
	}

	public void createAccount() {
		System.out.println("Conta criada!");
	}

	public void checkBalance() {
		System.out.println("Seu saldo �: R$0,00");		
	}

	public void deposit() {
		System.out.println("Deposito efetuado!");		
	}

	public void withdraw(Double valor, int id){
		Account conta = this.buscarConta(id);
		Double balance = conta.getBalance();
		if(balance >= valor){
			balance -= valor;
			conta.setBalance(balance);
			System.out.println("Sacado: " + valor);
			System.out.println("Novo saldo: " + conta.getBalance() + "\n");
		} else {
			System.out.println("Saldo insuficiente. Faça um depósito\n");
		}
		System.out.println("Saque efetuado!");		
	}

	private Account buscarConta(int id) {
		for (Account account : accounts) {
            if (account.getId() == id) {
                return account;
            }
        }
		return null;
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
