package cse360assign3;

/**
 * Read and show integers
 * @author Mohammed Manik (pin: 34)
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Assign3 {

	//method that reads and displays intgers 
	public void readAndShowInt()
	{
		Scanner scanner = new Scanner(System.in);
		
		
		ArrayList<Integer> myInts = new ArrayList<Integer>(); 		
		
		int repeats = -1;
		
		//get the number of repeats (must be from 1 to 5)
		while(repeats <= 0 || repeats > 5)
		{
			System.out.println("Please enter number of repeats (1 to 5 only)");
			repeats = scanner.nextInt();
		}
		
		//for the number of repeats get inputs and calculate min and max and show 
		for (int index = 0; index < repeats; index++)
		{
			System.out.println("\nIteration " + (index+1) + " of " + repeats);
			
			int curScannerInt;
			
			myInts.clear(); //clear the list for every iteration
			//while the input is not 0
			do
			{
				System.out.println("Please enter a interger, 0 to stop");
				curScannerInt = scanner.nextInt();
				if (curScannerInt != 0)
					myInts.add(curScannerInt);
			}while(curScannerInt != 0);
			
			//check to see if list is empty
			if (myInts.isEmpty())
			{
				System.out.println("Error: no numbers in current list");
			}else //display the min and max from the current list
			{
				System.out.println("\nMax:" + Collections.max(myInts));
				System.out.println("\nMin:" + Collections.min(myInts,null));
			}	
			
		}
			
		//close the scanner object to release resources
		scanner.close();
		
	}
	
	
}
