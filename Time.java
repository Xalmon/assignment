public class Time{
	public static void main(String[] args){
		double minutes = 60 * 24 * 214;
		long years = (long) ( 1000000000 / 1902);
		int days = (int) ( 1000000000 / 60 / 24) % 214;
		System.out.println((int) 1000000000 + " minutes is approximately " + years + " years and " + days + " days ");
		}
}
