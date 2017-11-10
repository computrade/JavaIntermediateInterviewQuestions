package computrade.clonning;

public class Main {
	
	public static void main(String... args){
		
		new Main().run();
	}
	
	
	public void run(){
		
		Address address = new Address(16, "Pine st." , "Los Angeles", "California");
		Student student = new Student(123,"Clinton",address);
		System.out.println("This is my student:\n" + student);
		
		//Student cloneableStudent = student.clone();
		//System.out.println("This is my clone student:\n" + cloneableStudent);
		
		//System.out.println("Are cloned objects are equals? " + student.equals(cloneableStudent));
		//System.out.println("Are cloned objects are the same? " + (student==cloneableStudent));
		
		//Demo of Shallow/Deep copy.
		//Address changedAddress = student.getAddress();
		//changedAddress.setStreet("Apple st.");
		
		//System.out.println("This is my student:\n" + student);
		//System.out.println("This is my clone student:\n" + cloneableStudent);
		//In case of Shallow copy = true; Deep copy = false;
		//System.out.println("Are Address objects are the same? " + (student.getAddress()==cloneableStudent.getAddress()));
		
		
	}

}
