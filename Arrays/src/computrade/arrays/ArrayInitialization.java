package computrade.arrays;

import computrade.Student;

public class ArrayInitialization{

	private boolean[] booleanArray = {true,false,true}; 
	private Student[] studentArray = {new Student(1,"Alex"),new Student(2,"Amit"),new Student(3,"Brian")};

	public void printBooleanArray() {
		// Display the initial value for elements of the instance variable bArray
		for (int i = 0; i < booleanArray.length; i++) {
			System.out.println("bArray[" + i + "]:" + booleanArray[i]);
		}
	}
	
	public void printIntArray() {
		
		int[] intArray = new int[]{1,3,4,5,6};
		// Display the initial value for elements of the instance variable intArray
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("intArray[" + i + "]:" + intArray[i]);
		}
	}

	public void printStringArray() {
		
		String[] stringArray = { "Alex","Amit","Brian"};
		// Display the initial value for elements of the variable stringArray
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println("stringArray[" + i + "]:" + stringArray[i]);
		}
	}

	public void printStudentArray() {
		// Display the initial value for elements of the instance studentArray
		int i=0;
		for (Student student: studentArray) {
			System.out.println("studentArray[" + i + "]:"  + student);
			i++;
		}
	}

	public static void main(String[] args) {

		ArrayInitialization myArray = new ArrayInitialization();
		myArray.printBooleanArray();
		myArray.printIntArray();
		myArray.printStringArray();
		myArray.printStudentArray();
		
		//array elements cannot be printed as an object.
		//System.out.println(myArray.booleanArray);
		//System.out.println(myArray.studentArray);

	}

}
