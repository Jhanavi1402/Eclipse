package TNS.B09;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerCity;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCustomerId() {
		return customerId;
	}
	
	public Customer(int customerId, String customerName, String customerCity) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerCity = customerCity;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	
}