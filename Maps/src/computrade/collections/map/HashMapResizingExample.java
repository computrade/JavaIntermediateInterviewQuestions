package computrade.collections.map;
import java.util.HashMap;
import java.util.Map;

import computrade.Student;

public class HashMapResizingExample {
    public static void main(String[] args) {
    	
        // Instantiate a HashMap with Integer as the key type and Student as the value type.
        Map<String, Student> students = new HashMap<String, Student>(   );
        // put 16 Students to see the rehashing; 
        for(int i=1;i<=16;i++){
        	Student student = new Student(i, "Student"+i);
        	if(i==13){
        		System.out.println("resize of the hashmap is going to happen in the next put");
        	}
        	students.put(student.getName(), student);
        } 
        
        System.out.println("Iterate through the HashMap to process all Entries (Id, Student):");
        for (Map.Entry<String,Student> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() +  " Student: " + entry.getValue() );
        }
        
    }
}
