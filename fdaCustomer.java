package com.fda;

class fdaCustomerDetails
{
	private int id;
	private String userId;
	private String password;
	private String email;
	private String address;
	private String role;
	
	public fdaCustomerDetails() {
		
	}
	public fdaCustomerDetails(int id, String userId, String password, String email, String address, String role) {
		super();
		this.id = id;
		this.userId = userId;
		this.password = password;
		this.email = email;
		this.address = address;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
public class fdaCustomer {
	public static void main(String[] args) {
		
		fdaCustomerDetails fda = new fdaCustomerDetails(1,"akash_123",
				"aks123","akash@gmail.com","bangalore city","customer");
		System.out.println("CustomerId: "+fda.getId());
		System.out.println("CustomerUserId: "+fda.getUserId());
		System.out.println("CustomerPassword: "+fda.getPassword());
		System.out.println("CustomerEmail: "+fda.getEmail());
		System.out.println("CustomerAddress: "+fda.getAddress());
		System.out.println("CustomerRole: "+fda.getRole());

	}

}
