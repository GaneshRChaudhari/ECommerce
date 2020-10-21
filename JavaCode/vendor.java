
public class vendor {
	private String vendorName = "";
	private int vendorContact;
	private String vendorPassword = "";
	
	public vendor(String vendorName, int vendorContact, String vendorPassword)
	{
		this.vendorName = vendorName;
		this.vendorContact = vendorContact;
		this.vendorPassword = vendorPassword;		
	}
	
	public void showVendorDetails()
	{
		System.out.println("Vendor Name: "+ this.getVendorName());
		System.out.println("Vendor Name: "+ this.getVendorContact());
		System.out.println("Vendor Name: "+ this.getVendorPassword());
	}
	

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public int getVendorContact() {
		return vendorContact;
	}

	public void setVendorContact(int vendorContact) {
		this.vendorContact = vendorContact;
	}

	public String getVendorPassword() {
		return vendorPassword;
	}

	public void setVendorPassword(String vendorPassword) {
		this.vendorPassword = vendorPassword;
	}
	
	

}
