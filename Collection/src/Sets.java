import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

  public static void main(String[] args) {
    Set<String> set = Set.of("Apple", "Banana", "Cat");
    Set<String> hashset = new HashSet<>(set);
    hashset.add("Apple");
    // System.out.println(hashset);

    // Set<Integer> nums = new HashSet<>();
    // nums.add(123);
    // nums.add(12);
    // nums.add(1);
    // nums.add(1234);
    // System.out.println(nums);

    // Set<Integer> numsl = new LinkedHashSet<>();
    // numsl.add(534);
    // numsl.add(535);
    // numsl.add(533);
    // numsl.add(530);
    // System.out.println(numsl);

    Set<Integer> numst = new TreeSet<>();
    numst.add(4);
    numst.add(5);
    numst.add(3);
    numst.add(1);
    System.out.println(((TreeSet<Integer>) numst).subSet(2, true, 5, true));
    System.out.println(((TreeSet<Integer>) numst).headSet(2));
  }
}
