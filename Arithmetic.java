import java.util.Scanner;

	public class Arithmetic{
	
		public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);	
	
			System.out.print(" enter firstInteger: ");
			double firstInteger = input.nextdouble();
			
			System.out.print(" enter secondInteger: ");
			double secondInteger = input.nextdouble();
	
			System.out.print(" enter thirdInteger: ");
			double thirdInteger = input.nextdouble();
			
			double sum = firstInteger + secondInteger + thirdInteger;
	
			System.out.print(sum);
	
			System.out.printf("%.0f, %.0f, %n", sum % 3);
	
	
	}
	
}
