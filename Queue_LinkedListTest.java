import static org.junit.Assert.*;

import org.junit.*;

public class Queue_LinkedListTest {

	Queue_LinkedList QueueObj= new Queue_LinkedList();

	@Before
	public void setUp() throws Exception {
		Queue_LinkedList QueueObj= new Queue_LinkedList();	
	}

	@Test
	public void TestEnqueue() {
		QueueObj.display();
		QueueObj.enqueue(5);
		assertEquals(5,QueueObj.head.key);
		QueueObj.enqueue(7);
		QueueObj.enqueue(8);
		int [] earr={5,7,8};
		for(int i=0; i<3;i++)
		{
			assertEquals(earr[i],QueueObj.head.key);
			if(i<2)
				QueueObj.head = QueueObj.head.next;
		}
		QueueObj.display();
	}

	@Test
	public void TestDequeue() {
		assertEquals(-1,QueueObj.dequeue());
		QueueObj.enqueue(9);
		QueueObj.enqueue(33);
		QueueObj.enqueue(10);
		assertEquals(9,QueueObj.dequeue());
	}
	
	@After
	public void tearDown() throws Exception {
		QueueObj = null;
	}
}


