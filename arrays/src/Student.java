import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

  private static String name;
  private static ArrayList<Integer> marks = new ArrayList<Integer>();

  public Student(String name, int... marks) {
    Student.name = name;
    for (int mark : marks) {
      Student.marks.add(mark);
    }
  }

  public static void main(String[] args) {
    Student stu1 = new Student("Sam", 62, 43, 83, 90);

    Student stu2 = new Student("Adam", 62, 33, 23, 98, 34);

    int number = stu1.getNumberOfMarks();
    System.out.println("number of marks is " + number);

    int sum = stu1.getTotalSumOfMarks();
    System.out.println("sum of marks is " + sum);

    int max = stu1.getMaximumMark();
    System.out.println("max of marks is " + max);

    int min = stu1.getMinimumMarks();
    System.out.println("min of marks is " + min);

    BigDecimal ave = stu1.getAverageAMarks();
    System.out.println("average of marks is " + ave);

    stu1.addNewMark(43);
    stu1.removeMark(2);
    System.out.println(stu1);
  }

  private void removeMark(int i) {
    marks.remove(i);
  }

  private void addNewMark(int i) {
    marks.add(i);
  }

  private BigDecimal getAverageAMarks() {
    int sum = getMaximumMark();
    int total = getNumberOfMarks();
    return new BigDecimal(sum)
      .divide(new BigDecimal(total), 3, RoundingMode.UP);
  }

  private int getMinimumMarks() {
    return Collections.min(marks);
  }

  private int getMaximumMark() {
    return Collections.max(marks);
  }

  private int getTotalSumOfMarks() {
    int sum = 0;
    for (int mark : marks) {
      sum += mark;
    }
    return sum;
  }

  private int getNumberOfMarks() {
    return marks.size();
  }

  public String toString() {
    return name + marks;
  }
}
