package computrade.immutable;

public final class Student {
	
	private final int id;
	private final String name;
	private final Address address;
	
	public Student(int id, String name, Address adress) {
		this.id = id;
		this.name = name;
		this.address = adress;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Address getAddress() {
		return address;
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=").append(id).append(", name=").append(name).append(", adress=").append(address)
				.append("]");
		return builder.toString();
	}

}
