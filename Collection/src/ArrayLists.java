import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

  public static void main(String[] args) {
    List<String> list1 = List.of("Yak", "Zebra");
    List<String> list2 = new ArrayList<String>();
    list2.addAll(list1);
    list2.set(1, "Fish");
    list2.remove(1);
    list2.add("Bunny");
    System.out.println(list2);
    System.out.println(list1);
  }
}
