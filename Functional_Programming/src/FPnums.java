import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPnums {
    public static void main(String[] args) {
        List<Integer> nums = List.of(2, 5, 9, 3, 4, 26, 3, 9);

        Integer max = nums.stream()
                .filter(getIntegerPredicate())
                .max(Integer::compare)
                .orElse(0);
        System.out.println(max);

//        sumFPodd(nums);
//        sumNums(nums);
//        FPoperations(nums);
//        printSquares();
//        printLowerCase();
//        printLength();
//        maxNum(nums);
//        minNum(nums);
//        newOddList(nums);
//        squaredList(nums);
    }

    private static Comparator<Integer> getIntegerComparator() {
        return (n1, n2) -> Integer.compare(n1, n2);
    }

    private static Predicate<Integer> getIntegerPredicate() {
        return n -> n % 2 == 0;
    }

    private static void squaredList(List<Integer> nums) {
        List squaredList = nums.stream()
                .map(e -> e*e)
                .collect(Collectors.toList());
        System.out.println(squaredList);
    }

    private static void newOddList(List<Integer> nums) {
        List newNumsOdd = nums.stream()
                .filter(e -> e%2 == 1)
                .collect(Collectors.toList());
        System.out.println(newNumsOdd);
    }

    private static void maxNum(List<Integer> nums) {
        int max = nums.stream()
                .max(getIntegerComparator())
                .get();
        System.out.println(max);
    }private static void minNum(List<Integer> nums) {
        int min = nums.stream()
                .min(getIntegerComparator())
                .get();
        System.out.println(min);
    }

    private static void printLength() {
        List.of("Apple", "Ant", "Bat").stream()
                .map(s -> s.length())
                .forEach(e -> System.out.println(e));
    }

    private static void printLowerCase() {
        List.of("Apple", "Ant", "Bat").stream()
                .map(s -> s.toLowerCase())
                .forEach(e -> System.out.println(e));
    }

    private static void printSquares() {
        IntStream.range(1, 11)
                .map(e -> (e * e))
                .forEach(e -> System.out.println(e));
    }

    private static void FPoperations(List<Integer> nums) {
        nums.stream()
                .sorted() //sort
                .distinct() //only show distinct elements
                .map(e -> e * e) //square elements
                .forEach(e -> System.out.println(e));
    }

    private static void sumFPodd(List<Integer> nums) {
        int sum = nums.stream()
                .filter(ele -> ele % 2 == 1)
                .reduce(0,
                        (number1, number2) -> number1 + number2
                );
//        lambda expression, shortcut method
        System.out.println(sum);
    }

    private static void sumNums(List<Integer> nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println(sum);
    }
}
