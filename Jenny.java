import java.util.Scanner;

	public class Jenny{
		
		public static void main(String[] args){
			
		Scanner input = new Scanner(System.in);
		
		System.out.print(" enter number1: ");
		double number2 = input.nextInt();
		
		double number3 = 100;
		
		double number1 = Math.pow(number2, 2);
		
		
		System.out.println(number1);
		
		if (number1 == number3){
			System.out.printf("%.0f == %.0f, %n", number1, number3);
		}
		
		
		if (number1 != number3){
			System.out.printf("%.0f != %.0f, %n", number1, number3);
		}
		
		if (number1 < number3){
		System.out.printf("%.0f < %.0f, %n", number1, number3);
		}

		if (number1 > number3){
		System.out.printf("%.0f > %.0f, %n", number1, number3);
		}

		if (number1 <= number3){
		System.out.printf("%.0f <= %.0f, %n", number1, number3);
		}

		if (number1 >= number3){
		System.out.printf("%.0f >= %.0f, %n", number1, number3);
		}

	}
}
