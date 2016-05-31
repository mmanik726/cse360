package cse360assign2;

public class Analytics extends OrderedIntList{

	
	public float mean()
	{
		
		if(intArray.length == 0)
		{
			return -1;
		}
		else
		{
			//float totalCount = intArray.length;
			
			float mean = 0;
			float sum = 0; 
			
			for (int i = 0; i < count; i++)
			{
				sum = sum + intArray[i];
			}
			
			mean = sum / count;
			
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
			return intArray[count / 2];				
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
			return intArray[count-1];				
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
			return count;				
		}
	}
	
}
