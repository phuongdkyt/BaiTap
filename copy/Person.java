package copy;

public class Person {
private int id;
 public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public void setName(Name name) {
	this.name = name;
}
Address address;
 Name name;



public Person(Person p) {
	this.id=p.getId();
//	this.name=new Name(p.name);
	this.address=new Address(p.address);
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name.getLastName();
}
public String getCity() {
	return address.getCity();
}
public Person() {
	super();
	// TODO Auto-generated constructor stub
}

}
