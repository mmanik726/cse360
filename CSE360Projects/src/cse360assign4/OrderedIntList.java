package cse360assign4;

/**
 * New Ordered list of numbers with additional methods
 * @author Mohammed Manik (pin: 34)
 * @version 1.0
 */





//TODO:
//3. Generate the initial set of junit test cases. All should have the default of fail.
//4. Complete the code for your test cases. Create new methods as needed for the tests. Your
//tests should not have any if statements, loops or output. Use the asserts to check the results.
//Thoroughly test your code.
//5. Make sure that all the code meets all coding and documentation standards. The junit test
//cases should include internal documentation while the OrderedIntList.java file should contain
//external documentation.
//6. Submit the following files for grading
//	a. Your documented OrderedIntListTest.java file.
//	b. Your documented OrderedIntList.java file.









public class OrderedIntList
{
    private int[] intArray;
    private int count;

    /*
     * original constructor
     */
    OrderedIntList()
    {
        intArray = new int[10];
        count = 0;
    }
    
    

    /*
     * overloaded constructor with size parameter
     */
    OrderedIntList(int size) //constructor now accepts param of size
    {
        intArray = new int[size]; //capacity of list
        count = 0;
    }

    /**
    *
    * returns the length of the list, i.e the actual element count and not total capacity
    */
    private int length()
    {
    	//TODO:
    	//i. The size is determined by the number of elements in the list, not the size of the array.
    	//ii. The method must have the following signature.
    	//public int length ()
    	return count;
    }
    
    
    /**
    *performs a binary search of the list for an item
    * @param key The number to search for from the list.
    */
    public int search(int key)
    {
    	//return binSearchList(key, 0, intArray.length - 1);
    	return binSearchList(key, 0, count - 1);
    }
    
    /**
    *
    * private helper method for the binary search algorithm
    */
    private int binSearchList(int key, int low, int high)
    {
    	//implements recursive binary search of list
    	//This must be a recursive implementation of the binary search.
    	//In this case, multiple returns from the method are acceptable.
    	//If the key is not in the array, then the method should return -1, not throw an exception.
    	
    	if (low > high)
    		return -1;
    	
    	int mid = (low + high) / 2;
    	
    	if(key < intArray[mid])
    	{
    		return binSearchList(key, low, mid -1 );
    	}else if (key > intArray[mid]){
    		return binSearchList(key, mid + 1, high);
    	}else{
    		//return intArray[mid];
    		return mid; //return index of the element found in array
    	}
    }
    
    
    /**
    *
    * @param key The number to be deleted from the list.
    */
    public void delete(int key)
    {
    	//search for item in the list first
    	//delete item if exists and move all other items up the list to fill void
    	//"size of array (total capacity) will not change" 
    	
    	int foundIndex = search(key); //first search for item

    	if (foundIndex != -1) //item found
    	{
    		//delete, shift left  
    		for (int index = foundIndex; index < count; index++ )
    		{
    			int temp = intArray[index + 1];
    			intArray[index] = temp;
    		}
    		count--; //reduce count of elements
    	}else{
    		System.out.println("Item not found in list for deletion");
    	}
    }
    
    
    /**
    *
    * @param inputNum the number to be inserted into the list. The number gets placed in ascending order. duplicates NOT allowed
    */
    public void insert(int inputNum)
    {
    	//TODO: 
    	//insert should continue to insert in ascending order
    	//duplicates not allowed in list
    	//if list is full, insert new (if not duplicate), but drop last item
    	//"size of array (total capacity) will not change" 

    	//duplicates are not allowed. Insert only if item is not found in list
    	if (search(inputNum) != -1)
    		return;
       
        //add the first element if list is empty at the beginning
        if (count == 0)
        {
            intArray[0] = inputNum;
            count++;
        }else{
            //if the list is not empty

        	int indexOne = 0;

        	//boolean var to indicate if element has already been inserted into list
            boolean inserted = false;

            //loop while counter is less than element count and array size and element not yet inserted
            while (indexOne < count && indexOne < intArray.length && inserted == false)
            {
                if (inputNum < intArray[indexOne])
                {
                    int tempValue = intArray[indexOne];
                    
                    //insert the new element
                    intArray[indexOne] = inputNum;
                    
                    //shift elements to the right, starting from the very end of the array
                    for (int indexTwo = intArray.length - 1; indexTwo > indexOne; indexTwo--)
                    {
                        int tempValueTwo = intArray[indexTwo];
                        if (indexTwo + 1 < intArray.length)
                            intArray[indexTwo + 1] = tempValueTwo;
                    }
                    if (indexOne + 1 < intArray.length)
                        intArray[indexOne + 1] = tempValue;
                    inserted = true;
                }
                indexOne++;
            }

            //if item is not inserted and whole array has been traversed, the item must be the greatest. add to end
            if(inserted == false && count < intArray.length)
                intArray[count] = inputNum;

            //increment count if not already greater than the length of array
            if (count < intArray.length)
                count++;
        }
    }


    /**
    *
    * toString method to return the output as string
    */
    public String toString()
    {
    	//TODO:
    	//The format of the String returned must be the integers 
    	//in the array separated by a space as in â€œ1 2 3 4â€�. 
    	//There should be no space after the last integer.
    	//An empty array should yield an empty String, not a null value.
    	
    	String output = "";

    	for(int index = 0; index < count; index++)
    	{
    		if (index == count - 1)
    		{
    			output = output + intArray[index];
    		}else{
    			output = output + intArray[index] + " ";
    		}
    	}
    	
    	return output;
    }
    
    
    
}