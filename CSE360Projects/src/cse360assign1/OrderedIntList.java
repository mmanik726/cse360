package cse360assign1;

/**
 * Ordered list of numbers. List size may grow depending on the number of items to insert
 * @author Mohammed Manik (pin: 34)
 * @version 1.0
 */


public class OrderedIntList
{
    private int[] intArray;
    private int count;

    OrderedIntList()
    {
        intArray = new int[10];
        count = 0;
    }


    /**
     *
     * @param inputNum the number to enter into the list. The number gets placed in ascending order. duplicates allowed
     */

    public void insert(int inputNum)
    {

        //grow the size of the array by twice the current size if element no more room for new element
        if (count == intArray.length) grow();

        //add the first element if list is empty at the beginning
        if (count == 0)
        {
            intArray[0] = inputNum;
            count++;
        } else {
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
     * this method increases the size of the array by twice and copies over the existing values
     */
    private void grow()
    {
        int[] tempArray = new int[count * 2];
        for (int i = 0; i < count; i++)
            tempArray[i] = intArray[i];
        intArray = tempArray;
    }


    /**
     * this method prints the array in orders of 5 in each line seperated by tab
     */

    public void print()
    {

        //if there are elements in list
        if (count > 0)
            System.out.print(intArray[0] + "\t");

        for (int i = 1; i < count; i++)
        {

            if (i % 5 == 0)
                System.out.println();

            System.out.print(intArray[i] + "\t");

        }
    }
}