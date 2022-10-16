
public class Product {
	
	public Product(int id, String firstName, String lastName, int number, String kod) {
		System.out.println("Yapıcı blok çalıştı.");
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.kod = kod;
	}
	
	private int id;
	private String firstName;
	private String lastName;
	private int number;
	private String kod;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getKod() {
		return this.firstName.substring(0,2) + id;
	}
	public void setKod(String kod) {
		this.kod = kod;
	}
	
	
	
	
}
