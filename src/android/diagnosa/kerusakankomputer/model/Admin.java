package android.diagnosa.kerusakankomputer.model;

public class Admin {

	private String usernameString;
	private String passwordString;

	public String getUsernameString() {
		return usernameString;
	}

	public void setUsernameString(String usernameString) {
		this.usernameString = usernameString;
	}

	public String getPasswordString() {
		return passwordString;
	}

	public void setPasswordString(String passwordString) {
		this.passwordString = passwordString;
	}

	public Admin(String usernameString, String passwordString) {
		super();
		this.usernameString = usernameString;
		this.passwordString = passwordString;
	}

}
