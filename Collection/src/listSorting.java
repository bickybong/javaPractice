import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listSorting {

  public static void main(String[] args) {
    List<Integer> nums = List.of(23, 54, 94, 87);
    List<Integer> numsAL = new ArrayList<>(nums);

    Collections.sort(numsAL);
    System.out.println(numsAL);
  }
}
