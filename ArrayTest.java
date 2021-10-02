import static org.junit.Assert.*;
import org.junit.*;
import org.junit.rules.ExpectedException;

public class ArrayTest {
	Array ArrObj = new Array();

	@Before
	public void setUp() throws Exception {
		ArrayTest ArrObj = new ArrayTest();
	}
	
	@Test
	public void TestInsert() {
		for(int i = 0 ; i < 5 ; i++){
			ArrObj.insert(i*2, i);
		}
		//ArrObj.insert(10,5);
		int [] ExpectedArray = {0,2,4,6,8};
		for(int i = 0 ; i < 5 ; i++) {
			assertEquals(ExpectedArray[i],ArrObj.array[i]);
		}
	}		
	    @Test
	    public void TestInsertNeg() {
	    	for(int i = 0 ; i < 5 ; i++){
				ArrObj.insert(i*2, i);
			}
			//ArrObj.insert(10,5);
			int [] ExpectedArray = {1,3,5,7,9};
			for(int i = 0 ; i < 5 ; i++) {
				assertNotEquals(ExpectedArray[i],ArrObj.array[i]);
			}
	}	
	    @Test
	    public void TestDelete() {
	    	for(int i = 0 ; i < 5 ; i++){
				ArrObj.insert(i*2, i);
			}
	    	ArrObj.delete(0);
	    	int [] ExpectedArray = {2,4,6,8};
	    	for(int i = 0 ; i < 4 ; i++)
	    		assertEquals(ExpectedArray[i] ,ArrObj.array[i]);
	    }
	    
	    @Test
	    public void TestDeleteNeg() {
	    	for(int i = 0 ; i < 5 ; i++){
				ArrObj.insert(i*2, i);
			}
	    	ArrObj.delete(0);
	    	int [] ExpectedArray = {0,2,6,8};
	    	for(int i = 0 ; i < 4 ; i++)
	    		assertNotEquals(ExpectedArray[i] ,ArrObj.array);
	    }
	    
	    @Test
	    public void TestLinearSearch() {
	    	for(int i = 0 ; i < 5 ; i++){
				ArrObj.insert(i*2, i);
			}
	    	boolean result = ArrObj.linearSearch(4);
	    	assertEquals(true,result);
	    	boolean result1 = ArrObj.linearSearch(7);
	    	assertEquals(false,result1);
	    }
	    
	    @Test
	    public void TestLinearSearchNeg() {
	    	for(int i = 0 ; i < 5 ; i++){
				ArrObj.insert(i*2, i);
			}
	    	boolean result = ArrObj.linearSearch(4);
	    	assertNotEquals(false,result);
	    }
	    
	    @Test
	    public void TestBubbleSort() {
	    	/*for(int i = 0 ; i < 5 ; i++){
				ArrObj.insert(i*2, i);
			}*/
	    	ArrObj.insert(4, 0);
	    	ArrObj.insert(0, 1);
	    	ArrObj.insert(8, 2);
	    	ArrObj.insert(2, 3);
	    	ArrObj.insert(6, 4);

	    	ArrObj.bubbleSort();
	    	int [] ExpectedArray = {0,2,4,6,8};
	    	for(int i = 0 ; i < 5; i++)
	    	assertEquals(ExpectedArray[i] , ArrObj.array[i]);
	    }
		
	    @Test
	    public void TestBubbleSortNeg() {
	    	ArrObj.insert(4, 0);
	    	ArrObj.insert(0, 1);
	    	ArrObj.insert(8, 2);
	    	ArrObj.insert(2, 3);
	    	ArrObj.insert(6, 4);

	    	ArrObj.bubbleSort();
	    	int [] ExpectedArray = {0,4,2,8,6};
	    	for(int i = 0 ; i < 5; i++)
	    	assertNotEquals(ExpectedArray[i] , ArrObj.array);
	    }
	    
	    @Test 
	    public void TestbinarySerach() {
	    	for(int i = 0 ; i < 5 ; i++){
				ArrObj.insert(i*2, i);
	    }
	    boolean result = ArrObj.binarySearch(2,0,4);
	    assertEquals(true,result);	
	    boolean result1 = ArrObj.binarySearch(2,4,0);      //if(low>high)
	    assertEquals(false,result1);	
	    }
	    
	    @Test 
	    public void TestbinarySerachNeg() {
	    	for(int i = 0 ; i < 5 ; i++){
				ArrObj.insert(i*2, i);
	    }
	    boolean result = ArrObj.binarySearch(2,0,4);
	    assertNotEquals(false,result);	
	    }
	    
	    @Test
	    public void TestDisplay() {
	    	for(int i = 0 ; i < 5 ; i++){
				ArrObj.insert(i*2, i);
	    }
	    	ArrObj.display();
	    	int [] ExpectedArray = {0,2,4,6,8};
	    	for(int i = 0 ; i < 5 ; i++)
	    	assertEquals(ExpectedArray[i] , ArrObj.array[i]);
	    }
	    
	    @Rule
	    public ExpectedException thrown = ExpectedException.none();
	    @Test
	    public void ExceptionTest() {
	 	   assertEquals(0, ArrObj.array[50]);
	        thrown.expect(NullPointerException.class);
	        throw new NullPointerException();
	    }
	    
	    @Test(expected = IndexOutOfBoundsException.class)
	    public void OutOfBoundTest() {
	 	   assertEquals(0, ArrObj.array[101]);
	       thrown.expect(ArrayIndexOutOfBoundsException.class);
	       throw new NullPointerException();
	    }
	    
		@After
		public void tearDown() throws Exception {
		ArrayTest ArrObj = new ArrayTest();
			ArrObj = null;
		}
}



