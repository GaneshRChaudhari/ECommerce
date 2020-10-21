
public class product {
	private String productName = " ";
	private int productID;
	private float productPrice;
	
	public product(String productName, int productID, float productPrice)
	{
		this.productName = productName;
		this.productID = productID;
		this.productPrice = productPrice;		
	}
	
	public void showProductDetails()
	{
		System.out.println("Name: "+ productName);
		System.out.println("Price: "+ productPrice);
		System.out.println("Product ID: "+productID);
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	
	
}
