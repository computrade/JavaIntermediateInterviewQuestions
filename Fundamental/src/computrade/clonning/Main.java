package computrade.clonning;

public class Main {
	
	public static void main(String... args){
		
		new Main().run();
	}
	
	
	public void run(){
		
		Address immutableAdress = new Address(16, "Pine st." , "Los Angeles", "California");
		Student immutableStudent = new Student(123,"Clinton",immutableAdress);
		System.out.println("This is my immutable student:\n" + immutableStudent);
		
		Address adress = immutableStudent.getAdress();
		adress.setStreet("Apple st.");
		
		System.out.println("This is my immutable student ?:\n" + immutableStudent);
		
	}

}
