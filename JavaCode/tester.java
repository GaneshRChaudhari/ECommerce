import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String category = " ";
		
		System.out.println("Select your category");
		System.out.println("1.Customer\n2.Vendor\n3.Staff\n4.Admin");
		category = input.next();
		
		if(category.toLowerCase() == "customer")
		{
			
		}else if(category.toLowerCase() == "vendor")
		{
			
		}else if(category.toLowerCase() == "staff")
		{
			
		}else if(category.toLowerCase() == "admin")
		{
			
		}else
		{
			System.out.println("Enter valid category");
		}
		
		input.close();

	}

}
