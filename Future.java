import java.util.Scanner;
	
	public class Future{
		public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
			
			
			System.out.print(" Enter investment amount: " );
			double investmentAmount = input.nextDouble();
			
			System.out.print(" Enter Annual Interst rate in percentage: ");
			double annualInterestRate = input.nextDouble();
			
		
			System.out.print(" Enter number of years: ");
			double years = input.nextDouble();
			
			double monthlyInterestRate = annualInterestRate / 1200;
		
		 double futureInvestmentValue = investmentAmount *  Math.pow(( 1 + monthlyInterestRate), (years * 12));
		 
		 System.out.printf( "Accumlated Value = %.2f%n",  futureInvestmentValue);
		 
			
		
		}

}
