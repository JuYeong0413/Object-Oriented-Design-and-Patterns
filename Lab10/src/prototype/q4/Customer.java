package prototype.q4;

abstract class Customer {
	
    private String companyName;
    private String type;
    private String customerName;
    private double transaction;
    
    abstract Customer clone(String companyName, String customerName);
    
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
