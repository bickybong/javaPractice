package Customer;

public class Customer {

  // state
  private String name;
  private Address homeAddress;
  private Address workAddress;

  //   creating
  public Customer(String name, Address homeAddress) {
    this.name = name;
    this.homeAddress = homeAddress;
  }

  public static void main(String[] args) {
    Address bobAddressHome = new Address("111", "Tampines", "572048");
    Customer cus1 = new Customer("bob", bobAddressHome);
    Address bobAddressWork = new Address("211", "Tampines", "572048");
    cus1.setWorkAddress(bobAddressWork);
    System.out.println(cus1);
  }

  //   operations
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address getHomeAddress() {
    return this.homeAddress;
  }

  public void setHomeAddress(Address homeAddress) {
    this.homeAddress = homeAddress;
  }

  public Address getWorkAddress() {
    return this.workAddress;
  }

  public void setWorkAddress(Address workAddress) {
    this.workAddress = workAddress;
  }

  public String toString() {
    return String.format(
      "name - [%s] home address - [%s] work address - [%s]",
      name,
      homeAddress,
      workAddress
    );
  }
}
