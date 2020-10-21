
public class customer {
	private String customerName = " ";
	private int customerContact;
	private String customerPassword = "";
	
	public customer(String customerName, int customerContact, String customerPassword)
	{
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerPassword = customerPassword;
	}
	
	public void showCustomerDetails()
	{
		System.out.println("Customer Name: "+this.getCustomerName());
		System.out.println("Customer Contact: "+this.getCustomerContact());
	}
	
	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}
	
	

}
