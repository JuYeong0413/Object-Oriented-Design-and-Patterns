package prototype.q4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class OfficeProcess {

	Scanner sc = new Scanner(System.in);
	
    private String companyName;
    private String type;
    private HashMap<String, Customer> customerMap = new HashMap<String, Customer>();
    private List<Customer> customers = new ArrayList<Customer>();

    public void register() {
    	LoVolCustomer loCustomer = new LoVolCustomer(null, null);
        MedVolCustomer medCustomer = new MedVolCustomer(null, null);
        HiVolCustomer hiCustomer = new HiVolCustomer(null, null);

        customerMap.put("low", loCustomer);
        customerMap.put("medium", medCustomer);
        customerMap.put("high", hiCustomer);
    }
    
    public void setCompanyName() {
        System.out.println("Enter company name");
        this.companyName = sc.nextLine();
        System.out.println("Now the application would collect lots more company information ....");
        System.out.println();
    }

    public void setType() {
        System.out.println("Please pick a type of customer from one of the following:('medium' will be assumed otherwise)");
        System.out.println("low");
        System.out.println("medium");
        System.out.println("high");
        this.type = sc.nextLine();
        System.out.println();
    }

    public void setCustomer() {
        System.out.println("Client does some work .....\n");
        System.out.println("Client calls on the application of Prototype pattern .....");
        System.out.println("Enter Customer names or '-quit'");
        
        while (true) {
        	String input = sc.nextLine();
        	
        	if (input.equals("-quit")) break;
        	
        	System.out.println("... more interaction to get information about " + input + "... : Stored in database");
            Customer customer = this.createCustomer(input);
            customers.add(customer);
        }
        
        System.out.println();
        System.out.println("The customers entered during this session:");
        for (int i = 0; i < customers.size(); i++) {
        	String type = customers.get(i).getType();
        	type = type.replace(type.charAt(0), Character.toUpperCase(type.charAt(0)));
            
        	System.out.println("Customer "+ customers.get(i).getCustomerName() +
            				   ", an employee of " + customers.get(i).getCompanyName() +
            				   ". Spending category: " + type + " volume. Lots more ....");
        }
        
        System.out.println();
        System.out.println("Client does more work...");
    }
    
    public Customer createCustomer(String customerName) {
        return ((Customer)(customerMap.get(type))).clone(companyName, customerName);
    }
    
    public void printInvoice() {
    	for (int i = 0; i < customers.size(); i++) {
        	String type = customers.get(i).getType();
            
        	switch (type) {
        		case "high":
        			double transaction = customers.get(i).getTransaction();
        			if (transaction >= 2000) {
        				transaction = transaction * 0.05;
            			System.out.println(customers.get(i).getCustomerName() + " of " + customers.get(i).getCompanyName() + "; " +
            							   "deduct $" + String.format("%,.2f", transaction) + " from paycheck; ...");
        			}
        			else if (transaction < 50) {
        				transaction = transaction * 1.05;
            			System.out.println(customers.get(i).getCustomerName() + " of " + customers.get(i).getCompanyName() + "; " +
            							   "add $" + String.format("%,.2f", transaction) +
            							   " from paycheck because the annual transaction amount is less than $50; ...");
        			}
        			break;
        		case "low":
        			System.out.println(customers.get(i).getCustomerName() + " of " + customers.get(i).getCompanyName() + "; " +
				   			   		   "add $10.00 for service fee for this year; ...");
        			break;
        		case "medium":
        			if (customers.get(i).getTransaction() < 30) {
        				System.out.println(customers.get(i).getCustomerName() + " of " + customers.get(i).getCompanyName() + "; " +
 				   			   			   "removed because the annual transaction amount is less than $30; ...");
        			}
        			break;
        		default:
        			break;
        	}
        	
        }
    }
    
}
