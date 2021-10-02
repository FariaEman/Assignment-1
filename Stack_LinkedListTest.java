import static org.junit.Assert.*;

import org.junit.*;

public class Stack_LinkedListTest {

	Stack_LinkedList StackObj = new Stack_LinkedList();

	@Before
	public void setUp() throws Exception {
		Stack_LinkedList StackObj = new Stack_LinkedList();
	}

	@Test
	public void TestPush() {
		StackObj.display();
		StackObj.push(2);
		assertEquals(2,StackObj.head.key);
		StackObj.display();
		
	}

	@Test
	public void TestTop() {
		assertEquals(-1,StackObj.top());
		StackObj.push(9);
		StackObj.push(10);
	    assertEquals(10,StackObj.top());
	}
	
	@Test
	public void TestPop() {
		assertEquals(-1,StackObj.pop());
		StackObj.push(8);
		StackObj.push(7);
		assertEquals(7,StackObj.pop());
	}
   
	@Test
	public void TestSize() {
		StackObj.push(5);
		StackObj.push(6);
		assertEquals(2,StackObj.getSize());
	}
	
	@After
	public void tearDown() throws Exception {
		StackObj=null;
	}
}
