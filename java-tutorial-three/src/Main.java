import java.io.Console;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,3};
		int[] sayilar2 = {10,20,30};
		sayilar1 = sayilar2;
		sayilar2[0] = 1000;
		
		System.out.println(sayilar1[0]);
		
		CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		creditManager.Save();
		
		Customer customer = new Customer(); // örneğini oluşturma-instance oluşturma-instance creation.
		customer.id = 1;
		customer.City = "İstanbul";
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager.Save();
		customerManager.Delete();
		customerManager.GiveCredit();
		
		Company company = new Company();
		company.TaxNumber = "1123187362";
		company.CompanyName = "Arçelik";
		company.id = 100;
		
		CustomerManager customerManager2 = new CustomerManager(new Company(), new TeacherCreditManager());
		customerManager2.GiveCredit();
		
		Person person = new Person();
		person.NationalIdentity = "123456789";
		
		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();
		
	}

}












