import java.util.Scanner;

	public class Pound{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.printf(" Enter a number in pounds: ");
		double pounds = input.nextDouble();
		
		System.out.println(pounds + " pounds is " + (pounds * 0.454) + " kilograms");
		}
}
