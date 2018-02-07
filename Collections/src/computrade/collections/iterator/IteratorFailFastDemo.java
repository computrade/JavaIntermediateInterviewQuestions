package computrade.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import computrade.Student;


public class IteratorFailFastDemo {
    public static void main(String[] args) {
	  // Instantiate a collection. 
	  List<Student> students = new ArrayList<Student>();

	  // Create a few Student objects.
	  Student a = new Student(1,"Alice");
	  Student b = new Student(2,"Bob");
	  Student c = new Student(3,"Charley");

	  // Store references to all three Students in the collection.
	  students.add(a);
	  students.add(b);
	  students.add(c);
	  System.out.println(students); 
	  
	  System.out.println("**** Iterator ConcurrentModificationException Example...");
      Iterator<Student> studentIterator = students.iterator();
	  while(studentIterator.hasNext()){	  
		  Student currStudent = studentIterator.next(); //ConcurrentModificationException
		  System.out.println(currStudent);
		  students.add(c); 
	  }
	    
    }
}
