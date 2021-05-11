/**
 * @author Anca Foia
 * @CCAC CIT-111-Z03
 * 05/10/2021
 * 
 * Array of objects
 * Use an array to store a phone contact list
 */

package objectifiedarrays;

public class Person {
  private String firstName;
  private String lastName;
  private String phoneNumber;

  public Person() {
    firstName = "";
    lastName = "";
    phoneNumber = "";
  }

  public Person(String fn, String ln, String phone) {
    firstName = fn;
    lastName = ln;
    phoneNumber = phone;
  }

  public String getName() {
    return firstName + " " + lastName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setFirstName(String fn) {
    firstName = fn;
  }

  public void setLastName(String ln) {
    lastName = ln;
  }

  public void setPhoneNumber(String phone) {
    phoneNumber = phone;
  }
}
