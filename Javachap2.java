import java.util.Scanner;

public class Javachap2{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);	
	
	System.out.print( " enter firstNumber: " );
	int firstNumber = input.nextInt();
	
	System.out.print( " enter secondNumber: " );
	int secondNumber = input.nextInt();
	
	double firstNumber = Math.pow(firstNumber, 2); 
	
	double secondNumber = Math.pow(secondNumber, 2);
	
	int firstNumber2 = firstNumber;
	
	int secondNumber2 = secondNumber;
	
	double sum = firstNumber2 - secondNumber2;
	System.out.print(sum);
	
	
	}
}
