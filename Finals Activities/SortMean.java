import java.util.Scanner;

public class SortMean{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		int sort,input;
		double sum = 0;
		double mean ;
	
		System.out.print("Enter the number of size of array:");
		
    	input = sc.nextInt();
		int [] elements = new int [input];
		//loop for getting Sum
		for(int i = 0; i < input;i++){
			System.out.print("Enter element["+ i +"]:");
			elements[i] = sc.nextInt();
			sum = sum+= elements[i];	
		}
		//printing the unsorted array
		System.out.print("Unsorted Arrays:  ");
		for(int i : elements) {
       		System.out.print(i+" ");
       	}	
		for(int i = 0; i < input;i++){
			//loop for sorting
			for(int j = 0; j < input;j++){
				if(elements[i]<elements[j]){
					sort = elements[i];
					elements[i] = elements [j];
					elements[j] = sort;
				}
			}
		}
		//printing the sorted array
		System.out.print("\nSorted Arrays:    ");
       	for(int i = 0; i < input;i++){
       		System.out.print(elements[i]+" ");
       	}
       	mean = sum/elements.length;
       	System.out.println("\nMean:"+ mean);			
	}			
	
}