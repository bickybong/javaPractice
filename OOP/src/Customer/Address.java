package Customer;

public class Address { //Linked to customer

  private String line1;
  private String city;
  private String zip;

  public Address(String line1, String city, String zip) {
    this.line1 = line1;
    this.city = city;
    this.zip = zip;
  }

  public String toString() {
    return line1 + " " + city + " " + zip;
  }
}