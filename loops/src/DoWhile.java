import java.util.Scanner;

public class DoWhile {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = 0;
    do {
      if (num >= 0) {
        System.out.println("Cube is " + (num * num * num));
      }
      System.out.println("Enter a number: ");
      num = scanner.nextInt();
    } while (num >= 0);
    System.out.println("Thank you! Have fun!");
  }
}
