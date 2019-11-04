import java.util.Scanner;
import java.lang.System;
import java.text.DecimalFormat;

public class ShapeArea{
	public static void main(String [] args){
		
	Scanner scan = new Scanner(System.in);
	
	char shape;
	double radius,side,height,width,base,area,pi = Math.PI;
	
	System.out.println("Input   C for Circle\n\tS for Square\n\tR for Rectangle\n\tT for Triangle");
	System.out.print("Choose shape you want to compute the area:");
	shape = scan.next().charAt(0);
	
	switch(shape){
	
		case 'C':
		case 'c':
			System.out.print("Enter radius:");
			radius = scan.nextDouble();
			area = pi*radius*radius;
			System.out.println("Area of the Circle is: "+area);
				break;
		case 'S':
		case 's':
			System.out.print("Enter side:");
			side = scan.nextDouble();
			area = side*side;
			System.out.println("Area of the Square is: "+area);
				break;
		case 'R':
		case 'r':
			System.out.print("Enter height:");
			height = scan.nextDouble();
			System.out.print("Enter width:");
			width = scan.nextDouble();
			area = height*width;
			System.out.println("Area of the Rectangle is: "+area);
				break;
		case 'T':
		case 't':
			System.out.print("Enter height:");
			height = scan.nextDouble();
			System.out.print("Enter base:");
			base = scan.nextDouble();
			area = (height*base)/2;
			System.out.println("Area of the Triangle is: "+area);
				break;
		default:
			System.out.println("Invalid Input!");
			
		
	}	
	}
}