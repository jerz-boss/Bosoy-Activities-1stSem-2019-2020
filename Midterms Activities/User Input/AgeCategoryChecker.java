import java.util.Scanner;

public class AgeCategoryChecker { 
  public static void main(String[] args) { 
 
    int age;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter age:  ");
    age = scan.nextInt();
    System.out.println("Age is " + age);
      
    if (age <0 || age >122){
    System.out.println(" Invalid Age");
       
    }else if (age <=3){ 
    System.out.println("He/She is Baby");
       
    }else if (age <=12){ 
    System.out.println("He/She is Child");
       
    }else if (age <=19){ 
    System.out.println("He/She is Teen");
       
    }else if (age <=32){ 
    System.out.println("He/She is Young Adult");
       
    }else if (age <=45){ 
    System.out.println("He/She is Middle Adult"); 
       
    }else if (age <=59){ 
    System.out.println("He/She is Adult");
       
    }else if (age <=122){
    System.out.println("He/She is Senior");
    }
       
  }
}
       
       
