// 2016111540 이주영

package builder;

public class User {
	private final String firstName; // required
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional
    
    public static class Builder {
    	// required parameters
    	private final String firstName;
        private final String lastName;
        
        // optional parameters
        private int age = 0;
        private String phone = "";
        private String address = "";
        
        public Builder(String firstName, String lastName) {
        	this.firstName = firstName;
        	this.lastName = lastName;
        }
        
        public Builder setAge(int val) {
        	age = val;
        	return this;
        }
        
        public Builder setPhone(String val) {
        	phone = val;
        	return this;
        }
        
        public Builder setAddress(String val) {
        	address = val;
        	return this;
        }
        
        public User build() {
        	return new User(this);
        }
    }
    
    private User(Builder builder) {
    	firstName = builder.firstName;
    	lastName = builder.lastName;
    	age = builder.age;
    	phone = builder.phone;
    	address = builder.address;
    }
    
    @Override
	public String toString() {
		return "firstName = " + firstName + "\nlastName = " + lastName + "\nage = " + age
				+ "\nphone = " + phone + "\naddress = " + address;
	}
}
