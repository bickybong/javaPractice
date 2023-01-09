import java.util.List;

public class FunctionalProgramming {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
        List<Integer> nums = List.of(1, 2, 3, 4, 5);

        printListFilter(list);
        printFPList(list);
        evenPrintFPnum(nums);
        oddPrintFPnum(nums);
    }

    private static void evenPrintFPnum(List<Integer> nums) {
        nums.stream()
                .filter(element -> element%2 == 0)
                .forEach(element -> System.out.println(element));
    }private static void oddPrintFPnum(List<Integer> nums) {
        nums.stream()
                .filter(element -> element%2 == 1)
                .forEach(element -> System.out.println(element));
    }

    private static void printListFilter(List<String> list) {
        for (String str : list) {
            if (str.endsWith("at")) {
                System.out.println(str);
            }
        }
    }

    private static void printFPList(List<String> list) {
        list.stream()
                .filter(
                        element -> element.endsWith("at")
                )
                .forEach(
                        element -> System.out.println("element - " + element)
                );
    }
}

