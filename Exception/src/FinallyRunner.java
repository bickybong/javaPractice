import java.util.Scanner;

public class FinallyRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int[] numbers = {6, 2, 3, 6, 7};
            int number = numbers[5]; //exception

        } catch (Exception e) {
            e.printStackTrace(); //print exception
        } finally { //always executed
            if (scanner != null) {
                System.out.println("Before Scanner closed");
                scanner.close();
            }
        }
    }
}
