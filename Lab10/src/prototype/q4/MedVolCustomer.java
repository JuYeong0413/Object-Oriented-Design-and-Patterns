package prototype.q4;

public class MedVolCustomer extends Customer {

	private String type = "medium";
	private String companyName;
	private String customerName;
    private double transaction;
	
	public MedVolCustomer(String companyName, String customerName) {
		this.companyName = companyName;
		this.customerName = customerName;
	}
	
	@Override
	Customer clone(String companyName, String customerName) {
		return new MedVolCustomer(companyName, customerName);
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public double getTransaction() {
    	return transaction;
    }
    
    public void setTransaction(double transaction) {
    	this.transaction = transaction;
    }

}
