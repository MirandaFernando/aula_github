package model;

public class Transfer {

	private Account accountIn;
	
	private Account accountOut;
	
	private Double amount;

	public Transfer(Account accountIn, Account accountOut, Double amount) {
		this.accountIn = accountIn;
		this.accountOut = accountOut;
		this.amount = amount;
	}

	public Account getAccountIn() {
		return accountIn;
	}

	public void setAccountIn(Account accountIn) {
		this.accountIn = accountIn;
	}

	public Account getAccountOut() {
		return accountOut;
	}

	public void setAccountOut(Account accountOut) {
		this.accountOut = accountOut;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	@Override
    public String toString() {
        return "Transfer [accountIn=" + accountIn + ", accountOut=" + accountOut + ", amount=" + amount + "]";
    }

}
