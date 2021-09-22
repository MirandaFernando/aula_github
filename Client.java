public class Client {

	public static int idCount = 0;
	
	private int id;
	
	private String name;
	
	private Account account;

	public Client(String name, Account account) {
		this.id = idCount++;
		this.name = name;
		this.account = account;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
}
