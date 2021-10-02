import org.junit.Rule;
import static org.junit.Assert.*;

import org.junit.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Stack_ArrayTest {

	Stack_Array StackObj = new Stack_Array();
	@Before
	public void setUp() throws Exception {
		Stack_Array StackObj = new Stack_Array();
	}

	@Test
	public void PushTest()  {
		StackObj.display();
		StackObj.push(5);
		assertEquals(1 , StackObj.addPointer);
		StackObj.push(6);
		StackObj.push(7);
		StackObj.push(8);
		StackObj.push(9);
		StackObj.display();
	     Assert.assertEquals(StackObj.addPointer, StackObj.array.length);
	     StackObj.push(54);
	     Assert.assertTrue(StackObj.addPointer >= StackObj.array.length);
	}
	
	
	@Test
	public void PopTest() {
		assertEquals(-1 , StackObj.pop());
		StackObj.push(76);
		StackObj.push(90);
		assertEquals(90 , StackObj.pop());
		assertEquals(1 , StackObj.addPointer);
		assertEquals(1 , StackObj.size);
	}

	@Test
	public void TopTest() {
		assertEquals(-1 , StackObj.top());
		for(int i=0; i<3; i++)
		{
			StackObj.push(i*2+1);
		}
			assertEquals(0 , StackObj.top());
		
	}
	@Test
	public void SizeTest() {
		for(int i=0; i<5; i++)
		{
			StackObj.push(i*2+2);
		}
		assertEquals(6 , StackObj.size());
		
	}
	
	@After
	public void tearDown() throws Exception {
		StackObj = null;
	}
}

