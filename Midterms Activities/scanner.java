import java.util.Scanner;

public class scanner{
      public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
      
      String name = "";
      int age = 0, weight = 0;
      int feet = 0, inches = 0;
      
      System.out.print("Enter your name:");
      name = sc.nextLine();
      System.out.print("Enter your age:"); 
      age = sc.nextInt();
      System.out.print("Enter your weight:");
      weight = sc.nextInt();
      System.out.println("Enter your height: " );
      System.out.print("Feet: ");
      feet = sc.nextInt();
      System.out.print("Inches: ");
      inches = sc.nextInt();
      System.out.println("My name is "+ name);
      System.out.println("My age is "+ age +" years old");
      System.out.println("My weight is "+ weight +"kilograms");
      System.out.println("My Height is "+ feet +"Feet and " + inches +"inches");
      
      }}
      
      
      
      
      
      
      
      
       
      