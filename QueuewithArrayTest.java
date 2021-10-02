import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

public class QueuewithArrayTest {
	QueuewithArray QueueObj = new QueuewithArray(3);
	
	@Before
	public void setUp() throws Exception {
		QueuewithArray QueueObj = new QueuewithArray(3);
	}

	@Test
	public void TestEnqueue() {
		QueueObj.display();
		QueueObj.enqueue(59);
		assertEquals(1,QueueObj.addPointer);
		QueueObj.enqueue(60);
		QueueObj.enqueue(61);
		int [] ExpectedArray = {59,60,61};
		for(int i=0; i<3;i++)
			assertEquals(ExpectedArray[i],QueueObj.array[i]);
		QueueObj.enqueue(54);
		QueueObj.enqueue(89);
		QueueObj.enqueue(79);
		QueueObj.addPointer++;
		assertEquals(QueueObj.addPointer,QueueObj.array.length);
		QueueObj.display();
	}
	
	@Test
	public void TestDequeue() {
		assertEquals(-1,QueueObj.dequeue());
		QueueObj.enqueue(59);
		QueueObj.enqueue(30);
		QueueObj.enqueue(13);
		QueueObj.enqueue(50);
		assertEquals(59, QueueObj.dequeue());
		assertEquals(30, QueueObj.dequeue());
		assertEquals(13, QueueObj.dequeue());
		assertEquals(-1, QueueObj.dequeue());
		
		
	}
	
	@After
	public void tearDown() throws Exception {
		QueueObj=null;
	}
	
	/*@Rule
	   public ExpectedException thrown = ExpectedException.none();
	@Test(expected = NullPointerException.class)
public void NullPointerTest() {
  QueueObj.dequeue();
	   assertEquals(null, QueueObj);
	   thrown.expect(NullPointerException.class);
	   throw new NullPointerException();
	   }*/
}
