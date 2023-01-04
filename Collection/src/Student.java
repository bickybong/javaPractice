import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student> {

  @Override
  public int compare(Student s1, Student s2) {
    return Integer.compare(s1.getId(), s2.getId());
  }
}

public class Student implements Comparable<Student> {

  private int id;
  private String name;

  public static void main(String[] args) {
    List<Student> students = List.of(
      new Student(1, "Rango"),
      new Student(20, "Adam"),
      new Student(3, "Eve")
    );
    List<Student> studentsAL = new ArrayList<>(students);
    Collections.sort(studentsAL);
    System.out.println("Desc" + studentsAL);

    studentsAL.sort(new AscendingStudentComparator());
    System.out.println("Asc" + studentsAL);
  }

  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String toString() {
    return id + " " + name;
  }

  @Override
  public int compareTo(Student that) { //sorting
    return Integer.compare(that.id, this.id);
  }
}
