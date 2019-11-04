import javax.swing.JOptionPane;

public class Time{
	public static void main(String[] args){
		
		String input;
		int min1,hour,min2;
		String choice;
		boolean cond =true;
		do{

				input = (JOptionPane.showInputDialog("Enter minutes: "));
				
				if(input == null){
					System.exit(0);
				}
				else if(input != null){
					min1 = Integer.parseInt(input);
					
					hour = min1 / 60;
					min2 = min1 % 60;
					
					JOptionPane.showMessageDialog(null,min1 +" Minutes \nThere are "+hour+" hour/s and "+min2+" minute/s.");
				}
				choice = JOptionPane.showInputDialog("TRY AGAIN Y/N?");
					if(choice.equalsIgnoreCase("Y")){
						cond = true;
					}else
						System.exit(0);
			
		}while(true);
			
	}
		 
}

		
		
		
		
		
		
		
		