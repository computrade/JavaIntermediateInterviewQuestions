package computrade.clonning;

public class Student /*implements Cloneable*/{
	
	private int id;
	private String name;
	private Address address;
	
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
		return this.address;
	}
	
	/*
	public Student clone() {
		try {
			Student cloneStudent =  (Student) super.clone();
			//cloneStudent.address = this.address.clone();
			return cloneStudent;	       
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	*/
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=").append(id).append(", name=").append(name).append(", adress=").append(address)
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
