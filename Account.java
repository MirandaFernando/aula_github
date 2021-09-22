import java.util.ArrayList;
import java.util.List;

public class Account {

	public static int idCount = 0;
	
	private int id;
	
	private Client client;
	
	private Double balance;
	
	private List<Transfer> transfer = new ArrayList<>();

	public Account(int id, Client client, Double balance) {
		this.id = idCount++;
		this.client = client;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public List<Transfer> getTransfer() {
		return transfer;
	}

	public void setTransfer(List<Transfer> transfer) {
		this.transfer = transfer;
	}
	
}