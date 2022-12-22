
// Class Account
public class Account {
	
	// static variable, i.e., shared among all instances of the class
	private static double annualInterestRate = 0;
	// non-static variable, i.e., different for each object
	private double balance;
	
	// Constructor sets the initial balance to 0
	public Account() {
		balance = 0.0;
	}
	
	/**
	 * Returns the current balance of each account object
	 * @return balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * Calculates the monthly interest and adds it the current balance
	 */
	public void calculateMonthlyInterest() {
	      balance += balance * (annualInterestRate / 12.0);
	}
	
	/**
	 * Modify interest rate. New rate must be between 0 and 1
	 * @param newRate
	 */
	public static void modifyInterestRate(double newRate) {
		if (newRate >= 0 && newRate <= 1.0)
			annualInterestRate = newRate;
		else {
			System.out.println("rate must be 0.0-1.0");
			System.exit(1);
		}
	} 

	/**
	 * Method to deposit. Amount is added to current balance
	 * only if it is a positive number
	 * @param amount
	 */
	public void deposit(double amount) {
		if (amount >= 0)
			balance += amount;
	}
	/**
	 * Method to withdraw. Amount is withdrawn only if it
	 * is a positive number smaller equal than the current balance
	 * @param amount
	 */
	public void withdraw(double amount) {
		if (amount >= 0 && amount <= balance)
			balance -= amount;
	}
	/**
	 * String representation of the account object
	 */
	public String toString() {
		return String.format("$%.2f", balance);
	} 
	
}
