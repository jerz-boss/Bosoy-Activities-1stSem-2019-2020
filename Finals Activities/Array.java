import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        

        int n = 8;

        int arr[]=new int[n];
        

        

        for(int e=1;e<n;e++){//for reading array
	        System.out.println("Employee#"+e);
	        System.out.print("Week gross "+e+":");
	        
			double gross =s.nextInt();
			double bonus = (gross*0.09);
			System.out.println("Week bonus "+e+":"+bonus);
			double total = (200+bonus);
			System.out.println("Week total "+e+":"+total);
			
				}
            
	             
	            	
            
     
        

        

    }

}