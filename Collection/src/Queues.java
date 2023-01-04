import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {

  class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
      // TODO Auto-generated method stub
      return Integer.compare(o2.length(), o1.length());
    }
  }

  public static void main(String[] args) {
    Queue<String> q = new PriorityQueue<>();
    q.addAll(List.of("123", "12", "3753", "6"));
    System.out.println(q.poll());
    System.out.println(q.poll());
    System.out.println(q.poll());
    System.out.println(q.poll());
  }
}
