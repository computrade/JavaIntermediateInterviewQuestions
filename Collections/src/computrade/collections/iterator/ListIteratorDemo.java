package computrade.collections.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import computrade.Student;


public class ListIteratorDemo {
    public static void main(String[] args) {
	  // Instantiate a collection. 
	  List<Student> students = new ArrayList<Student>();

	  // Create a few Student objects and add them to the list.
	  students.add(new Student(1,"Alice"));
	  students.add(new Student(2,"Bob"));
	  students.add(new Student(3,"Charley"));

	  System.out.println("**** List Iterator Example...");
	  ListIterator<Student> studentListIterator = students.listIterator();
	  while(studentListIterator.hasNext()){	  
		  System.out.println(studentListIterator.next());
		  //use ListeIterator to find position.
		  if(studentListIterator.nextIndex()==3){
			  studentListIterator.add(new Student(4,"David"));
		  }
	  }
	  
	  System.out.println("**** List Iterator Previous Example...");
	  while(studentListIterator.hasPrevious()){	  
		  Student currStudent = studentListIterator.previous();
		  System.out.println(currStudent);
	  }
	  
	    
    }
}
