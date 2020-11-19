package copy;

public class Address {
private String street;
private String city;

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public Address(Address d) {
	this.street=d.street;
	this.city=d.city;
}

public Address() {
	super();
	// TODO Auto-generated constructor stub
}

}
