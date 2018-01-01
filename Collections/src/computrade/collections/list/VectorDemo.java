package computrade.collections.list;

import java.util.Vector;

import computrade.Student;

public class VectorDemo {
    public static void main(String[] args) {
	  // Instantiate a collection. 
	  Vector<Student> students = new Vector<Student>();

	  // Create a few Student objects.
	  Student a = new Student("Alice");
	  Student b = new Student("Bob");
	  Student c = new Student("Charly");

	  // Store references to all three Students in the collection.
	  students.add(a);
	  students.add(b);
	  students.add(c);

	  // iterate through and print them one by one,
	  for (Student s : students) {
	    System.out.println(s.getName()); 
	  }
    }
}
