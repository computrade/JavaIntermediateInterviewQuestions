package computrade.collections.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import computrade.Student;


public class IteratorFailSafeDemo {
    public static void main(String[] args) {
	  // Instantiate a collection. 
	  List<Student> students = new CopyOnWriteArrayList<Student>();

	  // Create a few Student objects and add them to the list.
	  students.add(new Student(1,"Alice"));
	  students.add(new Student(2,"Bob"));
	  students.add(new Student(3,"Charley"));
	  System.out.println(students); 
	  
	  
	  
	  System.out.println("**** Iterator Fail-Safe Example...");
      Iterator<Student> studentIterator = students.iterator();
      int index=4;
	  while(studentIterator.hasNext()){	  
		  Student currStudent = studentIterator.next();
		  System.out.println(currStudent);
		  students.add(new Student(index,"David"+index));
		  index++;
	  }
	  
	  System.out.println("**** Iterator element was added...");
	  studentIterator = students.iterator();
	  while(studentIterator.hasNext()){	  
		  System.out.println(studentIterator.next());
	  }
	    
    }
}
