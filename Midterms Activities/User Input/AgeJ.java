import javax.swing.JOptionPane;

public class AgeJ{
	public static void main(String[] args){

		int age;
		String input;
 
 		while(true){
 			try{
 					
 				input = (JOptionPane.showInputDialog(null, "Enter age:"));
 					
 				if(input == null)
 					
 					System.exit(0);
 						
 				else if(input != null){
 						
 					age = Integer.parseInt(input);
 					
					if (age <0 || age >122){
	 					JOptionPane.showMessageDialog(null, "Invalid Age!\nEnter Age Again!");
					}
           			else if (age <=3){
 				  		JOptionPane.showMessageDialog(null, "He/She is a Baby!");
   							break;
   					}
          			else if (age <=12){
 				 		JOptionPane.showMessageDialog(null, "He/She is a Child!");
  							break;
					}
             		else if (age <=19){
			    		JOptionPane.showMessageDialog(null, "He/She is a Teen!");
			     			break;
  					}
             		else if (age <=32){
  			   			JOptionPane.showMessageDialog(null, "He/She is a Young Adult!");
  			   	    		break;
  						}
            		else if (age <=45){
   						JOptionPane.showMessageDialog(null, "He/She is at Middle Age!");
  							break;
    				}
            		else if (age <=59){
 						JOptionPane.showMessageDialog(null, "He/She is an Adult!");
  							break;
  					}
             		else if (age <=122){
  						JOptionPane.showMessageDialog(null, "He/She is a Senior!");
 							break;
 					}			
 				}
 			}
   			  			    				
 				catch (Exception ex){
    				JOptionPane.showMessageDialog(null, "Invalid Input!\nEnter Age Again!");
    				
 				   			
 				}		
	  				  
		}

	}
	
}
