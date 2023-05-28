public class Driving{
	public static void main(String[] args){
		System.out.print("Enter the driving distance: ");
		double distance = 900.5;
		System.out.print("Enter miles per gallon: ");
		double miles = 25.5;
		System.out.print("Enter price per gallon: ");
		double price = 3.55;
		
		double cost = (distance / miles) * price;
		
		System.out.println("The cost of driving is: $" + cost);
	}
}
