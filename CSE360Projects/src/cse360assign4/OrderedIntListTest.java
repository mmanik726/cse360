package cse360assign4;
/*
 * Junit test class for OrderedIntList class
 * @author Mohammed Manik (Pin 34)
 * 
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class OrderedIntListTest {

	@Test
	public void testOrderedIntList() {
		//fail("Not yet implemented");
		
		OrderedIntList myList = new OrderedIntList();
		
		//check if object is created with default constructor
		assertNotNull(myList);
		
		//check if the initial count is 0 
		assertEquals(0, myList.length());
		
	}

	@Test
	public void testOrderedIntListInt() {
		//fail("Not yet implemented");
		
		OrderedIntList myList = new OrderedIntList(8);
		
		//check if object is created with initial capacity passed to constructor
		assertNotNull(myList);
		
		//check if the initial count is 0 
		assertEquals(0, myList.length());
	}

	@Test
	public void testSearch() {
		//fail("Not yet implemented");
		
		//Tests for searching for an item that exists in list 
		OrderedIntList myListOne = new OrderedIntList(5);
		myListOne.insert(3);
		myListOne.insert(9);
		myListOne.insert(4);
		myListOne.insert(5);
		
		assertEquals(0, myListOne.search(3));//search for item 3, should return index 0
		assertEquals(1, myListOne.search(4));//search for item 4, should return index 1
		assertEquals(3, myListOne.search(9));//search for item 9, should return index 3
		
		
		//test search method, with item not in list
		assertEquals(-1, myListOne.search(50)); //50 not in list, should return -1
		assertEquals(-1, myListOne.search(100)); //100 not in list, should return -1
		
		
	}

	@Test
	public void testDelete() {
		//fail("Not yet implemented");
		
		//Tests for proper entry of items in list
		OrderedIntList myListOne = new OrderedIntList(5);
		myListOne.insert(3);
		myListOne.insert(9);
		myListOne.insert(4);
		myListOne.insert(5);
		
		
		//test length of list. count of items in list
		assertEquals(4, myListOne.length());
		//test the list items 
		assertEquals("3 4 5 9", myListOne.toString());
		
		
		//test deleting item if item exists, count should be 3 instead of 4 now
		myListOne.delete(4); //delete the item 4 from list
		assertEquals(3, myListOne.length());
		//new list should be "3 5 9" instead of "3 4 5 9". Items shift left when items delete
		assertEquals("3 5 9", myListOne.toString());
		
		//test deleting item if item does not exists list 
		myListOne.delete(50); //delete the item 50 from list
		assertEquals(3, myListOne.length()); //count should still be 3
		//list should be still be "3 5 9" instead of "3 4 5 9
		assertEquals("3 5 9", myListOne.toString());
		
		
		//test to delete item form empty list
		OrderedIntList myListTwo = new OrderedIntList(5); //create new test object
		assertEquals(0, myListTwo.length()); //test to check list is empty
		//no items inserted
		//perform delete
		myListTwo.delete(10); //no items in list. 10 does not exist in list
		assertEquals(0, myListTwo.length()); //test to check list is still empty
		assertEquals("", myListTwo.toString()); //test to check list is still empty
	}

	@Test
	public void testInsert() {
		//fail("Not yet implemented");

		//Tests for proper entry of items in list
		OrderedIntList myListOne = new OrderedIntList(5);
		myListOne.insert(3);
		myListOne.insert(9);
		myListOne.insert(4);
		myListOne.insert(5);
		assertEquals(4, myListOne.length());
		assertEquals("3 4 5 9", myListOne.toString());

		//Tests for duplicate entries in the list. 
		//Duplicates not allowed. so count is 4 instead of 5 for above insertion
		OrderedIntList myListTwo = new OrderedIntList(5);
		myListTwo.insert(3);
		myListTwo.insert(4);
		myListTwo.insert(3);
		myListTwo.insert(9);
		myListTwo.insert(2);
		assertEquals(4, myListTwo.length());
		assertEquals("2 3 4 9", myListTwo.toString());
		
		
		//test to see if items gets inserted not more than capacity
		//test: try to insert 5 items with a list capacity of 3
		OrderedIntList myListThree = new OrderedIntList(3);
		myListThree.insert(3);
		myListThree.insert(4);
		myListThree.insert(1);
		myListThree.insert(2);
		myListThree.insert(7);
		assertEquals(3, myListThree.length());
	}

	@Test
	public void testToString() {
		//fail("Not yet implemented");
		
		//test for the output string returned by toString method when list not empty 
		OrderedIntList myListOne = new OrderedIntList(5);
		myListOne.insert(3);
		myListOne.insert(4);
		myListOne.insert(2);
		assertEquals("2 3 4", myListOne.toString());
		
		//test for the output string returned by toString method when list is empty 
		OrderedIntList myListTwo = new OrderedIntList(5); 
		assertEquals(0, myListTwo.length()); //length is 0

		//check returned sting is empty since nothing in list
		assertEquals("", myListTwo.toString());	
		//string returned cannot be other than empty
		assertNotEquals("2 3 4", myListTwo.toString()); 
		
	}

}
