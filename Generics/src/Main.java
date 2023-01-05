import java.util.ArrayList;
import java.util.List;

public class Main {

    static <X extends List> void duplicate(X list) {
        list.addAll(list);
    }

    static double sumOfNumberList(List<? extends Number> numbers){
        double sum = 0.0;
        for (Number number:numbers){
            sum += number.doubleValue();
        }
        return sum;
    }

    static void addValues(List<? super Number> numbers){
        numbers.add(1);
        numbers.add(1.0);
        numbers.add(1l);
        numbers.add(1.0f);
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(List.of(1, 2, 3));
        duplicate(nums);
        System.out.println(sumOfNumberList(nums));

        List emptyList = new ArrayList<>();
        addValues(emptyList);
        System.out.println(emptyList);

        MyCustomList<String> myCustomList = new MyCustomList<>();
        myCustomList.addElement("Element 1");
        myCustomList.addElement("Element 2");
        String value = myCustomList.get(0);
        System.out.println(value);

        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(2);
        list2.addElement(3);
        Integer num = list2.get(1);
        System.out.println(num);
    }
}