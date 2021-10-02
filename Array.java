//Array Programs - ArrayInsertion, ArrayDeletion, DisplayArray, LinearSearch, BinarySearch, BubbleSort

import java.util.*;
public class Array{
	static int [] array;  //array
	static int size;      //size increases as elements are filled in the array.	
	
	public Array(){
		array=new int[100]; //length of array = 100
		size=0;
	}  

	//function to get values from the user.
	static public void getValues(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of values to insert:");
		int numofElem = input.nextInt(); //number of elements to insert.
		for(int i=0;i<numofElem;i++){
			System.out.println("Enter the num "+i+":");
			int element=input.nextInt();
			insert(element,i); 
			
		}
	} 
	
	//function to insert elements in the array.
	static public void insert(int number,int position){//9,0
		for(int i=size-1;i>=position;i--){//-1, 0
			array[i+1]=array[i];
		}
		array[position]=number;//0 9
		size++;
	}

	//function to delete elements from the array.
	static public void delete(int position){
		for(int i=position;i<size-1;i++){
			array[i]=array[i+1];
		}
		size--;
	}

	//function to display the array.
	static public void display(){
		for(int i=0;i<size;i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	//function to do Linear Search on the array.
	static public boolean linearSearch(int number){
		for(int i=0;i<size;i++){
			if(number==array[i]){
				return true;
			}
		}
		return false;
	}

	//fuction to sort the array.
	static public void bubbleSort(){
		for(int i=0;i<size-1;i++){
			for(int j=0;j<size-i-1;j++){
				if(array[j]>array[j+1]){
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
				
	
	//function to to Binary Search on the array.
	static public boolean binarySearch(int number,int low, int high){
		if(low>high){
			return false;
		}
		int mid=low + (high-low)/2;
		if(array[mid]==number){
			return true;
		}
		if(array[mid]>number){
			return binarySearch(number,low,mid-1);
		}
		else{
			return binarySearch(number,mid+1,high);
		}
		

	}}

	/*//main function
	public static void main(String [] args){
		Array array = new Array(); //create an array.
		Array.getValues(); //get values from the user.
		Array.display();   //display the array.

		Array.insert(10,4);//insert num=10 at pos=4
		Array.display();   //display the array.

		Array.delete(3);   //delete num at pos=3 from the array.
		Array.display();   //display the array.

		System.out.println(Array.linearSearch(40)); //check 40 is present in the array using linearSearch.

		Array.bubbleSort();//sort the array.
		Array.display();   //display the array.

		System.out.println(Array.binarySearch(56,0,size)); //search for num=56 using Binary Search.
	}
}
*/
