package computrade.immutable;

public final class Student {
	
	private final int id;
	private final String name;
	private final Address adress;
	
	public Student(int id, String name, Address adress) {
		this.id = id;
		this.name = name;
		this.adress = adress;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Address getAdress() {
		return adress;
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=").append(id).append(", name=").append(name).append(", adress=").append(adress)
				.append("]");
		return builder.toString();
	}

}
