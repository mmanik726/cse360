package cse360assign2;

public class TestAnalytics {

	public static void main()
	{
        Analytics myList = new Analytics();

        myList.insert(3);
        myList.insert(2);
        myList.insert(4);
        
        myList.print();
        
        
        System.out.println(myList.mean());
        System.out.println(myList.median());
        System.out.println(myList.high());
        System.out.println(myList.low());
        System.out.println(myList.numInts());
		
	}
	
	
}
