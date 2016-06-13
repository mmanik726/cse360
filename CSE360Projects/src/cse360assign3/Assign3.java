package cse360assign3;

import java.util.ArrayList;
import java.util.Scanner;

public class Assign3 {

	
	public void readInt()
	{
		Scanner scanner = new Scanner(System.in);
		
		
		ArrayList<Integer> myInts = new ArrayList<>(); //=  new ArrayList<>();

		int myNums[] = new int[5];
		
		for (int i = 0; i< 5; i++)
		{
			System.out.println("Please enter an intger");
			int inputNum = scanner.nextInt();
			myNums[i] = inputNum;
			
		}
		

		System.out.println("You have entered: ");
		for (int i = 0; i< 5; i++)
		{

			System.out.println(myNums[i]);
			
		}
		
		//System.out.println(" Hello");
		
		scanner.close();
		
	}
	
	
}
