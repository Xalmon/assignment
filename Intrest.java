public class Intrest{
	public static void main(String[] args){
	System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		int balance = 1000;
		double rate = 3.5;
		
		double interest = balance * (rate / 1200);
		
		System.out.println("The interest is " + interest);
		}
}
