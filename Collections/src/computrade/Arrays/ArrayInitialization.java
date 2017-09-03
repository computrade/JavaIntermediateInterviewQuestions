package computrade.Arrays;

import computrade.Student;

public class ArrayInitialization {

	private boolean[] booleanArray = new boolean[3]; 
	private int[] intArray = new int[5]; 
	private String[] stringArray = new String[4];
	private Student[] studentArray = new Student[5];

	public void printBooleanArray() {
		// Display the initial value for elements of the instance variable bArray
		for (int i = 0; i < booleanArray.length; i++) {
			System.out.println("bArray[" + i + "]:" + booleanArray[i]);
		}
	}
	
	public void printIntArray() {
		// Display the initial value for elements of the instance variable intArray
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("intArray[" + i + "]:" + intArray[i]);
		}
	}

	public void printStringArray() {
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

	}

}
