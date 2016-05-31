package cse360assign2;

/**
 * extended OrderedIntList. 
 * @author Mohammed Manik (pin: 34)
 * @version 1.0
 */
public class Analytics extends OrderedIntList{
    	/**
     	*
     	* This method gets the mean of the elements in list
     	* @return returns -1 if list is empty, else returns the mean of the elements in list
     	*/
	public float mean()
	{
		if(count == 0)
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
	
    	/**
     	*
     	* This method gets the median of the elements in list
     	* @return returns -1 if list is empty, else returns the median of the elements in list
     	*/
	public int median()
	{
		if(count == 0)
		{
			return -1;
		}
		else
		{
			return intArray[count / 2];				
		}
	}
	
    	/**
     	*
     	* This method gets the highest elements in list
     	* @return returns -1 if list is empty, else returns the highest elements in list
     	*/
	public int high()
	{
		if(count == 0)
		{
			return -1;
		}
		else
		{
			return intArray[count-1];				
		}
	}

    	/**
     	*
     	* This method gets the lowest elements in list
     	* @return returns -1 if list is empty, else returns the lowest elements in list
     	*/
	public int low()
	{
		if(count == 0)
		{
			return -1;
		}
		else
		{
			return intArray[0];				
		}
	}

    	/**
     	*
     	* This method gets the number of elements in list
     	* @return returns -1 if list is empty, else returns the number of elements in list
     	*/
	public int numInts()
	{
		if(count == 0)
		{
			return -1;
		}
		else
		{
			return count;				
		}
	}
	
}
