package computrade.copy.constructor;

public final class Student implements Cloneable{
	
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
		//return new Adress(adress.getHouseNumber(),adress.getStreet(),adress.getCity(),adress.getState());
		return adress.clone();
	}
	
	public Student clone() {
		try {
			return (Student) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=").append(id).append(", name=").append(name).append(", adress=").append(adress)
				.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
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
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
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
