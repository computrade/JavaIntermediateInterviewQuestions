package computrade.copy.constructor;

public class Address{

	private int houseNumber;
	private String street;
	private String city;
	private String state;

	public Address(int houseNumber, String street, String city, String state) {
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	
	public Address(Address inputAdress) {
		
		this(inputAdress.getHouseNumber(),inputAdress.getStreet(),
			 inputAdress.getCity(),inputAdress.getState());
		
	}
	
	public static Address getInstance(Address inputAdress) {
		
		return new Address(inputAdress.getHouseNumber(),inputAdress.getStreet(),
				          inputAdress.getCity(),inputAdress.getState());
		
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Adress [houseNumber=").append(houseNumber).append(", street=").append(street).append(", city=")
				.append(city).append(", state=").append(state).append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + houseNumber;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
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
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (houseNumber != other.houseNumber)
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		return true;
	}
	
	

}
