
// Test/Driver class
public class AccountTest {
	
	//main method
	public static void main(String[] args) {
		//creating an Account object, i.e., myAccount
		Account myAccount = new Account();
		// calling instance method (shared by all objects of the class)
	    Account.modifyInterestRate(0.04);
	    
	    // depositing an initial amount
	    myAccount.deposit(1000);
	    
	    System.out.println("Monthly balances for one year at .04");
	    System.out.println("Balances:");
	    
	    // displaying the current balance for each month of the year
	    for (int month = 1; month <= 12; month++) {
	         String monthLabel = String.format("Month %d:", month);
	         myAccount.calculateMonthlyInterest();
	         System.out.printf("%s\t%s\n", monthLabel,
	            myAccount.toString());
	    } 
	    // making an withdrawal and displaying the updated balance
	    myAccount.withdraw(100);
	    System.out.printf("\nAfter withdrawal, current balance = %.2f", myAccount.getBalance());

	}


}
