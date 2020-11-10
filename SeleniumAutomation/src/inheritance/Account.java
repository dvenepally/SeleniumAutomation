package inheritance;

public class Account {

	// Methods without returning values (void method without any parameter)
	public void deposit() {
		System.out.println("Amount is deposited");
		System.out.println("Accont class is executed");
	}
	
	public void withdrawl() {
		System.out.println("Amount is withdrawn");
		System.out.println("Account class is executed");
	}
	
	// Overriding example
	// Methods with returning values
	public float getRateofInterest(float interest) {
		System.out.println("Rate of interest = " + interest);
		System.out.println("Account class is executed");
		return interest;
	}
	
	public static void main(String[] args) {
		// Creating the instance of object in order to access the variable 
		// classname objectname = new classname();
		
		Account obj = new Account();
		obj.deposit();
		obj.withdrawl();
		obj.getRateofInterest(5f);

	}

}
