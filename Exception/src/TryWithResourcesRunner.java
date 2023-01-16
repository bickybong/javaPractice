import java.util.Scanner;

public class TryWithResourcesRunner {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { //if error happens it auto closes
            int[] numbers = {6, 2, 3, 6, 7};
            int number = numbers[5]; //exception

        }
    }
}
