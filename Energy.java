public class Energy{
	public static void main(String[] args){
	System.out.print("Enter the amount of water in kilograms: ");
		double M = 55.5;
		System.out.print("Enter the initial temperature: ");
		double initialTemp = 3.5;
		System.out.print("Enter the final temperature: ");
		double finalTemp = 10.5;
		
		System.out.println("The energy needed is " + (M * (finalTemp - initialTemp) * 4184 ) );
	}
}
