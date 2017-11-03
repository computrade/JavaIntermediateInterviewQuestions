package computrade.immutable;

public class Address {
	
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
     
 


	

}
