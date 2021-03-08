//Basics 3
public class Name {
  private String firstName;
  private String middleName;
  private String lastName;
  boolean hasMiddleName;

  public Name(String fName, String mName, String lName) {
		firstName = fName;
		middleName = mName;
		lastName = lName;
		hasMiddleName = true;
  }

  public Name(String fName, String lName) {
		firstName = fName;
        lastName = lName;
        hasMiddleName = false;
  }
  
  public String getFirstName() { return firstName; }
  public String getMiddleName() { return middleName; }
  public String getLastName() { return lastName; }
  
  public void setFirstName(String fn) {
	  firstName = fn;
  }
  public void setMiddleName(String mn) {
	   middleName = mn;
  }
  public void setLastName(String ln) {
	  lastName = ln;
  }
  
  public String getFirstAndLastName() {
		return firstName + " " + lastName;
  }
  
  public String getLastCommaFirst() { return lastName + ", "+ firstName; }
  
  public String getInits() {
        String inits;

		if (!hasMiddleName) inits = firstName.substring(0, 1) + lastName.substring(0, 1);
		else inits = firstName.substring(0, 1) + middleName.charAt(0) + lastName.substring(0, 1);

		return inits;
  }

  public String getNameLine() {
        if (!hasMiddleName) return getFirstAndLastName();
        else return firstName + " " + middleName.charAt(0) + " " + lastName;
  }

  public int getNameLength() {
      if (!hasMiddleName) return (firstName + lastName).length();
      else return (firstName + middleName + lastName).length();
  }
}

