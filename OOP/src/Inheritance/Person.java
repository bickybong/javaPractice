package Inheritance;

public class Person {

  private String name;
  private String email;
  private int phoneNumber;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String toString() {
    return name + "/ " + email + "/ " + phoneNumber;
  }
}
