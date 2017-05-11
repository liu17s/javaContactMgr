package contactApp;

import java.io.Serializable;

public class Contact implements Serializable{
	public String fullName;
	public String email;
	public String phoneNumber;
	
	public Contact(String fullName, String email, String phoneNumber){
		this.fullName = fullName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

}