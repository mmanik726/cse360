package cse360assign4;
/**
 * New OrderedIntList test class 
 * @author Mohammed Manik (pin: 34)
 * @version 1.0
 */



public class OrderedIntListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OrderedIntList myList = new OrderedIntList(10);
		
		myList.insert(3);
		myList.insert(3);
		myList.insert(2);
		myList.insert(9);
		myList.insert(2);
		
		System.out.println( myList.toString());
		
		//int test = myList.search(9);
		//myList.delete(6);
		
		System.out.println( myList.toString());
		
		
		
	}

}
