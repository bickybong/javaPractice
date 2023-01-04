import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetsExercise {

  public static void main(String[] args) {
    List<Character> ch = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
    Set<Character> hash = new HashSet<>(ch);
    Set<Character> lhash = new LinkedHashSet<>(ch);
    Set<Character> thash = new TreeSet<>(ch);
    System.out.println("either insertion or sorted hash" + hash);
    System.out.println("insertion order link" + lhash);
    System.out.println("sorted order tree" + thash);
  }
}
