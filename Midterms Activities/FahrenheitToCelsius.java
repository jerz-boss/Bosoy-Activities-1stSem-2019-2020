import java.util.Scanner;
public class FahrenheitToCelsius{

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		double FTemp,CTemp;
		
		System.out.print("Enter Fahrenheit Temperature : ");
		FTemp = scnr.nextDouble();
		
		CTemp = ((FTemp - 32)*5)/9;
		System.out.println("Fahrenheit temperature is " + FTemp);
		System.out.println("It's conversion to Celsius is " + CTemp);
		
	}
}