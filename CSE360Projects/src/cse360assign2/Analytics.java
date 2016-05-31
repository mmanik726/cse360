package cse360assign2;

public class Analytics extends OrderedIntList{

	
	public int mean()
	{
		
		if(intArray.length == 0)
		{
			return -1;
		}
		else
		{
			
			int mean = 0;
			int sum = 0; 
			
			for (int i = 0; i < intArray.length; i++)
			{
				sum = sum + intArray[i];
			}
			
			mean = sum / intArray.length;
			
			return mean;
				
		}
	}
	
	public int median()
	{
		if(intArray.length == 0)
		{
			return -1;
		}
		else
		{
			return intArray[(int)Math.floor(intArray.length / 2)];				
		}
	}
	public int high()
	{
		if(intArray.length == 0)
		{
			return -1;
		}
		else
		{
			return intArray[(intArray.length -1)];				
		}
	}
	public int low()
	{
		if(intArray.length == 0)
		{
			return -1;
		}
		else
		{
			return intArray[0];				
		}
	}
	public int numInts()
	{
		if(intArray.length == 0)
		{
			return -1;
		}
		else
		{
			return intArray.length;				
		}
	}
	
}
