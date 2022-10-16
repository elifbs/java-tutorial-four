
public class Main {

	public static void main(String[] args) {
		
	Product product = new Product(453, "elif", "baş", 38, "");
		
	//product.setId(453);
	//product.setFirstName("Elif");
	//product.setLastName("Baş");
	//product.setNumber(28);
		
		System.out.println(product.getId());
		System.out.println(product.getKod());
	
	
	
	//İnheritance;
		
	Customer customer = new Customer();
	Employee employee = new Employee();
	
	CustomerManager customerManager = new CustomerManager();
	EmployeeManager employeeManager = new EmployeeManager();
			
	}
}
