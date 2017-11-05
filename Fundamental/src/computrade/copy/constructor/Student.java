package computrade.copy.constructor;

public final class Student{
	
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
	public Address getAdress() {
		
		return this.address;
		//return new Address(address.getHouseNumber(),address.getStreet(),address.getCity(),address.getState());
		//return new Address(address);
		//return Address.getInstance(address);
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=").append(id).append(", name=").append(name).append(",\n adress=").append(address)
				.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	
}
