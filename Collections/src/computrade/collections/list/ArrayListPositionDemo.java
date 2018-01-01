package computrade.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPositionDemo {
	
	public static void main(String[] args) {
        // Create a list of strings
        List<String> names = new ArrayList<String>();

        // Print the list details
        System.out.printf("After creation: Size = %d,Elements = %s%n", names.size(), names);

        // Add some names to the list
        names.add("Alice");
        names.add("Bob");
        names.add("Charly");
        names.add("Diana");

        // Print the list details
        System.out.printf("After adding 3 elements: Size = %d, ,Elements = %s%n",
                names.size(), names);

        // Remove Bob from the list
        names.remove(1);

        // Print the list details
        System.out.printf("After removing 1 element: Size = %d, Elements = %s%n",
                names.size(), names);
        
        
        names.add(1, "Bob2");
        
        // Print the list details
        System.out.printf("After add 1 element: Size = %d, Elements = %s%n",
                names.size(), names);
          
        // Print the list details
        System.out.printf("After add 1 element: Size = %d, Elements = %s%n",
                names.size(), names);

        // Clear all elements
        names.clear();

        // Print the list details
        System.out.printf("After clearing all elements: Size = %d, Elements = %s%n",
                names.size(), names);
        
        // This index is Out Of Bound - Excpetion is thrown.
        names.add(1,"Bob2");
        
        for(int i=0;i<20;i++){
        	 names.add(i,"element"+i);
        }
        // Print the list details
        System.out.printf("After clearing all elements: Size = %d, Elements = %s%n",
                names.size(), names);

}

}
