
public class Main {
	public static void main(String[] args) {
		Bank bank = new Bank("Best Bank");
		
		bank.addBranch("Rostock");
		bank.addCustomer("Rostock", "Firat", 20.0);
		bank.addCustomer("Rostock", "Asdf", 18.5);
		bank.addCustomer("Rostock", "Fdsa", 15.23);
		
		bank.addBranch("Berlin");
		bank.addCustomer("Berlin", "lkjlkj", 540.2);
		
		bank.addCustomerTransaction("Rostock", "Firat", 234);
		bank.addCustomerTransaction("Rostock", "Firat", 12);
		bank.addCustomerTransaction("Rostock", "Asdf", 123);
		
		bank.listCustomers("Rostock", true);
		
	}
}
