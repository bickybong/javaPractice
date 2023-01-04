import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {

  public static void main(String[] args) {
    List<String> list1 = List.of("Yak", "Zebra");
    List<String> list2 = new ArrayList<>(list1);
    list2.set(1, "Fish");
    list2.add("Bunny");
    list2.add("Punny");
    System.out.println(list2.indexOf("Bunny"));
    // list2.remove(1);
    // System.out.println(list2);

    Iterator<String> iterator = list2.iterator();
    while (iterator.hasNext()) {
      if (iterator.next().endsWith("ny")) {
        iterator.remove();
      }
    } //removing words ending with ay from list2
    // Looping thru 3 methods
    // for (String word : list2) {
    //   System.out.println(word);
    // }

    // for (int i = 0; i < list2.size(); i++) {
    //   System.out.println(list2.get(i));
    // }

    // Iterator wordsIterator = list2.iterator();
    // while (wordsIterator.hasNext()) {
    //   System.out.println(wordsIterator.next());
    // }
  }
}
