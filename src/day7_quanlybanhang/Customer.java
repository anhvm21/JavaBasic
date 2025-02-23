package day7_quanlybanhang;

public class Customer {
	private String customerId;
	private String customerName;
	private String customerAddress;

	public void addCustomer(String id, String name, String address) {
		customerId = id;
		customerName = name;
		customerAddress = address;
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

}
