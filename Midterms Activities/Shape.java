import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Shape{

    public static void main(String[] args){
    	char shape = ' ';
    	double rad,side,length,width,base,height,area,pi = Math.PI; 
    	String r,s,l,w,b,h;
    	int input;
    	boolean cond1 = true; 
		
		DecimalFormat df= new DecimalFormat("#.##");
		
			do{
				shape =(JOptionPane.showInputDialog(null,"Enter shape\n\tC for Circle\n\tS for Square\n\tR for Rectangle\n\tT for Triangle","Simple Area Calculator :)", JOptionPane.INFORMATION_MESSAGE)).charAt(0);
				try{
					switch(shape){
					case 'C':
					case 'c':
						r = (JOptionPane.showInputDialog("Please enter a radius:"));
						rad = Double.parseDouble(r);
						area =pi * rad * rad;
						JOptionPane.showMessageDialog(null, "Area of the Circle is: " + df.format(area));
							break;
					case 'S':
					case 's':
						s = JOptionPane.showInputDialog("Enter the side:");
						side = Double.parseDouble(s);
						area = side * side;
						JOptionPane.showMessageDialog(null, "Area of the Square is: " + df.format(area));
							break;
					case 'R':
					case 'r':
						l = JOptionPane.showInputDialog("Enter the length:");
						length = Double.parseDouble(l);
						w = JOptionPane.showInputDialog("Enter the width:");
						width = Double.parseDouble(w);
						area = length * width;
						JOptionPane.showMessageDialog(null, "Area of the Rectangle is: " + df.format(area));
							break;
					case 'T':
					case 't':
						h = JOptionPane.showInputDialog("Enter the height:");
						height = Double.parseDouble(h);
						b = JOptionPane.showInputDialog("Enter the base:");
						base = Double.parseDouble(b);
						area = (height*base)/2;
						JOptionPane.showMessageDialog(null, "Area of the Triangle is: "+ df.format(area));
							break;
					default:
						JOptionPane.showMessageDialog(null,"            !Invalid Input!","Error!!!", JOptionPane.ERROR_MESSAGE);
					}
					
				}
				catch (NumberFormatException ex){
    				JOptionPane.showMessageDialog(null,"            !Invalid Input!","Error!!!", JOptionPane.ERROR_MESSAGE);
    				cond1 = true;
    			}
    			input = JOptionPane.showConfirmDialog(null,"Alt Y/N or CLICK","Try Again ?",JOptionPane.YES_NO_OPTION);
			}
            while (input == JOptionPane.YES_OPTION);      
            
	}
    
}

