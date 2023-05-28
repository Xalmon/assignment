public class Bmi{
	public static void main(String[] args){
		System.out.print("Enter weight in pounds: ");
		double lbs = 95.5;
		System.out.print("Enter height in inches: ");
		double height = 50;
		
		double meters = height * 0.0254;
		double kilos = lbs * 0.45359237;
		
		double bmi = (kilos / Math.pow(meters, 2));
		
		System.out.println("BMI is " + bmi);
		
		 }
}
