package cse360assign2;
/**
 * Analytics testing class. 
 * @author Mohammed Manik (pin: 34)
 * @version 1.0
 */
public class TestAnalytics {

   	/**
    	*driver class for the analytics class.
     	*/
	public static void main()
	{
        Analytics myList = new Analytics();

        myList.insert(3);
        myList.insert(2);
        myList.insert(4);
        
        myList.print();
        

	System.out.println("mean:");        
        System.out.println(myList.mean());

	System.out.println("median:");
        System.out.println(myList.median());

	System.out.println("highest:");
        System.out.println(myList.high());

	System.out.println("lowest:");
        System.out.println(myList.low());

	System.out.println("number of integers:");
        System.out.println(myList.numInts());
		
	}
	
	
}
