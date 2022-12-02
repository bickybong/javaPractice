package Inheritance;

public class Employee extends Person {

  private String title;
  private String employer;
  private int employeeGrade;
  private int Salary;

  public Employee(
    String name,
    String title,
    String employer,
    int employeeGrade,
    int Salary
  ) {
    super(name);
    this.title = title;
    this.employer = employer;
    this.employeeGrade = employeeGrade;
    this.Salary = Salary;
  }

  public static void main(String[] args) {
    Employee emp1 = new Employee("john", "Cleaner", "Poppt", 3, 2000);
    emp1.setEmail("gg@gmail.com");
    emp1.setPhoneNumber(754743783);
    System.out.println(emp1);
  }

  public String toString() {
    return ( //super to use the inheritance method
      super.toString() +
      String.format(
        " Title - %s, Employer - %s, Grade - %d, Salary - %d",
        title,
        employer,
        employeeGrade,
        Salary
      )
    );
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getEmployer() {
    return this.employer;
  }

  public void setEmployer(String employer) {
    this.employer = employer;
  }

  public int getEmployeeGrade() {
    return this.employeeGrade;
  }

  public void setEmployeeGrade(int employeeGrade) {
    this.employeeGrade = employeeGrade;
  }

  public int getSalary() {
    return this.Salary;
  }

  public void setSalary(int Salary) {
    this.Salary = Salary;
  }
}
