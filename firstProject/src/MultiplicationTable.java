public class MultiplicationTable {

  public static void main(String[] args) {
    MultiplicationTable table = new MultiplicationTable();
    table.print();
  }

  void print() {
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
    }
  }
}
