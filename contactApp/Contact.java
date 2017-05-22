package contactApp;

import java.io.Serializable;

public class Contact implements Serializable{
	public String name;
	public String address;
	public String email;
	public String phone;
	
	public Contact(String name, String address, String email, String phone){
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}

}