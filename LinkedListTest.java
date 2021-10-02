import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class LinkedListTest {
	LinkedList ListObj = new LinkedList();

	@Before
	public void setUp() throws Exception {
		LinkedList ListObj = new LinkedList();
	}

	@Test
	public void PushFronttest() {
		ListObj.pushFront(2);
		assertEquals(2,ListObj.head.key);
		assertEquals(1,ListObj.size);
		ListObj.pushFront(5);
		ListObj.pushFront(6);
		ListObj.pushFront(7);
		int [] ExpectedList = {7,6,5};
		for(int i = 0 ;i < 3 ; i++)
		{
			assertEquals(ExpectedList[i] , ListObj.head.key);
			ListObj.head = ListObj.head.next;
		}	
		assertEquals(4 , ListObj.size);
	}
	
	@Test
	public void PushBacktest() {
		ListObj.pushBack(5);
		ListObj.pushBack(6);
		ListObj.pushBack(7);
		ListObj.display();
		int [] ExpectedList = {5,6,7};
		for(int i = 0 ;i < 3 ; i++)
		{
			assertEquals(ExpectedList[i] , ListObj.head.key);
			ListObj.head = ListObj.head.next;
		}	
		assertEquals(3 , ListObj.size);
	}
	
	@Test 
	public void PopFrontTest() {
		ListObj.popFront();
		assertEquals(0,ListObj.size);			
		assertEquals(null,ListObj.head);
		ListObj.pushFront(5);
		ListObj.pushFront(6);
		ListObj.pushFront(7);
		assertEquals(3,ListObj.size);
		ListObj.popFront();
		assertEquals(2,ListObj.size);
		int [] ExpectedList = {6,5};
		for(int i = 0 ;i < 2 ; i++)
		{
			assertEquals(ExpectedList[i] , ListObj.head.key);
			ListObj.head = ListObj.head.next;
		}	
		assertEquals(null,ListObj.head);
	}

	@Test 
	public void PopBackTest() {
		ListObj.popBack();
		assertEquals(0,ListObj.size);			
		assertEquals(null,ListObj.head);
		ListObj.pushBack(5);
		ListObj.pushBack(6);
		ListObj.pushBack(7);
		ListObj.popBack();
		ListObj.popBack();
		ListObj.popBack();
		ListObj.display();
		assertEquals(0,ListObj.size);			
		assertEquals(null,ListObj.head);		
	}
	
	@Test
	public void PopTest() {
		//head null
		ListObj.pop(0);
		assertEquals(null , ListObj.head);
		ListObj.pushBack(8);
		ListObj.pushBack(5);
		ListObj.pushBack(7);
		ListObj.pushBack(6);
		ListObj.pushBack(2);
		ListObj.pop(0);
		assertEquals(5,ListObj.head.key);
		assertEquals(4,ListObj.size);
		ListObj.pop(2);
		assertEquals(3,ListObj.size);
		int [] earr={5,7,2};
		for(int i=0; i<3; i++) {
			assertEquals(earr[i],ListObj.head.key);
			if(i<3)
			ListObj.head = ListObj.head.next;
		}		
	}
	
	@Test
	public void Pop_at_Pos0_Test() {
		ListObj.pushFront(5);
		ListObj.pushFront(6);
		ListObj.pop(0);
			assertEquals(5 , ListObj.head.key);				
	}
	
	
	@After
	public void tearDown() throws Exception {
		LinkedList ListObj = new LinkedList();
		ListObj.head=null;
	}
	
	 @Rule
	   public ExpectedException thrown = ExpectedException.none();
	@Test(expected = NullPointerException.class)
  public void NullPointerTest() {
     ListObj.pop(0);
	   assertEquals(null, ListObj.head.next);
	   thrown.expect(NullPointerException.class);
	   throw new NullPointerException();
	   }
}
