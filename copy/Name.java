package copy;

public class Name {
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Name(Name n) {
		 this.firstName=n.firstName;
		 this.lastName=n.lastName;
	}

	public Name() {
		super();
		// TODO Auto-generated constructor stub
	}

}
