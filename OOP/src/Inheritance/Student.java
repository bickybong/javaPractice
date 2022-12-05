package Inheritance;

public class Student extends Person {

  private String collegeName;
  private int year;

  public Student(String name) {
    super(name);
  }

  public static void main(String[] args) {
    Student student = new Student("Ranga");

    Person per1 = new Person("ggs");
    per1.setEmail("gg@gmail.com");
    per1.setPhoneNumber(754743783);
    System.out.println(per1);
  }

  public String getCollegeName() {
    return this.collegeName;
  }

  public void setCollegeName(String collegeName) {
    this.collegeName = collegeName;
  }

  public int getYear() {
    return this.year;
  }

  public void setYear(int year) {
    this.year = year;
  }
}
