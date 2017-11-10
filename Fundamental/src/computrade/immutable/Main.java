package computrade.immutable;

public class Main {
	
	public static void main(String... args){
		
		new Main().run();
	}
	
	
	public void run(){
		
		Address address = new Address(16, "Pine st." , "Los Angeles", "California");
		Student immutableStudent = new Student(1,"Bob",address);
		
		System.out.println("This is my immutable student:\n" + immutableStudent);
		
		address = immutableStudent.getAddress();
		address.setStreet("Apple st.");
		System.out.println("This is my immutable student ?:\n" + immutableStudent);
		
	}

}
