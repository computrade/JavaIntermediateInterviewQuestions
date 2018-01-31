package computrade.collections.map;

import java.util.Map;
import java.util.TreeMap;

import computrade.Student;

public class TreeMapExample {
    public static void main(String[] args) {
      
            // Instantiate a HashMap with Integer as the key type and Student as
            // the object type.
        	Map<Integer, Student> students = new TreeMap<Integer, Student>();
            // Instantiate three Students; the constructor arguments are 
            // used to initialize Student attributes studentId and studentName
            Student s1 = new Student(12, "Fred");
            Student s2 = new Student(98, "Barney");
            Student s3 = new Student(71, "Wilma");

            // Insert all three Students into the HashMap.
            students.put(s1.getStudentID(), s1);
            students.put(s2.getStudentID(), s2);
            students.put(s3.getStudentID(), s3);

            
            System.out.println("\nIterate through the HashMap to process all Keys (Ids):");
            for (Integer key : students.keySet()) {
                System.out.println("ID: " + key );
            }
            
            System.out.println("***Note: The map is sorted according to the natural ordering of its keys!");
         
            System.out.println("\nIterate through the HashMap to process all Values (Students):");
            for (Student s : students.values()) {
                System.out.println(s);
            }
          
            
            System.out.println("\nIterate through the HashMap to process all Entries (Id, Student):");
            for (Map.Entry<Integer,Student> entry : students.entrySet()) {
                System.out.println("ID: " + entry.getKey() +  " Strudent: " + entry.getValue() );
            }
            
            
        }
}
