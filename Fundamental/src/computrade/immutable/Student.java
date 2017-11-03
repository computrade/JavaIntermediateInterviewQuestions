package computrade.immutable;

public final class Student {
	
	private final int id;
	private final String name;
	private final Adress adress;
	
	public Student(int id, String name, Adress adress) {
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
	public Adress getAdress() {
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
