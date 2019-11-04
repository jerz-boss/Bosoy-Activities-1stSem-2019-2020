c

public class Age{
	public static void main(String[] args) {
	  	
 		Scanner scan = new Scanner(System.in);

			int age;
 
 			while(true){
 				try{ 
 	
 					System.out.print("Enter valid age: ");
 					age = scan.nextInt();
	
					if (age <0 || age >122){
	 					System.out.println("Invalid Age!\nEnter Valid Age!");
					}
           			else if (age <=3){
						System.out.println("He/She is a Baby");
   						   break;
   					}
          			else if (age <=12){
 				 	   	System.out.println("He/She is a Child");
  						    break;
					}
             		else if (age <=19){
			     		System.out.println("He/She is a Teen");
			     			break;
  					}
             		else if (age <=32){
  			   	     	System.out.println("He/She is a Young Adult");
  			   	     	 	break;
  					}
            		else if (age <=45){
   					  System.out.println("He/She is at Middle Age");
  						    break;
    				}
            		else if (age <=59){
 					    System.out.println("He/She is an Adult");
  						    break;
  					}
             		else if (age <=122){
  						System.out.println("He/She is a Senior");
 							break;
   			  		}	    		
 				}	
 				catch (Exception ex){
    				System.out.println("Invalid Input!\nEnter Age Again!");
 				   			scan.next();
 				}		
 					  
		}

	}
	
}
