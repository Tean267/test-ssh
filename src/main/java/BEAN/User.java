package BEAN;

public class User {
	private String email, firstName, lastName, update,Contact;
	private String[] hearAbout;
	public User(String email, String firstName, String lastName, String update, String contact, String[] hearAbout) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.update = update;
		Contact = contact;
		this.hearAbout = hearAbout;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
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
	public String getUpdate() {
		return update;
	}
	public void setUpdate(String update) {
		this.update = update;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	public String[] getHearAbout() {
		return hearAbout;
	}
	public void setHearAbout(String[] hearAbout) {
		this.hearAbout = hearAbout;
	}
	
	
}	