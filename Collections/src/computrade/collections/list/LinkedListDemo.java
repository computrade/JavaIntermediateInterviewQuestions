package computrade.collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import computrade.Student;


public class LinkedListDemo {
    public static void main(String[] args) {
	  // Instantiate a LinkedList. 
      LinkedList<Student> students = new LinkedList<Student>();

	  // Create a few Student objects and add them to the LinkedList.
	  students.add(new Student(1,"Alice"));
	  students.add(new Student(2,"Bob"));
	  students.add(new Student(3,"Charley"));
	  
	  System.out.println("Student at intex 1:" + students.get(1));

	  // Method from Deque interface
	  System.out.println("The first element in the LinkedList is:" + students.getFirst());
	  System.out.println("The last element in the LinkedList is:" + students.getLast());
	  
	  students.removeLast(); // Method from Deque interface
	  System.out.println("***After remove last:" + students);
	  
	  students.addLast(new Student(3,"Charley-Last")); // Method from Deque interface
	  System.out.println("***After addLast:" + students);
	  
	  System.out.println("**** Iterator Example...");
      Iterator<Student> studentIterator = students.iterator();
	  while(studentIterator.hasNext()){	  
		  Student currStudent = studentIterator.next();
		  System.out.println(currStudent);
		  if("Bob".equals(currStudent.getName())){
			  studentIterator.remove();
			  System.out.println("***Removed:" +currStudent );
		  }  
	  }
	  
	  System.out.println("**** Using For Example after remove...");
	  for (Student s : students) {
			System.out.println(s); 
	  }
	  
	  
    }
}
